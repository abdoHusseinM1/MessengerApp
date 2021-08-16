package com.messengerapp.demo.messengerapp.models;

import javax.persistence.Column;

public class LoggedInUser {

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    public LoggedInUser(UserModel currentUser) {

        this.firstName=currentUser.getFirstName();
        this.lastName=currentUser.getLastName();
        this.phone=currentUser.getPhone();
        this.email=currentUser.getEmail();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
