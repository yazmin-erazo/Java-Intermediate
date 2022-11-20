package Exercise_22_SerializationPG;

import java.io.Serializable;

public class Dog implements Serializable {

    private String name;
    private String race;
    private int age;
    private String domicile;

    public Dog(String name, String race, int age, String domicile) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.domicile = domicile;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", domicile='" + domicile + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }
}
