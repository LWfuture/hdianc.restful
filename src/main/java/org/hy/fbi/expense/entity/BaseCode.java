package org.hy.fbi.expense.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hy.foundation.common.entity.jpa.BasicEntity;

/**
 * 
 * @ClassName	ELevel
 * @Description	TODO
 * @author 		liuwei
 * @date		2013-11-1 上午9:40:42
 * @version
 */
@Entity
@Table(name = "base_code")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class BaseCode extends BasicEntity {
	@Id
	@Column(name = "fid")
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

	@Column(name = "purpose_code")
	protected String purposeCode;
	@Column(name = "purpose_name")
	protected String purpose_name;
	@Column(name = "value")
	protected String value;
	@Column(name = "text")
	protected String text;

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getPurpose_name() {
		return purpose_name;
	}

	public void setPurpose_name(String purpose_name) {
		this.purpose_name = purpose_name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	

}