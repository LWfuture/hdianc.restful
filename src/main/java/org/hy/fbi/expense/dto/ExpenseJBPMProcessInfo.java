package org.hy.fbi.expense.dto;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ExpenseJBPMProcessInfo {
	private String processID;
	private Integer processInstanceId;
	private Integer taskID;
	private String amount;//金额
	private String actor;//执行者
	private String countersignFlag;//会签标识，‘0’表示不会签，‘1’标识会签。
	private String applyUser;//报销单申请人
	private String refuseReason;//驳回理由
	private String flowState;//流程状态
	private String approveCode;//
	private String acctCode;//科目
	private String companyCode;//公司代码
	private String deptCode;//部门代码
	private String contractIOFlag;//合同内外标识
	private String backRefuseFlag;//申请人审批时，是否回退到驳回人，“true”是，“false”否
	private String backRefuseActor;//驳回执行者
	private String billCode;
	
	private Map<String,String> amountMap;
	
	public String getProcessID() {
		return processID;
	}
	public void setProcessID(String processID) {
		this.processID = processID;
	}
	public Integer getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(Integer processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public Integer getTaskID() {
		return taskID;
	}
	public void setTaskID(Integer taskID) {
		this.taskID = taskID;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getCountersignFlag() {
		return countersignFlag;
	}
	public void setCountersignFlag(String countersignFlag) {
		this.countersignFlag = countersignFlag;
	}
	public String getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	public String getRefuseReason() {
		return refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getFlowState() {
		return flowState;
	}
	public void setFlowState(String flowState) {
		this.flowState = flowState;
	}
	public String getApproveCode() {
		return approveCode;
	}
	public void setApproveCode(String approveCode) {
		this.approveCode = approveCode;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public Map<String, String> getAmountMap() {
		return amountMap;
	}
	public void setAmountMap(Map<String, String> amountMap) {
		this.amountMap = amountMap;
	}
	public String getContractIOFlag() {
		return contractIOFlag;
	}
	public void setContractIOFlag(String contractIOFlag) {
		this.contractIOFlag = contractIOFlag;
	}
	public String getBackRefuseFlag() {
		return backRefuseFlag;
	}
	public void setBackRefuseFlag(String backRefuseFlag) {
		this.backRefuseFlag = backRefuseFlag;
	}
	public String getBackRefuseActor() {
		return backRefuseActor;
	}
	public void setBackRefuseActor(String backRefuseActor) {
		this.backRefuseActor = backRefuseActor;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	
	
}
