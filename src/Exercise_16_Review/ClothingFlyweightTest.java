package Exercise_16_Review;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothingFlyweightTest {


    RopaFlyweight ropaFlyweight = new RopaFlyweight();

    @Test
    public void obtenerElementoPantalonYCamiseta() {

        Ropa pantalon = ropaFlyweight.obtenerRopa("6", "Pantalon", false, true);
        System.out.println(pantalon.toString());

        Ropa camiseta = ropaFlyweight.obtenerRopa("XS", "Camiseta", true, false);
        System.out.println(camiseta.toString());



    }

    @Test
    public void tamanioFabrica() {

        for (int i = 0; i < 5 ; i++) {
            Ropa pantalon = ropaFlyweight.obtenerRopa("6", "Pantalon", false, true);
           // System.out.println(pantalon.toString());
        }

        for (int i = 0; i < 2; i++) {
            Ropa camiseta = ropaFlyweight.obtenerRopa("XS", "Camiseta", true, false);
           // System.out.println(camiseta.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        int memoria = (int )(runtime.totalMemory()-runtime.freeMemory())  / (1024 * 1024);

        System.out.println("Memoria usada: " + memoria);

        assertEquals(2, memoria);
    }



}