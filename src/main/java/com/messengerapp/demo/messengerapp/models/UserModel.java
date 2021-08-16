package com.messengerapp.demo.messengerapp.models;

import javax.persistence.*;

@Entity(name="users")

public class UserModel {

    public UserModel() {
    }

    public UserModel(String firstName, String lastName, String phone, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(nullable = false ,length = 20)
    private String firstName;

    @Column(nullable = false ,length = 20)
    private String lastName;

    @Column(nullable = false ,length = 20)
    private String phone;

    @Column(nullable = false ,length = 20)
    private String email;

    @Column(nullable = false , length = 20)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
