package com.besugey.collection.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.besugey.collection.role.RoleEntity;

@Entity
@Table(name="Users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="USER_NAME", nullable=false)
	private String userName;
	
	
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	
	
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;
	
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@Column(name="USER_EMAIL", nullable=false)
	private String userEmail;
	
	@OneToOne
	@JoinColumn(name="ROLE_ID", referencedColumnName="ID")
	private RoleEntity role;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", userEmail=" + userEmail+ "]";
	}
	
	
	
	
	
	

}
