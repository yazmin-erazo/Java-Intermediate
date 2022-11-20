package Exercise_05_Method;

public class Coffee extends CaffeinatedDrink {

    @Override
    void brew() {
        System.out.println("Colando el cafe");
    }

    @Override
    void addSeasoning() {
        System.out.println("Agregando azucar");
    }



}