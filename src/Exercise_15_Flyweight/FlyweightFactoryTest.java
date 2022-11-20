package Exercise_15_Flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    @Test
    void getTrianguloConTamano2() {
        Triangulo triangulo = FlyweightFactory.obtenerTriangulo("rojo");
        triangulo.setTamanio(2);
        Triangulo triangulo1 = FlyweightFactory.obtenerTriangulo("rojo");
        triangulo1.setTamanio(4);

        assertEquals(triangulo.getColor(), "rojo");
        assertEquals(triangulo1.getTamanio(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);

        Runtime runtime = Runtime.getRuntime();
        int memoria = (int)(runtime.totalMemory() -runtime.freeMemory()) / (1024 * 1024);
        System.out.println("_____ Memoria en uso: " + memoria + "_____");

    }
}