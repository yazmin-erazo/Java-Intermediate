package Exercise_12_flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    Map<String, Arbol> arbolMap = new HashMap<>();

    public Arbol obtenerArbol(int alto, int ancho, String color){

        String clave = "key: " + alto + ":" + ancho + ":" + color;

        if (!arbolMap.containsKey(clave)){

            Arbol arbol = new Arbol(alto, ancho, color);
            arbolMap.put(clave, arbol);
            System.out.println("Arbol creado");
            return arbolMap.get(clave);

        }else {
            System.out.println("Arbol obtenido");
            return arbolMap.get(clave);
        }

    }

}
