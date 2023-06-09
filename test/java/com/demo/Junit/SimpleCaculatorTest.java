package com.demo.Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCaculatorTest {
    @Test
    void twoPlusTwoShouldFour() {
        SimpleCalaculator calaculator = new SimpleCalaculator();
        //  assertEquals(4,calaculator.add(2,2));
        assertTrue(calaculator.add(2, 2) == 4);
    }
    @Test
        void threePlusSevenShouldTen(){
            SimpleCalaculator calaculator = new SimpleCalaculator();
              assertEquals(10,calaculator.add(3,7));
           // assertTrue(calaculator.add(3,7)==10);
    }

}