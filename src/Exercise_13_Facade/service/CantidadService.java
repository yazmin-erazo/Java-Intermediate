package Exercise_13_Facade.service;

public class CantidadService {
    public int verificarDescuento(int cuantos){
        if(cuantos > 11){
            return 15;
        }else {
            return 0;
        }
    }
}
