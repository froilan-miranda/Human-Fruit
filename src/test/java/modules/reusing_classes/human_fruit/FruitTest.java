package modules.reusing_classes.human_fruit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitTest {

    @Test
    public void constructorTest(){
        // Given
        String expectedType = "tomato";
        int expectedEnergy = 10;

        // When
        Fruit testFruit = new Fruit(expectedType, expectedEnergy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        // Then
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedEnergy, actualEnergy);
    }


}
