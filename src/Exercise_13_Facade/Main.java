package Exercise_13_Facade;

import Exercise_13_Facade.facade.DescuentoFacade;
import Exercise_13_Facade.facade.imp.DescuentoFacadeImp;
import Exercise_13_Facade.model.Producto;
import Exercise_13_Facade.model.Tarjeta;

public class Main {
    public static void main(String[] args) {

        DescuentoFacade descuentoFacade = new DescuentoFacadeImp();

        Tarjeta tarjeta = new Tarjeta("123456", "Star Bank");
        Producto producto = new Producto("arvejas", "lata");
        int cantidad = 13;

        int descuentoTotal = descuentoFacade.verificarDescuento(tarjeta, producto, cantidad);

        System.out.println("Descuento: " + descuentoTotal + "%");
    }
}
