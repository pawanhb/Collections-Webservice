package com.besugey.collection.loan;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.besugey.collection.loanstatus.LoanStatusEntity;
import com.besugey.collection.users.UserEntity;

@Entity
@Table(name="LOAN")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="ACCOUNT_ID", nullable=false)
	private String accountId;
	
	public Loan () {}
	
	@OneToOne
	@JoinColumn(name="CUSTOMER_ID", referencedColumnName="ID", nullable = false)
	private UserEntity customer; 
		
	@Column(name="DISBURSE_DATE", nullable=false)
	private Date disburseDate;
	
	@Column(name="DUE_DATE", nullable=false)
	private String dueDate;
	
	@Column(name="PENALTY")
	private BigDecimal feePenalty;
	
	@Column(name="INTEREST_DUE")
	private BigDecimal interestDue;
	
	@Column(name="INTEREST_PAID")
	private BigDecimal interestPaid;
	
	@Column(name="OFFICE_NAME")
	private String OfficeName;
	
	@Column(name="EMI_NUMBER")
	private Integer emiNumber;
	
	@Column(name="PRINCIPAL_DUE")
	private BigDecimal principalDue;
	
	@Column(name="PRINCIPAL_PAID")
	private BigDecimal principalPaid;
	
	@OneToOne
	@JoinColumn(name="LOAN_STATUS", referencedColumnName="ID", nullable = false)
	private LoanStatusEntity loanStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public UserEntity getCustomer() {
		return customer;
	}

	public void setCustomer(UserEntity customer) {
		this.customer = customer;
	}

	public Date getDisburseDate() {
		return disburseDate;
	}

	public void setDisburseDate(Date disburseDate) {
		this.disburseDate = disburseDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getFeePenalty() {
		return feePenalty;
	}

	public void setFeePenalty(BigDecimal feePenalty) {
		this.feePenalty = feePenalty;
	}

	public BigDecimal getInterestDue() {
		return interestDue;
	}

	public void setInterestDue(BigDecimal interestDue) {
		this.interestDue = interestDue;
	}

	public BigDecimal getInterestPaid() {
		return interestPaid;
	}

	public void setInterestPaid(BigDecimal interestPaid) {
		this.interestPaid = interestPaid;
	}

	public String getOfficeName() {
		return OfficeName;
	}

	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	public Integer getEmiNumber() {
		return emiNumber;
	}

	public void setEmiNumber(Integer emiNumber) {
		this.emiNumber = emiNumber;
	}

	public BigDecimal getPrincipalDue() {
		return principalDue;
	}

	public void setPrincipalDue(BigDecimal principalDue) {
		this.principalDue = principalDue;
	}

	public BigDecimal getPrincipalPaid() {
		return principalPaid;
	}

	public void setPrincipalPaid(BigDecimal principalPaid) {
		this.principalPaid = principalPaid;
	}

	public LoanStatusEntity getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatusEntity loanStatus) {
		this.loanStatus = loanStatus;
	}

}
