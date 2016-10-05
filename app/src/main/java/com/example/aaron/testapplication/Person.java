package com.example.aaron.testapplication;

/**
 * Created by User on 10/5/2016.
 */

public class Person {

    private String firstName = null;
    private String lastName = null;

    public Person(String fn, String ln){
        firstName = fn;
        lastName =ln;
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
}
