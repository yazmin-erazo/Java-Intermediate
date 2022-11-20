package Exercise_02_JunitTest;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("square", 2.0, 3.0);

        double result = figure.areaFigura();
        System.out.println(result);
    }
}
