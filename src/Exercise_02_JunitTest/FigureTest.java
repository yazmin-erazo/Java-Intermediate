package Exercise_02_JunitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    public void areaFigura() {
        Figure figure = new Figure("circle", 2.2, 3.0);

        boolean isGreater0 = figure.areaFigura() > 0;

        assertTrue(isGreater0);

    }
}