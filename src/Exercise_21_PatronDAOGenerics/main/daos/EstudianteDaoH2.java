package Exercise_21_PatronDAOGenerics.main.daos;

import Exercise_21_PatronDAOGenerics.main.entidades.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements  IDao<Estudiante>{

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_estudiantes";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";


    @Override
    public Estudiante guardar(Estudiante estudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        // Levantando el driver y conectando
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Creando sentencia con preparedStatement
            preparedStatement = connection.prepareStatement("INSERT INTO estudiantes VALUES (?,?,?)");

            preparedStatement.setLong(1, estudiante.getId());
            preparedStatement.setString(2, estudiante.getNombre());
            preparedStatement.setString(3, estudiante.getApellido());

            //Ejecutando la sentencia

            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudiante;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        // Levantando el driver y conectando
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Creando sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM estudiantes  where id=?");

            preparedStatement.setLong(1, id);

            //Ejecutando la sentencia

            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Estudiante buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Estudiante estudiante = null;

        // Levantando driver y conectando
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Creando sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes where id = ?");
            preparedStatement.setLong(1,id);

            // Ejecutando la sentencia
            ResultSet rs = preparedStatement.executeQuery();

            // Evaluando resultados
            while (rs.next()){
                Long idEstudiante = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");

                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);


            }

            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Estudiante> estudiantes = new ArrayList();

        // Levantando driver y conectando
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Creando sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes");


            // Ejecutando la sentencia
            ResultSet rs = preparedStatement.executeQuery();

            // Evaluando resultados
            while (rs.next()){
                Long idEstudiante = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");

                Estudiante estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

                estudiantes.add(estudiante);

            }

            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudiantes;
    }
}
