package org.hy.fbi.security.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hy.foundation.common.entity.jpa.BasicEntity;



/**
帐号
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserAccount extends BasicEntity {
	
	/**
   帐号
	 */
	private String username;

	/**
   真实姓名
	 */
	private String name;

	/**
   密码
	 */
	private String password;

	/**
   管理员类型
	 */
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="userType_id")
	@NotFound(action=NotFoundAction.IGNORE)
	private UserRole userRole;

	/**
   登陆次数
	 */
	private Integer loginTimes;

	/**
   错误登陆次数
	 */
	private Integer errLoginTimes;

	/**
   最后登录时间
	 */
	private Integer lastLoginTime;

	/**
   最后错误登录时间
	 */
	private Integer lastErrLoginTime;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	// --------------------------------------- getter and setter -----------------------------------------------------------------
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Integer getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}

	public Integer getErrLoginTimes() {
		return errLoginTimes;
	}

	public void setErrLoginTimes(Integer errLoginTimes) {
		this.errLoginTimes = errLoginTimes;
	}

	public Integer getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Integer lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLastErrLoginTime() {
		return lastErrLoginTime;
	}

	public void setLastErrLoginTime(Integer lastErrLoginTime) {
		this.lastErrLoginTime = lastErrLoginTime;
	}

}
