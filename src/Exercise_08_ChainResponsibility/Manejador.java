package Exercise_08_ChainResponsibility;

import Exercise_08_ChainResponsibility.model.Articulo;

public abstract class Manejador {

    public Manejador siguienteControl;

    public abstract String comprobar(Articulo articulo);

    public Manejador getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(Manejador siguienteControl) {
        this.siguienteControl = siguienteControl;
    }
}
