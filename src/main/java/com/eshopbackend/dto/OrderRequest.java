package com.eshopbackend.dto;

public class OrderRequest {
	private String firstName;
    private String lastName;
    private String primaryEmail;
    private String ship_address1;
    private String ship_address2;
    private String ship_country;
    private String ship_state;
    private String ship_zip;
    private Long productOrderid;
    private int productCount;

    // Add getters and setters

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

    public Long getProductOrderid() {
        return productOrderid;
    }

    public void setProductOrderid(Long productOrderid) {
        this.productOrderid = productOrderid;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

}
