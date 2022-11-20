package Exercise_04_JunitTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void siEsMayorDeEdad_DebeRetornarTrue() {
        //Given
        Person carolina = new Person("carolina", 18);
        //When
        boolean result = carolina.isLegalAge();
        //then
        assertTrue(result);
    }

    @Test
    public void siEsMayorDeEdad_DebeRetornarFalse() {
        //Given
        Person carolina = new Person("carolina", 10);
        //When
        boolean result = carolina.isLegalAge();
        //then
        assertFalse(result);
    }



    @Test
    public void tamanioColeccionTrue() {
        //Given
        ArrayList<Person> list = new ArrayList<>();
        Person person1 = new Person("Juan");
        Person person2 = new Person("Pedro");
        Person person3 = new Person("Ana");
        Person person4 = new Person("Luz");
        Person person5 = new Person("Julian");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        //when
        boolean tamanio = list.size() >= 2;
        //Then
        assertTrue(tamanio);
        System.out.println(list.size());

    }
    @Test
    public void tamanioColeccionFalse() {
        //GIVEN
        ArrayList<Person> lista = new ArrayList<Person>();
        Person persona1 = new Person("Juan");
        Person persona2 = new Person("Pedro");
        Person persona3 = new Person("Ana");
        Person persona4 = new Person("Luz");
        Person persona5 = new Person("Julian");
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);
        //WHEN

        boolean tamanio = lista.size() == 2;

        //THEN
        assertFalse(tamanio);
    }




}