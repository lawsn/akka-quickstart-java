package com.toy.functional.example;

import java.util.List;

public class ContactDao {

    public List<Contact> findAllContacts() {
        return DataUtil.getListOfContacts();
    }
}
