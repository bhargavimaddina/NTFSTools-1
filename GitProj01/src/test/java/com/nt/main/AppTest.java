package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

   
    @Test
    public void testSumWithPositives() {
        App a=new App();
        int expected=30;
        int actual=a.sum(10, 20);
        assertEquals(expected,actual);
    }
    @Test
    public void testSumWithNegatives() {
        App a=new App();
        int expected=-30;
        int actual=a.sum(-10, -20);
        assertEquals(expected,actual);
    }
    @Test
    public void testSumWithMixedValues() {
        App a=new App();
        int expected=10;
        int actual=a.sum(-10, 20);
        assertEquals(expected,actual);
    }
}
