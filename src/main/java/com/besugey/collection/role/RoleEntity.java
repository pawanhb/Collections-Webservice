package com.besugey.collection.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class RoleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="ROLE_TYPE", nullable=false)
	private String roleType;
	
	
	@Column(name="ROLE_DESC")
	private String roleDesc;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRoleType() {
		return roleType;
	}


	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}


	public String getRoleDesc() {
		return roleDesc;
	}


	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}


	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", roleType=" + roleType + ", roleDesc=" + roleDesc + "]";
	}
	
	
}
