package Exercise_03_JunitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void calculatePerimeter() {
        Square square = new Square(5);

        double result = square.calculatePerimeter();
        System.out.println(result);

        assertNotNull(result);
        assertNotSame(0, result);
        assertTrue(result > 0);
    }

}