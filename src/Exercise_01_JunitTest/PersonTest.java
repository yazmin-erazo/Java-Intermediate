package Exercise_01_JunitTest;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Un test que nos certifique que el nombre completo es correcto.
    @Test
    public void isCorrectFullName() {
        //Given
        Person luisa = new Person("Luisa", "Martinez");
        //When
        boolean correctFullName = luisa.fullname().equals("Martinez, Luisa");
        //Then
        assertTrue(correctFullName);
    }

    //Un test que nos certifique que la persona es realmente mayor a 18 años, tener en cuenta que la fecha de hoy que vamos a utilizar en los test tiene que ir harcodeada, es decir, agregada manualmente con la fecha: 21/09/2021. Debemos comparar contra esta fecha en los tests. Por ejemplo, alguien nacido el 20/01/2015 no es mayor a 18 años.

    //Opcion 1 con año de nacimiento
    @Test
    public void isPersonLegalAge() {
        Person pedro = new Person("Pedro", "Suarez", 1989);
        LocalDate currentYear = LocalDate.now();
        int age = currentYear.getYear() - pedro.getYearBorn();
        assertTrue(age > 18);

    }
    //Opcion 2 con edad
    @Test
    public void isPersonLegalAge2() {
        Person pedro = new Person(19);
        boolean legalAge = pedro.isLegalAge2();
        assertTrue(legalAge);
    }

}