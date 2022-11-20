package Exercise_06_Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuInfantilTest {

    @Test
    public void armarPaquete() {
        MenuInfantil menuInfantil = new MenuInfantil(100, 6);

        menuInfantil.armarPaquete();

        assertNotSame(" ", "Armando menu Infatil");
    }

    @Test
    public void calcularCosto() {
        MenuInfantil menuInfantil = new MenuInfantil(200, 18);

        double precio = menuInfantil.calcularCosto();
        boolean resultado = menuInfantil.calcularCosto() > 0;

        assertNotEquals(0, precio);
        assertTrue(resultado);

    }

}