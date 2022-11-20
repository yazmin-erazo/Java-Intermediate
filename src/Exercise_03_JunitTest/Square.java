package Exercise_03_JunitTest;

public class Square extends Figure {
    private int lado;

    public Square(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculatePerimeter() {
        return this.lado * 4;
    }
}
