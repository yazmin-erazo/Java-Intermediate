package Exercise_06_Method;

public abstract class Menu {

    public double precioMenu;

    public Menu(double precioMenu) {
        this.precioMenu = 100;
    }

    final void prepararMenu() {
        armarPaquete();
        calcularCosto();
    }

    abstract double calcularCosto();

    abstract void armarPaquete();


}
