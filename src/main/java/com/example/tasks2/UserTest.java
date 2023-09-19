package com.example.tasks2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User newUser;
    @BeforeEach
    void setUp() throws IllegalAccessException {
        newUser = new User("fred@rocks.com","Fred","705-555-1234");
    }

    @Test
    void setEmail() {
    }

    @Test
    void setUserName() throws IllegalArgumentException, IllegalAccessException {
        newUser.setUserName("Barney");
        assertEquals("Barney", newUser.getUserName());
    }

    @Test
    void setInvalidUserName(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            newUser.setUserName("");
        });

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            newUser.setUserName("   ");
        });

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            newUser.setUserName(" Fred Flinstone ");
        });
    }


    @Test
    void setPhone() {
    }
}