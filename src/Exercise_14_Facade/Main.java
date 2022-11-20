package Exercise_14_Facade;

import Exercise_14_Facade.facade.BusquedaFacade;
import Exercise_14_Facade.facade.Imp.BusquedaFacadeImp;
import Exercise_14_Facade.model.Hotel;
import Exercise_14_Facade.model.Vuelo;

public class Main {
    public static void main(String[] args) {

        BusquedaFacade busquedaFacade = new BusquedaFacadeImp();

        Hotel hotel = new Hotel("24102022","28102022","Bogotá");
        Vuelo vuelo = new Vuelo("10102000","15102000","Buenos Aires", "Bogotá");

        String resultado;
        resultado = busquedaFacade.realizarBusqueda(hotel, vuelo);

        System.out.println(resultado);
    }
}
