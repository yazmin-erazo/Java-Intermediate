package Exercise_06_Method;

public class MenuInfantil extends Menu{

    final double numeroJuguetes;

    public MenuInfantil(double precioMenu, double numeroJuguetes) {
        super(precioMenu);
        this.numeroJuguetes = numeroJuguetes;
    }

    @Override
    void armarPaquete() {
        System.out.println("Armando menu Infatil");
    }
    @Override
    double calcularCosto() {
        return (this.numeroJuguetes * 3) + this.precioMenu;
    }


}
