package Exercise_12_flyweight;
public class Main {

    public static void main(String[] args) {

        ArbolFactory arbolFactory = new ArbolFactory();

        Arbol ornamental = arbolFactory.obtenerArbol(200, 400, "verde");
        Arbol frutal1 = arbolFactory.obtenerArbol(500, 300, "rojo");
        Arbol floral = arbolFactory.obtenerArbol(100,200,"celeste");
        Arbol frutal2 = arbolFactory.obtenerArbol(500, 300, "rojo");
        Arbol floral1 = arbolFactory.obtenerArbol(100,200,"lila");

        System.out.println(ornamental.toString());
        System.out.println(frutal1.toString());
        System.out.println(floral.toString());
        System.out.println(frutal2.toString());
        System.out.println(floral1.toString());

        Runtime runtime;
        runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -runtime.freeMemory()) / (1024 * 1024));
    }
}
