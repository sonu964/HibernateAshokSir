package com.jspiders.student.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="Student")
public class StudentDTO  implements Serializable{
	
	@GenericGenerator(name="myid", strategy="increment")
	@GeneratedValue(generator="myid")
	
	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="stName")
	private String stName;
	
	@Column(name="stEmail")
	private String stEmail;
	
	@Column(name="stDept")
	private String stDept;
	
	@Column(name="stPhoneNum")
	private long stPhoneNum;
	
	@Column(name="stPercentag")
	private double stPercentag;
	
	public StudentDTO() {
		
		System.out.println("StudentDTO object created");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStEmail() {
		return stEmail;
	}

	public void setStEmail(String stEmail) {
		this.stEmail = stEmail;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	public long getStPhoneNum() {
		return stPhoneNum;
	}

	public void setStPhoneNum(long stPhoneNum) {
		this.stPhoneNum = stPhoneNum;
	}

	public double getStPercentag() {
		return stPercentag;
	}

	public void setStPercentag(double stPercentag) {
		this.stPercentag = stPercentag;
	}
	
	
	public String toString(){
		
		return stName+" "+stEmail+" "+stPhoneNum;
	}
	

}
