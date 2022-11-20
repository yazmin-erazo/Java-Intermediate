package Exercise_03_JunitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void calculatePerimeter() {
        Circle circle = new Circle(6);

        double result = circle.calculatePerimeter();
        System.out.println(result);

        assertTrue(result > 0);
        assertNotEquals(0, result);
        assertNotNull(result);
    }
}