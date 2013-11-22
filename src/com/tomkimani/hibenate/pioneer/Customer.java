package com.tomkimani.hibenate.pioneer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id @GeneratedValue
	private int customerId;
	@Column(nullable=false)
	private String Refno;
	@Column(nullable=false)
	private String idNo;
	@Column(nullable=false)
	private String mobileNo;
	
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	
	@OneToMany(targetEntity=Transaction.class, 
			   mappedBy="customer", cascade=CascadeType.ALL)
	List<Transaction> transactions = new ArrayList<>(); 

	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getRefno() {
		return Refno;
	}
	public void setRefno(String refno) {
		Refno = refno;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
