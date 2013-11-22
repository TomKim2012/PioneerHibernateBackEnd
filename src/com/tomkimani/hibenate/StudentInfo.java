package com.tomkimani.hibenate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="STUDENT_INFORMATION")
public class StudentInfo {

	@Id @GeneratedValue
	private int roll_no;
	
	@Column(name="FULL_NAME", nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date Birthdate;

	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthdate() {
		return Birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
}
