package com.firstProject.firstProject;

import javax.persistence.Entity;
import javax.persistence.Id;
// file that is info about the user that it is skeleton of the user
@Entity
// above statement defiens the ORM object relatioinal mapping entity = class
public class Users {
// table attributes
@Id
    private String username;
    private String firstname;
    private String lastname;
    private Integer mobile;
    private String email;
    private String address1;
    private String address2;

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Users(String username, String firstname, String lastname, Integer mobilenumber, String emailid, String address1, String address2) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobilenumber;
        this.email = emailid;
        this.address1 = address1;
        this.address2 = address2;
    }
}
