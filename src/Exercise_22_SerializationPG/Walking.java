package Exercise_22_SerializationPG;

import java.io.*;
import java.util.ArrayList;

public class Walking {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    Dog dog1 = new Dog("Firulais", "San Bernardo", 10, "1_abc");
    Dog dog2 = new Dog("Ambar", "Shar Pei", 6, "2_def");
    Dog dog3 = new Dog("Clark", "Bulldog", 12, "3_ghi");
    Dog dog4 = new Dog("Suki", "Pug", 8, "4_jkl");

    ArrayList<Dog> monday = new ArrayList<Dog>();
    ArrayList<Dog> tuesday = new ArrayList<Dog>();
    ArrayList<Dog> wednesday = new ArrayList<Dog>();
    ArrayList<Dog> thursday = new ArrayList<Dog>();
    ArrayList<Dog> friday = new ArrayList<Dog>();

    monday.add(dog1);
    wednesday.add(dog1);
    thursday.add(dog1);

    tuesday.add(dog2);
    wednesday.add(dog2);
    friday.add(dog2);

    monday.add(dog3);
    wednesday.add(dog3);
    thursday.add(dog3);
    friday.add(dog3);

    thursday.add(dog4);
    friday.add(dog4);

    FileOutputStream file = new FileOutputStream("dogs.dat");
    ObjectOutputStream archive = new ObjectOutputStream(file);

    archive.writeObject(monday);
    archive.writeObject(tuesday);
    archive.writeObject(wednesday);
    archive.writeObject(thursday);
    archive.writeObject(friday);

    archive.close();

    FileInputStream fileIn = new FileInputStream("dogs.dat");
    ObjectInputStream archiveIn = new ObjectInputStream(fileIn);


    ArrayList<Dog> day;

        for (int i = 0; i < 5; i++) {
            System.out.println("------------");
            System.out.println("Day: " + i + 1);

            day = (ArrayList<Dog>) archiveIn.readObject();

            for (Dog dog: day) {
                System.out.println(dog.getName() + " - " + dog.getAge() + " years" );
            }

        }


    }
}
