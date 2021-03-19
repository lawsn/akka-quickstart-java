package com.toy.functional.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.List;

public class ContactDaoTest {

    private ContactDao testClass = new ContactDao();

    @Test
    public void findAllContacts() {
        List<Contact> allContacts = testClass.findAllContacts();
        assertEquals(3, allContacts.size());
    }
}
