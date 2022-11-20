package Exercise_06_Method;

public class MenuVegetariano extends Menu{

    public MenuVegetariano(double precioMenu) {
        super(precioMenu);
    }

    @Override
    void armarPaquete() {
        System.out.println("Armando menú vegetariano");
    }
    @Override
    double calcularCosto() {
        double numeroEspecias = 0;
        double salsa = 0;
        return (0.01 * numeroEspecias) + (salsa * 2) + this.precioMenu;
    }



}
