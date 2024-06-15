package com.driver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    String adminName;
    String username;
    String password;

    public Admin(int id, String adminName, String username, String password) {
        Id = id;
        this.adminName = adminName;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}