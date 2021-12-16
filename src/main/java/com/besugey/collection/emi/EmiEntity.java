package com.besugey.collection.emi;

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

import com.besugey.collection.loan.Loan;

@Entity
@Table(name="EMI")
public class EmiEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@OneToOne()
	@JoinColumn(name="LOAN_ID", referencedColumnName="ID", nullable = false)
	private Loan loan;
	
	@Column(name="EMI_DUE_DATE", nullable=false)
	private Date emiDueDate;

	@Column(name="EMI_NUMBER")
	private Long emiNumber;

	@Column(name="TOTAL_EMI_DUE")
	private Long totalEMIDue;
	
	@Column(name="EMI_AMOUNT")
	private BigDecimal emiAmount;
	
	@Column(name="PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name="EMI_ADJUSTMENT_REQUIRED")
	private Boolean emiAdjustmentRequired;
	
	@Column(name="EMI_ADJUSTMENT_AMT")
	private BigDecimal emiAdjustmentAmt;
	
	@Column(name="CHEQUE_NUMBER")
	private String chequeNumber;
	
	@Column(name="PAYEE_BANK_NAME")
	private String payeeBankName;
	
	@Column(name="EMI_STATUS")
	private String emiStatus;
	
	@Column(name="EMI_PAYMENT_STATUS")
	private String emiPaymentStatus;
	
	
}
