package Exercise_02_JunitTest;

public class Figure {
    private String geometriFigure;
    private double radio;
    private double lado;

    public Figure(String geometriFigure, double radio, double lado) {
        this.geometriFigure = geometriFigure;
        this.radio = radio;
        this.lado = lado;
    }
    public double areaFigura() {
        double result = 0.0;
        
        if (this.lado <= 0 || this.radio <= 0){
            System.out.println("El valor del radio o lado debe ser mayor que cero");
        }
        else {
            switch (this.geometriFigure){
                case "square":
                    result = areaSquare();
                    System.out.println("El área del cuadrado es " + result + " unidades");
                    break;
                case "circle":
                    result = areaCircle();
                    System.out.println("El área del circulo es " + result + " unidades");
                    break;
            }
        }
        return result;
    }
    // Separo los metodos que calculan cada figura.
    public double areaSquare(){
        return this.lado * this.lado;
    }

    public double areaCircle() {
        double PI = 3.1416;
        return PI * Math.pow(this.radio, 2);
    }

}
//Se debe desarrollar un programa que permita calcular el área de una figura geométrica, la cual puede ser un círculo o un cuadrado.
// El programa debe responder el mensaje: “El área del X es Y unidades”, donde X es el tipo de figura geométrica y Y es el valor calculado del área.
//Para el cálculo de las áreas será necesario recibir como parámetro el radio del círculo o el lado del cuadrado,
// cuyos valores deben ser mayores que cero.
// En caso de que esta condición no se cumpla, se debe imprimir el mensaje: “El valor del radio o lado debe ser mayor que cero”.