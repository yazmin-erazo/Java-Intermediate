package Exercise_07_ChainResponsibility;

import Exercise_07_ChainResponsibility.model.*;

public class ValidadorDeCorreo {
    //Para pasar la responsabilidad necesitamos un manejador - Handler
    //Este mira si la procesa o la pasa al siguiente en la cadena de responsabilidades
    private Manejador inicial;

    public ValidadorDeCorreo() {
        this.inicial = new ManejadorGerencia();
        Manejador comercial = new ManejadorComercial();
        Manejador tecnico = new ManejadorSoporteIt();
        Manejador spam = new ManejadorSpam();

        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(spam);
    }

    public String comprobar(Correo correo) {
        return inicial.comprobar(correo);
    }

}
