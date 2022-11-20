package Exercise_04_JunitTest;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    ArrayList list;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegalAge() {
        return this.age >= 18;
    }


}
    //Crear una aplicación con una persona, que se va a guardar en una coleccion,
    //solamente si la persona es mayor de edad(18 años) y el nombre contiene mas de 5
    //letras, por ejemplo Javier, deberia ser guardado.
    //Crear un test que instancie 10 personas, 5 de ellas deben tener un nombre menor
    //a 5 letras y 5 mayor a 5 letras, y solo 2 de entre los mayores a 5 letras deben ser
    //mayor de edad.
    //Hacer un assertion corroborando que solo 2 personas están en la lista