package com.example.azurecicd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Mahdi Sharifi
 * @since 8/29/22
 */
public class TestHello {
    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @Test
    void getBalance() {
        String message = "Hello World!";
        hello.setMessage(message);
        assertEquals(message, hello.getMessage());
    }
}
