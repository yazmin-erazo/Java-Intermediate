package Exercise_13_Facade.facade.imp;

import Exercise_13_Facade.facade.DescuentoFacade;
import Exercise_13_Facade.model.Producto;
import Exercise_13_Facade.model.Tarjeta;
import Exercise_13_Facade.service.CantidadService;
import Exercise_13_Facade.service.ProductoService;
import Exercise_13_Facade.service.TarjetaService;

public class DescuentoFacadeImp implements DescuentoFacade {

    private TarjetaService tarjetaService;
    private ProductoService productoService;
    private CantidadService cantidadService;

    public DescuentoFacadeImp() {
        tarjetaService = new TarjetaService();
        productoService = new ProductoService();
        cantidadService = new CantidadService();
    }

    @Override
    public int verificarDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {

        int desc = 0;
        desc += tarjetaService.verificarDescuento(tarjeta);
        desc += productoService.verificarDescuento(producto);
        desc += cantidadService.verificarDescuento(cantidad);

        return desc;
    }

}
