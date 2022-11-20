package Exercise_07_ChainResponsibility.model;

import Exercise_07_ChainResponsibility.Manejador;

public class ManejadorSpam extends Manejador {
    @Override
    public String comprobar(Correo email){
        return "¡Ojo! Marcado como spam....";
    }
}
