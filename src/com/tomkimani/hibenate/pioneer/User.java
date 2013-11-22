package com.tomkimani.hibenate.pioneer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id @GeneratedValue
	private int userId;
	@Column(nullable=false)
	private String userName;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;

	@OneToMany(targetEntity=Allocation.class, 
			   mappedBy="allocatedTo", cascade=CascadeType.ALL)
	private List<Allocation> allocates = new ArrayList<>();
	
	@OneToMany(targetEntity=Allocation.class, 
			   mappedBy="deallocatedBy", cascade=CascadeType.ALL)
	private List<Allocation> deAllocates = new ArrayList<>();
	
	@OneToMany(targetEntity=Allocation.class, 
			   mappedBy="allocatedBy", cascade=CascadeType.ALL)
	private List<Allocation> allocatedBy = new ArrayList<>();
	
	@OneToMany(targetEntity=Transaction.class, 
			   mappedBy="user")
	private List<Transaction> transactions = new ArrayList<>();
	
	@Column(nullable=false)
	private String password;
	
	
	@Column(length=100)
	private String email;
	
	private boolean isArchived;
	
	@ManyToMany
	@JoinTable(name= "usergroup", 
			   joinColumns= {@JoinColumn(name="userId")},
			   inverseJoinColumns={@JoinColumn(name="groupId")})
	private List<Groups> groups = new ArrayList<Groups>();
	
	public User(){
		this.isArchived=false;
	}
	
	public List<Allocation> getAllocation() {
		return allocates;
	}
	public void setAllocation(List<Allocation> allocation) {
		this.allocates = allocation;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public List<Groups> getGroups() {
		return groups;
	}

	public List<Allocation> getAllocatedBy() {
		return allocatedBy;
	}

	public void setAllocatedBy(List<Allocation> allocatedBy) {
		this.allocatedBy = allocatedBy;
	}

	public void setGroups(List<Groups> groups) {
		this.groups = groups;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public List<Allocation> getAllocates() {
		return allocates;
	}

	public void setAllocates(List<Allocation> allocates) {
		this.allocates = allocates;
	}

	public List<Allocation> getDeAllocates() {
		return deAllocates;
	}

	public void setDeAllocates(List<Allocation> deAllocates) {
		this.deAllocates = deAllocates;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	/*
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	*/
}

