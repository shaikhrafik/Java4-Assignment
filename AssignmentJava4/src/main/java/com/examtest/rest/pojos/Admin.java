package com.examtest.rest.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Admin extends User {
    private String role;
    private boolean superAdmin;

    public Admin() {
        super();
    }

    public Admin(int userId, String userName, String userPassword, String userRealName,
                 LocalDateTime lastLoginTime, String mobileNumber, LocalDate dob, Address address,
                 String role, boolean superAdmin) {
        super();
        this.role = role;
        this.superAdmin = superAdmin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    @Override
    public void displayUserDetails() {
        super.displayUserDetails();
        System.out.println("Admin Role: " + role + ", Super Admin: " + superAdmin);
    }
}

