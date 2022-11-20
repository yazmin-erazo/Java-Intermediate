package Exercise_16_Review;

public class Ropa {
    private String talla; // XS S M
    private String tipo; // pantalon
    private Boolean esNueva;
    private Boolean esImportada;

    public Ropa(){}

    public Ropa(String talla, String tipo, Boolean esNueva, Boolean esImportada) {
        this.talla = talla;
        this.tipo = tipo;
        this.esNueva = esNueva;
        this.esImportada = esImportada;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEsNueva() {
        return esNueva;
    }

    public void setEsNueva(Boolean esNueva) {
        this.esNueva = esNueva;
    }

    public Boolean getEsImportada() {
        return esImportada;
    }

    public void setEsImportada(Boolean esImportada) {
        this.esImportada = esImportada;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla='" + this.talla + '\'' +
                ", tipo='" + this.tipo + '\'' +
                ", esNueva=" + this.esNueva +
                ", esImportada=" + this.esImportada +
                '}';
    }
}
