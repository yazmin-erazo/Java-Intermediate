package Exercise_01_JunitTest;

public class Person {
    private String name;
    private String lastname;
    private String email;
    private int yearBorn;
    private int age;


    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public Person(String name, String lastname, int yearBorn) {
        this.name = name;
        this.lastname = lastname;
        this.yearBorn = yearBorn;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearBorn() { return yearBorn; }

    public void setYearBorn(int yearBorn) { this.yearBorn = yearBorn; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Un método que muestre el nombre completo de la siguiente manera: Apellido, Nombre.
    public String fullname(){
        return this.lastname + ", " + this.name;
    }

    //Un método para calcular si la persona es mayor de 18 años.
    public boolean isLegalAge(){
        return this.yearBorn < 2004;
    }

    public boolean isLegalAge2(){
        return this.age > 18;
    }

}
