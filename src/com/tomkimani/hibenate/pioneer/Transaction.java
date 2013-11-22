package com.tomkimani.hibenate.pioneer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="transactions")
public class Transaction {
	
	@Id @GeneratedValue
	private int transaction_id;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="terminalId")
	private Terminal terminal;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	private int transaction_amount;
	private String transaction_code;
	private String transaction_type;
	
	@Temporal(TemporalType.DATE)
	private Date transaction_date;
	@Temporal(TemporalType.TIME)
	private Date transaction_time;
	
	
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(Date transaction_time) {
		this.transaction_time = transaction_time;
	}	
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(int transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getTransaction_code() {
		return transaction_code;
	}
	public void setTransaction_code(String transaction_code) {
		this.transaction_code = transaction_code;
	}
	
	
}
