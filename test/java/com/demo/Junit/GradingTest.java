package com.demo.Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {
 @Test
   void fiftyNineReturnsF(){
     Grading grading= new Grading();
     assertEquals('F',grading.determineLetterGrade(59));
 }

 @Test
    void sixtyNineReturnsD(){
     Grading grading = new Grading();
     assertEquals('D',grading.determineLetterGrade(69));
 }
    @Test
    void eightyNineReturnsB(){
        Grading grading = new Grading();
        assertEquals('B',grading.determineLetterGrade(89));
    }
    @Test
    void zerShouldReturnsZerro(){
        Grading grading = new Grading();
        assertThrows(IllegalAccessError.class,
                ()->{
                    grading.determineLetterGrade(-1);
                });
        assertEquals('F',grading.determineLetterGrade(-1));
    }
}