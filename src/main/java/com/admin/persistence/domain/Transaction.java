package com.admin.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	/**
	 * Transaction ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txn_id")
	private long txnId;

	@Column(name = "biller_name")
	private String billerName;

	@Column(name = "txn_date")
	private Date txnDate;

	@Column(name = "delivery_channel")
	private String channel;

	@Column(name = "transaction_id")
	private String transactionId;

	@Column(name = "sub_transaction_id")
	private String subTransactionId;

	@Column(name = "bill_number")
	private String billNumber;

	@Column(name = "bill_reference_number")
	private String billRefNo;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "due_date")
	private Date dueDate;

	@Column(name = "product_bank_code")
	private String productBankCode;

	@Column(name = "product_branch_code")
	private String productBranchCode;

	@Column(name = "product_account_number")
	private String productAccountNumber;

	@Column(name = "paid_amount")
	private String paidAmount;

	@Column(name = "bank_product_id")
	private String bankProductId;

	@Column(name = "trans_type")
	private String transType;

	@Column(name = "txn_type")
	private String txnType;

	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "resp_desc")
	private String respDesc;

	@Column(name = "consumer_number")
	private String consumerNumber;

	@Column(name = "service_type_id")
	private String serviceTypeId;

	@Column(name = "address_1")
	private String address1;

	@Column(name = "address_2")
	private String address2;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "consumer_number_flag")
	private String consumerNumberFlag;

	@Column(name = "reserved1")
	private String reserved1;

	@Column(name = "reserved2")
	private String reserved2;

	@Column(name = "reserved3")
	private String reserved3;

	@Column(name = "reserved4")
	private String reserved4;

	@Column(name = "reserved5")
	private String reserved5;

	@Column(name = "reserved6")
	private String reserved6;

	@Column(name = "reserved7")
	private String reserved7;

	@Column(name = "reserved8")
	private String reserved8;

	@Column(name = "reserved9")
	private String reserved9;

	@Column(name = "reserved10")
	private String reserved10;

	@Column(name = "response_code")
	private String responseCode;

	/**
	 * @return the txnId
	 */
	public long getTxnId() {
		return txnId;
	}

	/**
	 * @param txnId
	 *            the txnId to set
	 */
	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	/**
	 * @return the txnDate
	 */
	public Date getTxnDate() {
		return txnDate;
	}

	/**
	 * @param txnDate
	 *            the txnDate to set
	 */
	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel
	 *            the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionNo() {
		return transactionId;
	}

	/**
	 * @param transactionId
	 *            the transactionId to set
	 */
	public void setTransactionNo(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the paidAmount
	 */
	public String getPaidAmount() {
		return paidAmount;
	}

	/**
	 * @param paidAmount
	 *            the paidAmount to set
	 */
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	/**
	 * @return the billRefNo
	 */
	public String getBillRefNo() {
		return billRefNo;
	}

	/**
	 * @param billRefNo
	 *            the billRefNo to set
	 */
	public void setBillRefNo(String billRefNo) {
		this.billRefNo = billRefNo;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the bankProductId
	 */
	public String getBankProductId() {
		return bankProductId;
	}

	/**
	 * @param bankProductId
	 *            the bankproductId to set
	 */
	public void setBankProductId(String bankProductId) {
		this.bankProductId = bankProductId;
	}

	/**
	 * 
	 * @return billerName
	 */
	public String getBillerName() {
		return billerName;
	}

	/**
	 * 
	 * @param billerName
	 */
	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	/**
	 * 
	 * @return transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * 
	 * @param transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * 
	 * @return subTransactionId
	 */
	public String getSubTransactionId() {
		return subTransactionId;
	}

	/**
	 * 
	 * @param subTransactionId
	 */

	public void setSubTransactionId(String subTransactionId) {
		this.subTransactionId = subTransactionId;
	}

	/**
	 * 
	 * @return billNumber
	 */

	public String getBillNumber() {
		return billNumber;
	}

	/**
	 * 
	 * @param billNumber
	 */
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * 
	 * @return dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * 
	 * @param dueDate
	 */

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * 
	 * @return productBankCode
	 */
	public String getProductBankCode() {
		return productBankCode;
	}

	/**
	 * 
	 * @param productBankCode
	 */
	public void setProductBankCode(String productBankCode) {
		this.productBankCode = productBankCode;
	}

	/**
	 * 
	 * @return productBranchCode
	 */
	public String getProductBranchCode() {
		return productBranchCode;
	}

	public void setProductBranchCode(String productBranchCode) {
		this.productBranchCode = productBranchCode;
	}

	public String getProductAccountNumber() {
		return productAccountNumber;
	}

	public void setProductAccountNumber(String productAccountNumber) {
		this.productAccountNumber = productAccountNumber;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public String getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public String getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(String serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getConsumerNumberFlag() {
		return consumerNumberFlag;
	}

	public void setConsumerNumberFlag(String consumerNumberFlag) {
		this.consumerNumberFlag = consumerNumberFlag;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	public String getReserved5() {
		return reserved5;
	}

	public void setReserved5(String reserved5) {
		this.reserved5 = reserved5;
	}

	public String getReserved6() {
		return reserved6;
	}

	public void setReserved6(String reserved6) {
		this.reserved6 = reserved6;
	}

	public String getReserved7() {
		return reserved7;
	}

	public void setReserved7(String reserved7) {
		this.reserved7 = reserved7;
	}

	public String getReserved8() {
		return reserved8;
	}

	public void setReserved8(String reserved8) {
		this.reserved8 = reserved8;
	}

	public String getReserved9() {
		return reserved9;
	}

	public void setReserved9(String reserved9) {
		this.reserved9 = reserved9;
	}

	public String getReserved10() {
		return reserved10;
	}

	public void setReserved10(String reserved10) {
		this.reserved10 = reserved10;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
}
