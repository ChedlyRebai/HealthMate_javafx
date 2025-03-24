package com.example.learnjavafx.models;

public class Person {
    private String firstName;
    private String LastName;
    private String country;

    public Person(String firstName,String LastName,String country) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.country = country;
    }
    public String getCountry() {
        return this.country;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public String getLastName() {
        return LastName;
    }
    public void setCountry(String country) {
        this.country = country;

    }


}

