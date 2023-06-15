package org.exemple;

import org.example.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {

    @Test
    void TestUnNoteA(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('A',result);


    }

    @Test
    void TestDeuxNoteB(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B',result);


    }
    @Test
    void TestTroisNoteC(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('C',result);


    }


    @Test
    void TestQuatreNoteB(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B',result);


    }
    @Test
    void TestCinqNoteF(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);


    }
    @Test
    void TestSixNoteF(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);


    }
    @Test
    void TestSeptNoteF(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);
        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F',result);


    }
}
