package Exercise_04_JunitTest;

import java.util.ArrayList;
import java.util.List;

public class PeopleFilter {
    public List<Person> filter(List<Person> persons) {

        List<Person> listadoPersonasAutorizadas = new ArrayList<>();

        for (Person p : persons) {
            if (p.isLegalAge()) {
                listadoPersonasAutorizadas.add(p);
            }
        }

        return listadoPersonasAutorizadas;
    }

}
