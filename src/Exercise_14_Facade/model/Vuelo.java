package Exercise_14_Facade.model;

import java.time.LocalDate;

public class Vuelo {
    private String fechaSalida;
    private String fechaRegreso;
    private String origen;
    private String destino;

    public Vuelo(String fechaSalida, String fechaRegreso, String origen, String destino) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.origen = origen;
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
