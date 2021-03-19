package com.toy.functional.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int age;

    public Contact() {
        super();
    }

    public Contact(String firstName, String lastName, String userName, String password, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }
}
