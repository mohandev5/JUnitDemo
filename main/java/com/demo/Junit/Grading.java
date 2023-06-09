package com.demo.Junit;

public class Grading {
    public char determineLetterGrade(int number){
        if (number<0){
         throw new IllegalArgumentException("number cannot be confirmed");
        } else if (number<60) {
            return 'F';
        } else if (number<70) {
            return 'D';
        } else if (number<80) {
            return 'c';
        } else if (number<90) {
            return 'B';
        }else
            return 'A';
    }
}
