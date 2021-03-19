package com.toy.functional.example;

public class DataMapper {

    public LoginUser toUser(Contact contact) {
        return DataUtil.toUser(contact);
    }
}
