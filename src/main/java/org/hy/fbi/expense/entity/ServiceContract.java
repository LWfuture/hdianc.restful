package org.hy.fbi.expense.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hy.foundation.common.entity.jpa.BasicEntity;

/**
 * ServiceContract entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "service_contract", catalog = "oa_db")
public class ServiceContract extends BasicEntity {

	// Fields
	@Column(name = "contract_no")
	private String contractNo;
	@Column(name = "project_no", length = 15)
	private String projectNo;
	@Column(name = "project_name", length = 40)
	private String projectName;
	@Column(name = "sales_name", length = 10)
	private String salesName;
	@Column(name = "sales_dept", length = 10)
	private String salesDept;
	@Column(name = "state", length = 10)
	private String state;
	@Column(name = "type", length = 10)
	private String type;
	@Column(name = "start_date", length = 19)
	private String startDate;
	@Column(name = "end_date", length = 19)
	private String endDate;
	@Column(name = "service_days", precision = 8, scale = 1)
	private Double serviceDays;
	@Column(name = "timestamp", length = 19)
	private String timestamp;

	// Constructors

	/** default constructor */
	public ServiceContract() {
	}

	/** minimal constructor */
	public ServiceContract(String contractNo) {
		this.setContractNo(contractNo);
	}

	/** full constructor */
	public ServiceContract(String contractNo, String projectNo,
			String projectName, String salesName, String salesDept,
			String state, String type, String startDate, String endDate,
			Double serviceDays, String timestamp) {
		this.setContractNo(contractNo);
		this.projectNo = projectNo;
		this.projectName = projectName;
		this.salesName = salesName;
		this.salesDept = salesDept;
		this.state = state;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
		this.serviceDays = serviceDays;
		this.timestamp = timestamp;
	}

	// Property accessors
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

 

	
	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	public String getSalesName() {
		return this.salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	
	public String getSalesDept() {
		return this.salesDept;
	}

	public void setSalesDept(String salesDept) {
		this.salesDept = salesDept;
	}

	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	
	public Double getServiceDays() {
		return this.serviceDays;
	}

	public void setServiceDays(Double serviceDays) {
		this.serviceDays = serviceDays;
	}

	
	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the contractNo
	 */
	public String getContractNo() {
		return contractNo;
	}

	/**
	 * @param contractNo the contractNo to set
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

}