package com.example.eventsapp;

public class Users {

    private String firstName;
    private String lastName;
    private String university;
    private String email;
    private String password;

    void setFirstName(String x){
        firstName = x;
    }

    void setLastName(String x){
        lastName = x;
    }

    void setUniversity(String x){
        university = x;
    }

    void setEmail(String x){
        email = x;
    }

    void setPassword(String x){
        password = x;
    }

    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    String getUniversity()
    {
        return university;
    }

    String getEmail()
    {
        return email;
    }

    String getPassword()
    {
        return password;
    }
}
