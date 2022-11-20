package Exercise_05_Method;

public abstract class CaffeinatedDrink {

    // TEMPLATE METHOD
    final void prepareRecipe()  {
        boilWather();   //hervirAgua
        brew();         //colar
        serve();        //servir
        addSeasoning(); //agregarCondimento
    }

    public void boilWather() {
        System.out.println("Hirviendo agua");
    }

    abstract void brew();

    public void serve() {
        System.out.println("Sirviendo bebida");
    }

    abstract void addSeasoning();

}