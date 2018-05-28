package com.jspiders.student.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.student.DTO.StudentDTO;
import com.singleton.util.SingletonFactory;

public class StudentDAO {

	SessionFactory factory = SingletonFactory.getFactory();
	Session session = factory.openSession();


	/*// insert DTO object
	public void save(StudentDTO sd){



		Transaction tx = session.beginTransaction();

		try{
			session.save(sd);
			tx.commit();
		}catch(HibernateException he){
			he.printStackTrace();
		}finally{

			session.close();
			factory.close();
		}


	}

	// // to get one DTO by providing email
	public StudentDTO getStudentByEmail(String  email){

		System.out.println("getStudentByEamil statred");

		String hql = "From StudentDTO where stEmail = '" +email+"'";

		Query query = session.createQuery(hql);
		StudentDTO stFromDB = (StudentDTO)query.uniqueResult();

		System.out.println("getStudentByEamil ended");



		 return stFromDB;
	}


	// to get all DTO 

	public List<StudentDTO> getAllStudent(){

		List<StudentDTO> stList = null;
		System.out.println("getAll studentDTO started...");

		String hql = "From StudentDTO";


		try{

			Query query = session.createQuery(hql);
			 stList = query.list();
		}catch(HibernateException he){

			he.printStackTrace();
		}finally{

			session.close();
		}


		System.out.println("getAll studentDTO ended..");
		return stList;
	}







	// to get Name and Percentage columns only from Single DTO 

	public void getNameAndPercentageByEmail(String email){


		System.out.println("getNamePercentage started");

		Object[] objArr = null;

		String hql = "select S.stName, S.stPercentag from "
				+ "StudentDTO S "
				+ "where S.stEmail = '" +email+"'";

		try{

			Query query = session.createQuery(hql);
			 objArr = (Object[])query.uniqueResult();
		}catch(HibernateException he){

			he.printStackTrace();

		}finally{

			session.close();
		}	
			for(Object ob : objArr){

				System.out.println(ob);
			}




		System.out.println("getNamePercentage ended");

	}


	// to get Name and Percentage columns from all DTO

	public void getAllNameAndPercentage(){

		System.out.println("getAllNamePercentage started");

		List<Object[]> objList = null;

		String hql = "select S.stName, S.stPercentag from "
				+ "StudentDTO S ";
		Session session = factory.openSession();


try{

			Query query = session.createQuery(hql);
			 objList = query.list();
		}catch(HibernateException he){

			he.printStackTrace();
		}finally{

			session.close();
		}
		for(Object[] obArr : objList){

			for(Object ob : obArr){
				System.out.println(ob);
				System.out.println("--------");
			}
		}



		System.out.println("getAllNamePercentage ended");

	}





	// update percentage of a DTO by using email
	public int updatePercentageByEmail(String email, Double perc){


		System.out.println("Update started");

		int res = 0;
		String hql = "update StudentDTO S set S.stPercentag = " +perc+" Where S.stEmail = '"+email+"'";
		String hql = "update Student S set S.stPercentag = :pr "
				+ " where S.stEmail = :em";


		Session session = factory.openSession();

try{

			Query query = session.createQuery(hql);
			 res = query.executeUpdate();
		}catch(HibernateException he){

			he.printStackTrace();
		}finally{

			session.close();
		}



		Session session = factory.openSession();

		try{

					Query query = session.createQuery(hql);
					query.setParameter("pr", perc);
					query.setParameter("em", email);
					 res = query.executeUpdate();
				}catch(HibernateException he){

					he.printStackTrace();
				}finally{

					session.close();
				}


		System.out.println("Update ended..");

		return res;

	}



	 */



	public StudentDTO getStudentDtoByUsingEmail(String email){

		System.out.println("getStudentDtoByUsingEmail started..");
		String hql = "From StudentDTO where stEmail = '"+email+"'";

		Query query = session.createQuery(hql);
		StudentDTO stDto = (StudentDTO)query.uniqueResult();

		System.out.println("getStudentDtoByUsingEmail ended..");
		return stDto;
	}
	// to get 2 column of DTO class
	public void getNameAndPercentageByUsingEmail(String email){

		String hql = "select S.stName, S.stPercentag From StudentDTO S "
				+ "where stEmail = '"+email+"'";

		Object [] objArr = null;

		try{
			Query query = session.createQuery(hql);

			objArr = (Object[]) query.uniqueResult();
		}catch(HibernateException e){

			e.printStackTrace();
		}finally {

			session.close();
		}

		for(Object obj : objArr){

			System.out.print(obj+" ");
		}
		System.out.println();	

	}

	public void getAllNameAndDept(){

		List<Object[]> listArrObj = null;
		String hql = "select stName, stDept from StudentDTO ";

		try{
			Query query = session.createQuery(hql);

			listArrObj = query.list();
			
		}catch(HibernateException e){

			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		for(Object[] objArr : listArrObj){
			
			for(Object obj : objArr){
				
				System.out.print(obj+" ");
			}
			
			System.out.println();
			
		}
	}


public List<StudentDTO> getAllStudentDTO(){
	
	String hql = "From StudentDTO ";
	
	List<StudentDTO> listSt = null;
	
	try{
		
		Query query = session.createQuery(hql);
		
		listSt = query.list();
		
	}catch(HibernateException e){
		
		e.printStackTrace();
	}finally{
		
		session.close();
	}
	
	
	
	
	return listSt;
}


public int updateColumnByUsingEmail(String email, String columnName){
	
	String hql = "update StudentDTO set stName = ' "+columnName+"'" +" where stEmail = '"+email+"'";
	
	int rowAffected = 0;
	try{
		
		Query query = session.createQuery(hql);
		
		 rowAffected = query.executeUpdate();
		
		
	}catch(HibernateException e){
		
		e.printStackTrace();
	}finally{
		
		session.close();
	}
	
	return rowAffected;
}



}
