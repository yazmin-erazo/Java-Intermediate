package Exercise_08_ChainResponsibility.model;

public class Articulo {
    private String nombre;
    private int lote;
    private int peso;
    private String envasasdo;

    public Articulo(String nombre, int lote, int peso, String envasasdo) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.envasasdo = envasasdo;
    }

    public Articulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEnvasasdo() {
        return envasasdo;
    }

    public void setEnvasasdo(String envasasdo) {
        this.envasasdo = envasasdo;
    }
}
