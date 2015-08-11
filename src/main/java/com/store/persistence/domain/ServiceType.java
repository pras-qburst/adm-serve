package com.store.persistence.domain;

/**
 * @author Prasanth Pai
 * 
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_type")
public class ServiceType {

	@Id
	@Column(name = "service_type_id")
	private String serviceTypeId;

	@Column(name = "service_type_name")
	private String serviceTypeName;

	@Column(name = "service_type_short_name")
	private String serviceTypeShortName;

	@Column(name = "service_type_status")
	private String serviceTypeStatus;

	@Column(name = "product_id")
	private String productId;

	public String getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(String serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getServiceTypeName() {
		return serviceTypeName;
	}

	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	public String getServiceTypeShortName() {
		return serviceTypeShortName;
	}

	public void setServiceTypeShortName(String serviceTypeShortName) {
		this.serviceTypeShortName = serviceTypeShortName;
	}

	public String getServiceTypeStatus() {
		return serviceTypeStatus;
	}

	public void setServiceTypeStatus(String serviceTypeStatus) {
		this.serviceTypeStatus = serviceTypeStatus;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
