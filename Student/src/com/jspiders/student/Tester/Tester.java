package com.jspiders.student.Tester;

import java.util.Iterator;
import java.util.List;

import org.hibernate.cfg.annotations.*;

import com.jspiders.student.DAO.StudentDAO;
import com.jspiders.student.DTO.StudentDTO;

public class Tester {

	public static void main(String[] args) {

		
		System.out.println("main method started");

		
		
		StudentDTO st1 = new StudentDTO();
	
		//st1.setId(1);
		st1.setStName("Sonu");
		st1.setStDept("CSE");
		st1.setStEmail("sonu@gmail.com");
		st1.setStPhoneNum(8371922307L);
		st1.setStPercentag(60.75);
		
		StudentDAO dao = new StudentDAO();
		
		/*// to insert dto in database
		//dao.save(st1);
		
		
		
		
		// to get student dto by using email
		//StudentDTO dto = dao.getStudentByEmail("shashi@gmail.com");
	//	System.out.println(dto.getId()+" "+ dto.getStName()+" "+dto.getStEmail());
		
		
		
		
		List<StudentDTO> stList = dao.getAllStudent();
		
		for(StudentDTO list : stList){
			
			System.out.println(list.getStEmail());
		}
		
		
		
		
		
		// to fatch Name and Percentage 
		//dao.getNameAndPercentageByEmail("aryan@gmail.com");
		
		
		
		
		// to get all Name and percentage of all the object
	//	dao.getAllNameAndPercentage();
		
		
		//Update percentage by using Email
		int res = dao.updatePercentageByEmail("shashi@gmail.com", 50.25);
		System.out.println("Rows affected "+res);
		
*/		
		
		
		/*StudentDTO stDto = dao.getStudentDtoByUsingEmail("sonu@gmail.com");
		System.out.println(stDto.getStName()+" "+stDto.getId()+" "+stDto.getStPercentag());
		*/
		
		
		//dao.getNameAndPercentageByUsingEmail("sonu@gmail.com");
		
		//dao.getAllNameAndDept();
		
		/*List<StudentDTO> listSt = dao.getAllStudentDTO();
		
		Iterator<StudentDTO> itr = listSt.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		*/
		
		
		int rowAffected = dao.updateColumnByUsingEmail("sonu@gmail.com","Vicky");
		System.out.println("Row Affected " +rowAffected);
		
		
		
		
		System.out.println("main method ended");
	}

}
