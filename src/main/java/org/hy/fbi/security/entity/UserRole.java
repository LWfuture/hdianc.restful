package org.hy.fbi.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hy.foundation.common.entity.jpa.BasicEntity;


@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserRole extends BasicEntity
{

	private String name;
	
	private String funcPrivilege;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFuncPrivilege() {
		return funcPrivilege;
	}

	public void setFuncPrivilege(String funcPrivilege) {
		this.funcPrivilege = funcPrivilege;
	}
}
