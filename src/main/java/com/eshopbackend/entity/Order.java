package com.eshopbackend.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "`Order`")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "primaryEmail")
	private String primaryEmail;
	
	@Column(name = "shipaddress1")
	private String ship_address1;
	
	@Column(name = "ship_address2")
	private String ship_address2;
	
	@Column(name = "ship_country")
	private String ship_country;
	
	@Column(name = "ship_state")
	private String ship_state;
	
	@Column(name = "ship_zip")
	private String ship_zip;
	
	@Column(name = "orderKeyId")
	private String orderKeyId;
	
	@Column(name = "orderCount")
	private int orderCount;
	
	@Column(name = "productOrderid")
	private Long productOrderid;
	
	
  @Column(name = "date_created", nullable= false)
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@Column(name = "last_updated", nullable= false)
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	
	public Order() {}

	public Order(Long id, String firstName, String lastName, String primaryEmail, String ship_address1,
			String ship_address2, String ship_country, String ship_state, String ship_zip, String orderKeyId,
			int orderCount, Long productOrderid, LocalDateTime dateCreated, LocalDateTime lastUpdated) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.primaryEmail = primaryEmail;
		this.ship_address1 = ship_address1;
		this.ship_address2 = ship_address2;
		this.ship_country = ship_country;
		this.ship_state = ship_state;
		this.ship_zip = ship_zip;
		this.orderKeyId = orderKeyId;
		this.orderCount = orderCount;
		this.productOrderid = productOrderid;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getShip_address1() {
		return ship_address1;
	}

	public void setShip_address1(String ship_address1) {
		this.ship_address1 = ship_address1;
	}

	public String getShip_address2() {
		return ship_address2;
	}

	public void setShip_address2(String ship_address2) {
		this.ship_address2 = ship_address2;
	}

	public String getShip_country() {
		return ship_country;
	}

	public void setShip_country(String ship_country) {
		this.ship_country = ship_country;
	}

	public String getShip_state() {
		return ship_state;
	}

	public void setShip_state(String ship_state) {
		this.ship_state = ship_state;
	}

	public String getShip_zip() {
		return ship_zip;
	}

	public void setShip_zip(String ship_zip) {
		this.ship_zip = ship_zip;
	}

	public String getOrderKeyId() {
		return orderKeyId;
	}

	public void setOrderKeyId(String orderKeyId) {
		this.orderKeyId = orderKeyId;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public Long getProductOrderid() {
		return productOrderid;
	}

	public void setProductOrderid(Long productOrderid) {
		this.productOrderid = productOrderid;
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
		return "Order [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", primaryEmail="
				+ primaryEmail + ", ship_address1=" + ship_address1 + ", ship_address2=" + ship_address2
				+ ", ship_country=" + ship_country + ", ship_state=" + ship_state + ", ship_zip=" + ship_zip
				+ ", orderKeyId=" + orderKeyId + ", orderCount=" + orderCount + ", productOrderid=" + productOrderid
				+ ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + "]";
	}

	
	
		
		
		
}
