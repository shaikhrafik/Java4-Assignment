package com.examtest.rest.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PrimeUser extends User {
    private int primeLevel;
    private LocalDate subscriptionDate;

    public PrimeUser() {
        super();
    }

    public PrimeUser(int userId, String userName, String userPassword, String userRealName,
                     LocalDateTime lastLoginTime, String mobileNumber, LocalDate dob, Address address,
                     int primeLevel, LocalDate subscriptionDate) {
        super();
        this.primeLevel = primeLevel;
        this.subscriptionDate = subscriptionDate;
    }

    public int getPrimeLevel() {
        return primeLevel;
    }

    public void setPrimeLevel(int primeLevel) {
        this.primeLevel = primeLevel;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public void displayUserDetails() {
        super.displayUserDetails();
        System.out.println("Prime Level: " + primeLevel + ", Subscribed On: " + subscriptionDate);
    }
}
