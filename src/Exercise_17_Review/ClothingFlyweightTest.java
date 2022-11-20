package Exercise_17_Review;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClothingFlyweightTest {

    ClothingFlyweight clothingFlyweight = new ClothingFlyweight();

   /* @Test
    void factoryPantsT-Shirts() {

        Clothing articleClothing1 = ropaFlyweight.fabricarRopa("8", "Pants",true,false );
        Clothing articleClothing2 = ropaFlyweight.fabricarRopa("XS","Shirt", false, true );

        assertEquals("Pants", articleClothing1.getTipo());
        assertEquals("Shirt", articleClothing2.getTipo());

    }*/

    @Test
    void factorySize(){

        for (int i = 0; i < 5 ; i++) {
            Clothing articleClothing = clothingFlyweight.clothesFactory("8", "Pants",true,false);
            // System.out.println(articleClothing3.toString());
        }

        for (int i = 0; i < 2; i++) {
            Clothing articleClothing2 = clothingFlyweight.clothesFactory("XS","Shirt", false, true);
            // System.out.println(articleClothing4.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        int memory = (int)(runtime.totalMemory() -runtime.freeMemory()) / (1024 * 1024);
        System.out.println("_____ Memory in use: " + memory + "_____");

        assertEquals(2, memory);

    }


}