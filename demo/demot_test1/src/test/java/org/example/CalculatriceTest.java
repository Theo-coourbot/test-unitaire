package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    void TestAddition(){
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.addition(-1,1);

        Assertions.assertEquals(0,result);
    }
    @Test
    void TestDivision(){
        Calculatrice calculatrice = new Calculatrice();

        Assertions.assertThrowsExactly(Exception.class,()->{

            calculatrice.division(10,0);
        });
    }
    @Test
    void TestDivision2() throws Exception {
        Calculatrice calculatrice = new Calculatrice();



        int result = calculatrice.division(10,0);

        Assertions.assertEquals(5,result);

    }
}
