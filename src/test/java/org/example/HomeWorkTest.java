package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    private HomeWork work;

    @BeforeEach
    void setUp() {
        work = new HomeWork();
    }

    @Test
    void findMaxSubstring() {
        assertEquals("abcd", work.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", work.findMaxSubstring("abcddcbaX"));
        assertEquals("", work.findMaxSubstring(""));
        assertEquals("", work.findMaxSubstring(null));
    }

    @Test
    void check() {
        assertEquals(true, work.check("The quick brown fox jumps over the lazy dog"));
        assertEquals(false, work.check("The quick brown fox jumps over the lazy 12567"));
        assertEquals(true, work.check("The quick brown fox jumps over the l 24 a zy 63275671dog"));
        assertEquals(false, work.check("The quick brown fox jumps  "));
        assertEquals(false, work.check(""));
        assertEquals(false, work.check(null));

    }
}