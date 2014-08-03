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
 * PgApplication entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pg_application", catalog = "oa_db")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class PgApplication extends BasicEntity {
	
	// Fields
	
	@Column(name = "apply_no", nullable = false, length = 15)
	private String applyNo;
	
	@Column(name = "submitter_id", length = 10)
	private String submitterId;
	
	@Column(name = "submit_remark", length = 100)
	private String submitRemark;
	
	@Column(name = "contract_number", length = 25)
	private String contractNumber;
	
	@Column(name = "project_number", length = 25)
	private String projectNumber;
	
	@Column(name = "project_name", length = 30)
	private String projectName;
	
	@Column(name = "address", length = 40)
	private String address;
	
	@Column(name = "linkman", length = 8)
	private String linkman;
	
	@Column(name = "telephone", length = 15)
	private String telephone;
	
	@Column(name = "job_description", length = 200)
	private String jobDescription;
	
	@Column(name = "product_type", length = 4)
	private String productType;
	
	@Column(name = "service_type", length = 4)
	private String serviceType;
	
	@Column(name = "service_mode", length = 4)
	private String serviceMode;
	
	@Column(name = "service_date", length = 19)
	private String serviceDate;
	
	@Column(name = "service_months")
	private int serviceMonths;
	@Column(name = "service_days")
	private int serviceDays;
	@Column(name = "service_hours")
	private int serviceHours;
	
	@Column(name = "service_dept", length = 10)
	private String serviceDept;
	
	@Column(name = "service_manager_id", length = 10)
	private String serviceManagerId;
	
	@Column(name = "manage_remark", length = 100)
	private String manageRemark;

	@Column(name = "state")
	private Integer state;
	
	@Column(name = "timestamp")
	private String timestamp;
	
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

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getSubmitterId() {
		return submitterId;
	}

	public void setSubmitterId(String submitterId) {
		this.submitterId = submitterId;
	}

	public String getSubmitRemark() {
		return submitRemark;
	}

	public void setSubmitRemark(String submitRemark) {
		this.submitRemark = submitRemark;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceMode() {
		return serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public int getServiceMonths() {
		return serviceMonths;
	}

	public void setServiceMonths(int serviceMonths) {
		this.serviceMonths = serviceMonths;
	}

	public int getServiceDays() {
		return serviceDays;
	}

	public void setServiceDays(int serviceDays) {
		this.serviceDays = serviceDays;
	}

	public int getServiceHours() {
		return serviceHours;
	}

	public void setServiceHours(int serviceHours) {
		this.serviceHours = serviceHours;
	}

	public String getServiceDept() {
		return serviceDept;
	}

	public void setServiceDept(String serviceDept) {
		this.serviceDept = serviceDept;
	}

	public String getServiceManagerId() {
		return serviceManagerId;
	}

	public void setServiceManagerId(String serviceManagerId) {
		this.serviceManagerId = serviceManagerId;
	}

	public String getManageRemark() {
		return manageRemark;
	}

	public void setManageRemark(String manageRemark) {
		this.manageRemark = manageRemark;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
 
	public String getTimestamp() {
		return timestamp;
	}


}