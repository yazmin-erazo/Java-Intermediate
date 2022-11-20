package Exercise_09_Proxy.registro.implementacion;

import Exercise_09_Proxy.registro.Registrable;

public class RegistroVacuna implements Registrable {
    @Override
    public void registrar(Object[] datos) {
        System.out.println("Se ha registrado el " + datos[0] + " en la fecha " + datos[1].toString() + " como vacunado");
    }
}
