package com.shangruey.springbootmall.model;

import java.util.Date;

public class User {
    Integer userId;
    String email;
    String password;
    Date createdDate;
    Date lastModifieDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifieDate() {
        return lastModifieDate;
    }

    public void setLastModifieDate(Date lastModifieDate) {
        this.lastModifieDate = lastModifieDate;
    }
}
