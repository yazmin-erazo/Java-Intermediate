package Exercise_11_flyweight.main;

import Exercise_11_flyweight.Computadora;
import Exercise_11_flyweight.flyweight.ComputadoraFlyweight;

public class Main {
    public static void main(String[] args) {

        ComputadoraFlyweight flyweight = new ComputadoraFlyweight();

        Computadora mac1 = flyweight.obtenerComputadora(16, 500);
        Computadora windows = flyweight.obtenerComputadora(2, 256);
        Computadora mac2 = flyweight.obtenerComputadora(16, 500);

        System.out.println(mac1.toString());
        System.out.println(windows.toString());
        System.out.println(mac2.toString());


    }
}
