package com.example.formsubmission.model;

import lombok.Data;

@Data
public class Form {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public Form(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Form{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
