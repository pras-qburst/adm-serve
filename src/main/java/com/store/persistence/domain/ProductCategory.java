package com.store.persistence.domain;

/**
 * Product Category Entity
 * 
 * @author Prasanth Pai
 * 
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3172359718137768129L;

	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private long categoryId;

	@Column(name = "category_description")
	private String categoryDescription;

	@Column(name = "display_order")
	private String displayOrder;

	@Column(name = "display_logo")
	private String displayLogo;

	@Column(name = "show_display")
	private String showDisplay;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getDisplayLogo() {
		return displayLogo;
	}

	public void setDisplayLogo(String displayLogo) {
		this.displayLogo = displayLogo;
	}

	public String getShowDisplay() {
		return showDisplay;
	}

	public void setShowDisplay(String showDisplay) {
		this.showDisplay = showDisplay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (categoryId ^ (categoryId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProductCategory other = (ProductCategory) obj;
		if (categoryId != other.categoryId) {
			return false;
		}
		return true;
	}

}
