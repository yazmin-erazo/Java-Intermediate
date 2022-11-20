package Exercise_19_JdbcH2.main;

import Exercise_19_JdbcH2.main.model.Student;
import Exercise_19_JdbcH2.main.service.StudentService;

import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {


        Student student =
                new Student(1,"Carlos", "Martinez", 30);

        StudentService studentService = new StudentService();
        studentService.guardar(student);

    }
}
