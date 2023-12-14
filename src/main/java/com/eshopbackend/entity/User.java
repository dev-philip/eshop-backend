package com.eshopbackend.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName", nullable= false)
	private String firstName;
	
	@Column(name = "lastName", nullable= false)
    private String lastName;
    
	@Column(name = "email", nullable= false, unique = true)
    private String email;
    
	@Column(name = "password", nullable= false)
    private String password;
    
    @Column(name = "date_created", nullable= false)
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name = "last_updated", nullable= false)
	@UpdateTimestamp
	private Date lastUpdated;
    
    
    public User() {}
    
    
	public User(long id, String firstName, String lastName, String email, String password, Date dateCreated,
			Date lastUpdated) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + "]";
	}
    
	

}
