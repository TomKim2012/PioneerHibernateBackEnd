package com.tomkimani.hibenate.pioneer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Groups {
	@Id @GeneratedValue
	private int groupId;
	private String groupName;
	private String description;
	
	@ManyToMany
	@JoinTable(name= "usergroup", 
	   joinColumns= {@JoinColumn(name="groupId")},
	   inverseJoinColumns={@JoinColumn(name="userId")})
	private List<User> users = new ArrayList<User>();
	
	private boolean isArchived;
	
	public boolean isArchived() {
		return isArchived;
	}
	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
