package Exercise_05_Method;

public class Tea extends CaffeinatedDrink {

    @Override
    void brew() {
        System.out.println("Colando el te");
    }


    @Override
    void addSeasoning() {
        System.out.println("Agregando miel");
    }

}
