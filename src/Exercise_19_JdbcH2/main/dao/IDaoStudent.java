package Exercise_19_JdbcH2.main.dao;

import Exercise_19_JdbcH2.main.model.Student;

public interface IDaoStudent {

    void saveStudent(Student student);

    Student searchStudent(int id);
}
