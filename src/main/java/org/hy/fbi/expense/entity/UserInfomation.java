package org.hy.fbi.expense.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hy.foundation.common.entity.jpa.BasicEntity;

/*
 ###Java Code Generate###
 userinfomation
 Create by User(EMAIL) 2013/10/30 14:31:11
 用户信息表

 userinfomation(用户信息表)
 ------------------------------------
 userid(编号)             PKString
 username(名称)           String(30)
 password(密码)           String(20)
 name(姓名)               String(8)
 user_number1(员工编码1)  String(20)
 user_number2(员工编码2)  String(20)
 area(地区)               String(10)
 department(部门)         String(20)
 post                     String(20)
 telephone(电话)          String(11)
 e_mail(email)            String(30)
 permission(权限)         String(5)
 */

/* 用户信息表 */
@Entity
@Table(name = "user_info")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserInfomation extends BasicEntity {
	/*@Column(name = "userid")
	protected String userid;*/
	@Column(name = "username")
	protected String username;
	@Column(name = "password")
	protected String password;
	@Column(name = "name")
	protected String name;
	@Column(name = "user_number1")
	protected String userNumber1;
	@Column(name = "user_number2")
	protected String userNumber2;
	@Column(name = "area")
	protected String area;
	/*@Column(name = "department")
	protected String department;*/
	@Column(name = "post")
	protected String post;
	@Column(name = "telephone")
	protected String telephone;
	@Column(name = "e_mail")
	protected String eMail;
	@Column(name = "permission")
	protected String permission;
	protected String start;


	public UserInfomation() {
	}

	@Id
	@Column(name = "userid")
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

	// 编号
	/*public String getUserid() {
		return userid;
	}

	public void setUserid(String value) {
		this.userid = value;
	}*/

	// 名称
	public String getUsername() {
		return username;
	}

	public void setUsername(String value) {
		this.username = value;
	}

	// 密码
	public String getPassword() {
		return password;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	// 姓名
	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	// 员工编码1 2
	 
	// 地区
	public String getArea() {
		return area;
	}

	public void setArea(String value) {
		this.area = value;
	}

//	// 部门
//	
//	@ManyToOne(fetch=FetchType.EAGER)	
//	@JoinColumn(name = "dapartment",referencedColumnName="level")	
//	@ForeignKey(name = "dapartment")
//	@NotFound(action=NotFoundAction.IGNORE)
//	private ELevel elevel;
//	
//	public ELevel getElevel() {
//		return elevel;
//	}
//
//	public void setElevel(ELevel elevel) {
//		this.elevel = elevel;
//	}

	public String getPost() {
		return post;
	}

	public void setPost(String value) {
		this.post = value;
	}

	// 电话
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String value) {
		this.telephone = value;
	}

	// email
 

	// 权限
	public String getPermission() {
		return permission;
	}

	public String getUserNumber1() {
		return userNumber1;
	}

	public void setUserNumber1(String userNumber1) {
		this.userNumber1 = userNumber1;
	}

	public String getUserNumber2() {
		return userNumber2;
	}

	public void setUserNumber2(String userNumber2) {
		this.userNumber2 = userNumber2;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setPermission(String value) {
		this.permission = value;
	}

	
	//用户在线状态
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
}
