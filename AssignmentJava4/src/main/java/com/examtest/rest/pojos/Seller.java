package com.examtest.rest.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Seller extends User {
    private String shopName;
    private String gstNumber;

    public Seller() {
        super();
    }

    public Seller(int userId, String userName, String userPassword, String userRealName,
                  LocalDateTime lastLoginTime, String mobileNumber, LocalDate dob, Address address,
                  String shopName, String gstNumber) {
        super();
        this.shopName = shopName;
        this.gstNumber = gstNumber;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    @Override
    public void displayUserDetails() {
        super.displayUserDetails();
        System.out.println("Shop Name: " + shopName + ", GST No: " + gstNumber);
    }
}

