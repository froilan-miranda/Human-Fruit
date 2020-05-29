package modules.reusing_classes.human_fruit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanTest {

    @Test
    public void constructorTest(){
        // Given
        String expectedFirst = "Mike";
        String expectedLast = "Jones";
        int expectedEnergy = 50;

        // When
        Human testHuman = new Human(expectedFirst, expectedLast);
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assertions.assertEquals(expectedEnergy, actualEnergy);
        Assertions.assertEquals(expectedFirst, actualFirst);
        Assertions.assertEquals(expectedLast, actualLast);
    }

    @Test
    public void energyTest(){
        // Given
        Fruit testFruit = new Fruit("Pineapple", 10);
        Human testHuman = new Human("Fred", "Flintstone");
        int expectedEnergy = 60;

        // When
        testHuman.eat(testFruit);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assertions.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        // Given
        Fruit testFruit = new Fruit("Pineapple", 10);
        Human testHuman = new Human("Fred", "Flintstone");
        int expectedEnergy = 100;

        // When
        testHuman.eat(testFruit);
        testHuman.eat(testFruit);
        testHuman.eat(testFruit);
        testHuman.eat(testFruit);
        testHuman.eat(testFruit);
        testHuman.eat(testFruit);

        int actualEnergy = testHuman.getEnergy();

        // Then
        Assertions.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest(){
        // Given
        int hoursWorked = 2;
        int expectEnergy = 30;

        // When
        Human testHuman = new Human("Barny", "Rubble");
        testHuman.work(hoursWorked);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assertions.assertEquals(expectEnergy, actualEnergy);
    }

    @Test
    public void workLowEnergyTest(){
        // Given
        int hoursWorked = 6;
        int expectEnergy = 50;

        // When
        Human testHuman = new Human("Barny", "Rubble");
        testHuman.work(hoursWorked);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assertions.assertEquals(expectEnergy, actualEnergy);
    }
}
