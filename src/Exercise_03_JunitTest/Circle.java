package Exercise_03_JunitTest;

public class Circle extends Figure{
    private double radio;
    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        double PI = 3.1416;
        return 2 * PI * this.radio;
    }
}
