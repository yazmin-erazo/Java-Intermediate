package Exercise_14_Facade.facade.Imp;

import Exercise_14_Facade.facade.BusquedaFacade;
import Exercise_14_Facade.model.Hotel;
import Exercise_14_Facade.model.Vuelo;
import Exercise_14_Facade.service.HotelService;
import Exercise_14_Facade.service.VueloService;

public class BusquedaFacadeImp implements BusquedaFacade {

    private HotelService hotelService;
    private VueloService vueloService;

    public BusquedaFacadeImp(){
        hotelService = new HotelService();
        vueloService = new VueloService();
    }

    @Override
    public String realizarBusqueda(Hotel hotel, Vuelo vuelo) {

        String resultado = "";
        resultado = hotelService.realizarBusqueda(hotel) + "\n" + vueloService.realizarBusqueda(vuelo);

        return resultado;
    }
}
