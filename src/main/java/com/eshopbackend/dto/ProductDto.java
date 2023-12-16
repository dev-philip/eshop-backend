package com.eshopbackend.dto;

import java.math.BigDecimal;

public class ProductDto {private Long id;
	private String productLink;
	private String addToCartImg;
	private String defaultImg;
	private String hoverImg;
	private String productName;
	private BigDecimal productPrice;
	private String currency;
	private boolean isDiscount;
	private BigDecimal discountPrice;
	private boolean isLabel;
	private String label;
	private String labelClass;
	private String category;
	private String size;
	private String productDescription;
	private String productCount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductLink() {
		return productLink;
	}
	public void setProductLink(String productLink) {
		this.productLink = productLink;
	}
	public String getAddToCartImg() {
		return addToCartImg;
	}
	public void setAddToCartImg(String addToCartImg) {
		this.addToCartImg = addToCartImg;
	}
	public String getDefaultImg() {
		return defaultImg;
	}
	public void setDefaultImg(String defaultImg) {
		this.defaultImg = defaultImg;
	}
	public String getHoverImg() {
		return hoverImg;
	}
	public void setHoverImg(String hoverImg) {
		this.hoverImg = hoverImg;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public boolean isDiscount() {
		return isDiscount;
	}
	
	public boolean getIsDiscount() {  
        return isDiscount;
    }
	public void setIsDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}
//	public boolean isLabel() {
//		return isLabel;
//	}
	public boolean getIsLabel() {
	    return isLabel;
	}

	public void setIsLabel(boolean isLabel) {
	    this.isLabel = isLabel;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabelClass() {
		return labelClass;
	}
	public void setLabelClass(String labelClass) {
		this.labelClass = labelClass;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	
	
	
	

}
