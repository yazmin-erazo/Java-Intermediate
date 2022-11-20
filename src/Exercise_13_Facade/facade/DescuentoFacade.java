package Exercise_13_Facade.facade;

import Exercise_13_Facade.model.Producto;
import Exercise_13_Facade.model.Tarjeta;

public interface DescuentoFacade {

    int verificarDescuento(Tarjeta tarjeta, Producto producto, int cantidad);


}
