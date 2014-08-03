package org.hy.fbi.expense.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hy.foundation.common.entity.jpa.BasicEntity;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
//@Entity
//@Table(name = "user_info", catalog = "oa_db")
@Entity
@Table(name = "user_info")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserInfo extends BasicEntity {

	// Fields

//	private Integer id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String telephone;
	@Column(name = "employee_no")
	private String employeeNo;
	private String dept;
	private String role;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String username, String password, String email,
			String telephone) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
	}

	/** full constructor */
	public UserInfo(String username, String password, String name,
			String email, String telephone, String employeeNo, String dept,
			String role) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.employeeNo = employeeNo;
		this.dept = dept;
		this.role = role;
	}

	// Property accessors
//	@Id
//	@GeneratedValue(strategy = IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
//	public Integer getId() {
//		return this.id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// --------------------------------------- getter and setter
	// -----------------------------------------------------------------
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	

	@Column(name = "username", nullable = false, length = 10)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telephone", nullable = false, length = 15)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	public String getEmployeeNo() {
		return this.employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	@Column(name = "dept", length = 10)
	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Column(name = "role", length = 10)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}