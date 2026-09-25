package com.brutex.gitflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void greetReturnsGreeting() {
        assertEquals("Hello, World!", Main.greet("World"));
    }

    @Test
    void greetReturnsGreetingWhenNull() {
        assertEquals("Hello, unknown!", Main.greet(null));
    }
}
