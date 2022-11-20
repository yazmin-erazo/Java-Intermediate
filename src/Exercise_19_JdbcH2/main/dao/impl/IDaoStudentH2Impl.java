package Exercise_19_JdbcH2.main.dao.impl;

import Exercise_19_JdbcH2.main.dao.IDaoStudent;
import Exercise_19_JdbcH2.main.model.Student;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IDaoStudentH2Impl implements IDaoStudent {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/h2-db-student;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="root";
    private final static String DB_PASSWORD = "";


    final static Logger LOGGER = Logger.getLogger(IDaoStudentH2Impl.class);

    @Override
    public void saveStudent(Student student) {

        Connection connection = null;
        DriverManager driverManager = null;
        PreparedStatement preparedStatementInsert = null;
        //PreparedStatement preparedStatementCreate = null;

        try {
            Class.forName(DB_JDBC_DRIVER).getDeclaredConstructor().newInstance();
            connection = driverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatementInsert = connection.prepareStatement(
                    "INSERT INTO student (id, firstName, lastName, age) " +
                            "VALUES (?, ?, ?, ?)"
            );

            preparedStatementInsert.setInt(1, student.getId());
            preparedStatementInsert.setString(2, student.getFirstName());
            preparedStatementInsert.setString(3, student.getLastName());
            preparedStatementInsert.setInt(4, student.getAge());

            preparedStatementInsert.execute();



        } catch (Exception exception) {
            LOGGER.error("🚩 Error: " + exception);
        }finally {
            try {
                preparedStatementInsert.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            LOGGER.info("⭐ Info en finally Idao");
        }

    }

    @Override
    public Student searchStudent(int id) {
        return null;
    }
}
