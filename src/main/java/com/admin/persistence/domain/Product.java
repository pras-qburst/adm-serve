package com.admin.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Product Entity
 * 
 * @author prasanth
 *
 */

@Entity
@Table(name = "product")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -840955705062404468L;

	/**
	 * PRODUCT ID
	 */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long productId;

	/**
	 * Product name
	 */
	@Column(name = "name")
	private String name = "";

	/**
	 * Category ID associated with Product
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;

	
	/**
	 * Mailing Contact Name
	 */
	@Column(name = "mailing_contact_name")
	private String mailingContactName;

	/**
	 * Mailing Email Id
	 */
	@Column(name = "mailing_email_id")
	private String mailingEmailId;

	/**
	 * Mailing Contact Number
	 */
	@Column(name = "mailing_contact_number")
	private String mailingContactNumber;

	/**
	 * Mailing Address
	 */
	@Column(name = "mailing_address")
	private String mailingAddress;

	/**
	 * Mailing Postal Code
	 */
	@Column(name = "mailing_postal_code")
	private String mailingPostalCode;

	

	/**
	 * Activation status
	 */
	@Column(name = "activation_status")
	private String activationStatus;



	/**
	 * BO status. Status is UPLOADED when BO file is uploaded to DB. The status
	 * changes as and when maker or checker amends BO
	 */
	@Column(name = "product_status")
	private String productStatus;

	
	/**
	 * Logo path
	 */
	@Column(name = "logo_path")
	private String logopath;
	
	/**
	 * Description
	 */
	@Column(name = "description")
	private String description;

	

	/**
	 * @return the boId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param boId
	 *            the boId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * @return the boName
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param boName
	 *            the boName to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @return the mailingContactName
	 */
	public String getMailingContactName() {
		return mailingContactName;
	}

	/**
	 * @param mailingContactName
	 *            the mailingContactName to set
	 */
	public void setMailingContactName(String mailingContactName) {
		this.mailingContactName = mailingContactName;
	}

	/**
	 * @return the mailingEmailId
	 */
	public String getMailingEmailId() {
		return mailingEmailId;
	}

	/**
	 * @param mailingEmailId
	 *            the mailingEmailId to set
	 */
	public void setMailingEmailId(String mailingEmailId) {
		this.mailingEmailId = mailingEmailId;
	}

	/**
	 * @return the mailingContactNumber
	 */
	public String getMailingContactNumber() {
		return mailingContactNumber;
	}

	/**
	 * @param mailingContactNumber
	 *            the mailingContactNumber to set
	 */
	public void setMailingContactNumber(String mailingContactNumber) {
		this.mailingContactNumber = mailingContactNumber;
	}

	/**
	 * @return the mailingAddress
	 */
	public String getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress
	 *            the mailingAddress to set
	 */
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	/**
	 * @return the mailingPostalCode
	 */
	public String getMailingPostalCode() {
		return mailingPostalCode;
	}

	/**
	 * @param mailingPostalCode
	 *            the mailingPostalCode to set
	 */
	public void setMailingPostalCode(String mailingPostalCode) {
		this.mailingPostalCode = mailingPostalCode;
	}

	
	

	/**
	 * @return the activationStatus
	 */
	public String getActivationStatus() {
		return activationStatus;
	}

	/**
	 * @param activationStatus
	 *            the activationStatus to set
	 */
	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getLogopath() {
		return logopath;
	}

	public void setLogopath(String logopath) {
		this.logopath = logopath;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductStatus() {
		return productStatus;
	}

	public void setBoStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (productId ^ (productId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
