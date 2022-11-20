package Exercise_16_Review;

import java.util.HashMap;
import java.util.Map;

public class RopaFlyweight {

    Map<String, Ropa> ropaMap = new HashMap<>();

    public Ropa obtenerRopa(String talla, String tipo, Boolean esNueva, Boolean esImportada){

        String clave = "key: " + talla + ":" + tipo + ":" + esNueva + ":" + esImportada;
        Ropa ropa = new Ropa(talla, tipo, esNueva, esImportada);

        if (!ropaMap.containsKey(clave)) {
            ropaMap.put(clave, ropa);
            System.out.println("------> 🟢 " + ropa.getTipo() + " creada");
            return ropaMap.get(clave);

        }else {
            System.out.println("------> 👉 " + ropa.getTipo() + " Obtenida");
            return ropaMap.get(clave);
        }

    }
}
