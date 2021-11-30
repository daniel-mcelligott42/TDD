package com.example.csfx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class HelloApplicationTest  {

    @Test
    public void testEmailCheck() {
        assertFalse(HelloApplication.emailCheck("kdkd@gmail.com"));
    }
}