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

@Entity
public class Allocation {
	
	@Id @GeneratedValue
	private int allocation_id;
	@Temporal(TemporalType.DATE)
	private Date allocation_date;
	@Temporal(TemporalType.TIME)
	private Date allocation_time;
	
	@ManyToOne
	@JoinColumn(name="allocatedBy")
	private User allocatedBy;
	
	@ManyToOne
	@JoinColumn(name="allocatedTo")
	private User allocatedTo;
	
	@OneToOne
	@JoinColumn(name="terminalId")
	private Terminal terminal;
	
	private Date deallocation_date;
	private Date deallocation_time;
	
	@ManyToOne
	@JoinColumn(name="deallocatedBy")
	private User deallocatedBy;
	
	public User getAllocatedTo() {
		return allocatedTo;
	}
	public void setAllocatedTo(User allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
	public int getAllocation_id() {
		return allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		this.allocation_id = allocation_id;
	}
	public Date getAllocation_date() {
		return allocation_date;
	}
	public void setAllocation_date(Date allocation_date) {
		this.allocation_date = allocation_date;
	}
	public Date getAllocation_time() {
		return allocation_time;
	}
	public void setAllocation_time(Date allocation_time) {
		this.allocation_time = allocation_time;
	}
	public Date getDeallocation_date() {
		return deallocation_date;
	}
	public void setDeallocation_date(Date deallocation_date) {
		this.deallocation_date = deallocation_date;
	}
	public Date getDeallocation_time() {
		return deallocation_time;
	}
	public void setDeallocation_time(Date deallocation_time) {
		this.deallocation_time = deallocation_time;
	}
	public User getAllocatedBy() {
		return allocatedBy;
	}
	public void setAllocatedBy(User allocatedBy) {
		this.allocatedBy = allocatedBy;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public User getDeallocatedBy() {
		return deallocatedBy;
	}
	public void setDeallocatedBy(User deallocatedBy) {
		this.deallocatedBy = deallocatedBy;
	}
	
}
