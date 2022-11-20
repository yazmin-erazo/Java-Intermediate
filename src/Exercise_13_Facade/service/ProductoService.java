package Exercise_13_Facade.service;

import Exercise_13_Facade.model.Producto;

public class ProductoService {

 public int verificarDescuento(Producto producto){

         if(producto.getTipo().equalsIgnoreCase("lata")) {
             return 10;
         }else {
             return 0;
         }
    }


}
