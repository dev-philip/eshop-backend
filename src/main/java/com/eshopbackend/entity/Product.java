package com.eshopbackend.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	@JsonIgnoreProperties("products") // Add this annotation
	private ProductCategory category;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "discountPrice")
	private BigDecimal discountPrice;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "primaryImageUrl")
	private String primaryImageUrl;
	
	@Column(name = "hoverImageUrl")
	private String hoverImageUrl;
	
	@Column(name = "addToCartImageUrl")
	private String addToCartImageUrl;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "date_created")
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@Column(name = "last_updated")
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	
	public Product() {}

	public Product(Long id, ProductCategory category, String sku, String name, String description, BigDecimal unitPrice,
			int unitsInStock, BigDecimal discountPrice, String size, String currency, String label, String primaryImageUrl,
			String hoverImageUrl, String addToCartImageUrl, boolean active, LocalDateTime dateCreated, LocalDateTime lastUpdated) {
		super();
		this.id = id;
		this.category = category;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.discountPrice = discountPrice;
		this.size = size;
		this.currency = currency;
		this.label = label;
		this.primaryImageUrl = primaryImageUrl;
		this.hoverImageUrl = hoverImageUrl;
		this.addToCartImageUrl = addToCartImageUrl;
		this.active = active;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPrimaryImageUrl() {
		return primaryImageUrl;
	}

	public void setPrimaryImageUrl(String primaryImageUrl) {
		this.primaryImageUrl = primaryImageUrl;
	}

	public String getHoverImageUrl() {
		return hoverImageUrl;
	}

	public void setHoverImageUrl(String hoverImageUrl) {
		this.hoverImageUrl = hoverImageUrl;
	}

	public String getAddToCartImageUrl() {
		return addToCartImageUrl;
	}

	public void setAddToCartImageUrl(String addToCartImageUrl) {
		this.addToCartImageUrl = addToCartImageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", sku=" + sku + ", name=" + name + ", description="
				+ description + ", unitPrice=" + unitPrice + ", unitsInStock=" + unitsInStock + ", discountPrice="
				+ discountPrice + ", size=" + size + ", currency=" + currency + ", label=" + label
				+ ", primaryImageUrl=" + primaryImageUrl + ", hoverImageUrl=" + hoverImageUrl + ", addToCartImageUrl="
				+ addToCartImageUrl + ", active=" + active + ", dateCreated=" + dateCreated + ", lastUpdated="
				+ lastUpdated + "]";
	}

	
	
	
	
	

}
