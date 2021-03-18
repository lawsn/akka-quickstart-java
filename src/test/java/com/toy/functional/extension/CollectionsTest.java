package com.toy.functional.extension;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
//    private ContactDao contDao = new ContactDao();
//
//    @Test
//    public void Collections_sort_by_contact_age() {
//        Comparator<Contact> contactComparator = Comparator.comparing(Contact::getAge);
//        List<Contact> contacts = contDao.findAllContacts();
//
//        Collections.sort(contacts, contactComparator);
//
//        System.out.println("Sorted contact");
//        conatcts.stream().forEach(System.out::println);
//
//        Contact olderContact = Collections.max(contacts, contactComparator);
//        assertEquals(57, olderContact.getAge());
//
//        Contact youngestContact = Collections.min(contacts, contactComparator);
//        assertEquals(21, youngestContact.getAge());
//    }

    @Test
    public void Collections_sortWithInferType() {
        List<String> names = Arrays.asList("Allen", "Matt", "Mary", "Megan", "Alex");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);
    }

    @Test
    public void sortBeforeJava8() {
        List<String> names = Arrays.asList("Allen", "Matt", "Mary", "Megan", "Alex");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println("Sorted names: " + names);
    }
}
