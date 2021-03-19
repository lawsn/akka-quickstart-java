package com.toy.functional.example;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<Contact> getListOfContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Becky", "Zheng", "bzheng", "pwd1234@", 48));
        contacts.add(new Contact("Alex", "Change", "aChange", "pwd987$", 21));
        contacts.add(new Contact("Caleb", "Wang", "cWang", "pwd2345#", 57));
        return contacts;
    }

    public static Contact buildContact(String username, String pwd, int age) {
        Contact cnt = new Contact();
        cnt.setUserName(username);
        cnt.setPassword(pwd);
        cnt.setAge(age);
        return cnt;
    }

    public static LoginUser buildLoginUser(String userName, String pwd) {
        LoginUser user = new LoginUser();
        user.setUserName(userName);
        user.setPassword(pwd);
        return user;
    }

    public static LoginUser toUser(Contact contact) {
        LoginUser user = new LoginUser();
        user.setPassword(contact.getPassword());
        user.setUserName(contact.getUserName().toUpperCase());
        return user;
    }
}
