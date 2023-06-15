package org.example;

import example.example.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibTest {

    @Test
    void getFibSerie_range1_notNull (){
        Fib fib = new Fib(1);

        int list = fib.getFibSeries().size();

        Assertions.assertTrue(list > 0);
    }

    @Test
    void getFibSerie_range1 (){
        Fib fib = new Fib(1);
        List<Integer> list = fib.getFibSeries();
        Assertions.assertIterableEquals(Arrays.asList(0),list);

    }

    @Test
    void getFibSerie_range6_listContainSix(){

        Fib fib = new Fib(6);
        List<Integer> list = fib.getFibSeries();
        Assertions.assertEquals(true,list.contains(3));
    }

    @Test
    void getFibSerie_range6_listLengthSix(){

        Fib fib = new Fib(6);
        List<Integer> list = fib.getFibSeries();
        Assertions.assertEquals(6,list.size());
    }

    @Test
    void getFibSerie_range6_listNotContain4(){

        Fib fib = new Fib(6);
        List<Integer> list = fib.getFibSeries();
        Assertions.assertEquals(false,list.contains(4));
    }

    @Test
    void getFibSerie_range6_listContain(){

        Fib fib = new Fib(6);
        List<Integer> list = fib.getFibSeries();
        List<Integer> listVerif = new ArrayList<>();
        listVerif.add(0);
        listVerif.add(1);
        listVerif.add(1);
        listVerif.add(2);
        listVerif.add(3);
        listVerif.add(5);
        Assertions.assertEquals(list,listVerif);
    }



}
