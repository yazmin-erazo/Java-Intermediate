package Exercise_04_JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleFilterTest {

    @Test
    public void deberiaAgregarSoloLasPersonasQueCorrespondanConElCriterio() {
        //Given
        Person juan = new Person("Juan", 19);
        Person pedro = new Person("pedro", 17);
        Person ana = new Person("ana", 15);
        Person luz = new Person("luz", 20);
        Person julian = new Person("julian", 19);
        PeopleFilter filtro = new PeopleFilter();

        //When
        List<Person> result = filtro.filter(List.of(juan, pedro, ana, luz, julian));

        //then
        Assertions.assertTrue(result.size() == 2);
        assertEquals(2, result.size());
        System.out.println(result.size());

    }
}