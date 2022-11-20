package Exercise_06_Method;

public class MenuClasico extends Menu{

    public MenuClasico(double precioMenu) {
        super(precioMenu);
    }

    @Override
    void armarPaquete() {
        System.out.println("Armando menú clasico");
    }

    @Override
    double calcularCosto() {
        return this.precioMenu;
    }


}
