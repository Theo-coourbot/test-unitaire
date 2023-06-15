package example;

import jdk.jshell.spi.ExecutionControl;
import org.example.Agence;
import org.example.Voiture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgenceTest {

    private Agence agence;
    private Voiture voiture;

    @BeforeEach
    void setUp() {
        agence = new Agence();
    }

    @Test
    void testUpdateShouldDecreaseCondition() throws ExecutionControl.NotImplementedException {
        //Arrange
        voiture = Voiture.builder().condition(10).rentDueLn(10).type("c1").build();
        //Act
        agence.dailyRoutine(voiture);

        Assertions.assertEquals(9, voiture.getCondition());
    }

    @Test
    void testUpdateShouldDecreaseRentDueLn() throws  ExecutionControl.NotImplementedException {
        //Arrange
        voiture = Voiture.builder().condition(10).rentDueLn(10).type("c1").build();
        //Act
        agence.dailyRoutine(voiture);

        Assertions.assertEquals(9, voiture.getRentDueLn());
    }

    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenRentDueLnIs0() throws ExecutionControl.NotImplementedException {
        //Arrange
        voiture = Voiture.builder().condition(10).rentDueLn(0).type("c1").build();
        //Act
        agence.dailyRoutine(voiture);

        Assertions.assertEquals(8, voiture.getCondition());
    }

    @Test
    void testUpdateShouldRaiseNotImplementedExceptionWhenConditionIsNegative() {
        //Arrange
        voiture = Voiture.builder().condition(-10).rentDueLn(0).type("c1").build();
        //Act
        Assertions.assertThrowsExactly(ExecutionControl.NotImplementedException.class, ()-> {
            agence.dailyRoutine(voiture);
        });
    }

    @Test
    void testUpdateShouldRaiseNotImplementedExceptionWhenConditionIsMoreThan100() {
        //Arrange
        voiture = Voiture.builder().condition(100).rentDueLn(0).type("c1").build();
        //Act
        Assertions.assertThrowsExactly(ExecutionControl.NotImplementedException.class, ()-> {
            agence.dailyRoutine(voiture);
        });
    }

    @Test
    void testUpdateShouldIncreaseConditionWhewCarTypeIsLuxe() throws ExecutionControl.NotImplementedException {
        voiture = Voiture.builder().condition(10).rentDueLn(10).type("luxe").build();

        agence.dailyRoutine(voiture);

        Assertions.assertEquals(11, voiture.getCondition());
    }

    @Test
    void testUpdateShouldDecreaseConditionTwiceWhewCarTypeIsLuxe() throws ExecutionControl.NotImplementedException {

        voiture = Voiture.builder().condition(10).rentDueLn(10).type("ancienne").build();

        agence.dailyRoutine(voiture);

        Assertions.assertEquals(8, voiture.getCondition());
    }

    @Test
    void testUpdateShouldDecreaseConditionTwiceWhewCarTypeIsLuxeAndrentDueLnIs0() throws ExecutionControl.NotImplementedException {

        voiture = Voiture.builder().condition(10).rentDueLn(0).type("ancienne").build();

        agence.dailyRoutine(voiture);

        Assertions.assertEquals(6   , voiture.getCondition());
    }

    @Test
    void testUpdateConditionShouldBe0WhenCarIsAncientAndRenDueLnIs0() throws ExecutionControl.NotImplementedException {
        //Arrange
        voiture = Voiture.builder().condition(3).rentDueLn(0).type("ancienne").build();
        //Act
        agence.dailyRoutine(voiture);
        Assertions.assertEquals(0   , voiture.getCondition());
    }
    @Test
    void testUpdateConditionShouldBe0WhenConditionIs2AndRenDueLnIs0() throws ExecutionControl.NotImplementedException {
        //Arrange
        voiture = Voiture.builder().condition(2).rentDueLn(0).type("c1").build();
        agence.dailyRoutine(voiture);
        //Act
        Assertions.assertEquals(0   , voiture.getCondition());
    }
}
