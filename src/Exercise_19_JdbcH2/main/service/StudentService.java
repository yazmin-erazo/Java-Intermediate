package Exercise_19_JdbcH2.main.service;

import Exercise_19_JdbcH2.main.dao.IDaoStudent;
import Exercise_19_JdbcH2.main.dao.impl.IDaoStudentH2Impl;
import Exercise_19_JdbcH2.main.model.Student;

public class StudentService {

    private IDaoStudent daoStudent;

    public StudentService() {
        this.daoStudent = new IDaoStudentH2Impl();
    }

    public void guardar(Student student) {
        daoStudent.saveStudent(student);
    }

}
