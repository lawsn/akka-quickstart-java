package com.toy.functional.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DataMapperTest {
    
    private DataMapper dto = new DataMapper();
    
    @Test
    public void toUser() {
        Contact contact = new Contact("firstName", "lastName", "userName", "password", 40);
        LoginUser user = dto.toUser(contact);
        assertNotNull(user);
        assertEquals("USERNAME", user.getUserName());
        assertEquals("password", user.getPassword());
    }
}
