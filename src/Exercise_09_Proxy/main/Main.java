package Exercise_09_Proxy.main;

import Exercise_09_Proxy.entity.Persona;
import Exercise_09_Proxy.registro.Registrable;
import Exercise_09_Proxy.registro.implementacion.RegistroVacunaProxy;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 6, 5);

        Persona persona = new Persona("Yaz", "Erazo", "41.000.111", "Coctel", date);
        Registrable registro = new RegistroVacunaProxy();
        registro.registrar(persona.datos());

    }
}
