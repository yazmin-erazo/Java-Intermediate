package Exercise_14_Facade.facade;

import Exercise_14_Facade.model.Hotel;
import Exercise_14_Facade.model.Vuelo;

public interface BusquedaFacade {

    String realizarBusqueda(Hotel hotel, Vuelo vuelo);
}
