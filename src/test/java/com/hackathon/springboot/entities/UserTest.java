package com.hackathon.springboot.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTest {
    User user = new User(1, "Shivam", 12000);

    @Test
    public void testGetId(){
        assertEquals(user.getId(), 1);
    }
    @Test
    public void testGetName(){
        assertEquals(user.getName(), "Shivam");
    }
    @Test
    public void testGetFunds(){
        assertEquals(user.getFunds(), 12000);
    }

    @Test
    public void testSetId(){
        int id = 1;
        User user = new User();
        user.setId(id);
        assertEquals(user.getId(), id);
    }
    @Test
    public void testSetName(){
        String name = "rev";
        User user = new User();
        user.setName(name);
        assertEquals(user.getName(), name);
    }
    @Test
    public void testSetFunds(){
        double fund = 120;
        User user = new User();
        user.setFunds(fund);
        assertEquals(user.getFunds(), fund);
    }
}
