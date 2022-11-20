package Exercise_18_JDBC.main;

import java.sql.*;


public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ANIMALS; CREATE TABLE ANIMALS "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NAME varchar(100) NOT NULL,"
            + " KIND varchar(100) NOT NULL "
            + ")";

    private static final String SQL_INSERT1 = "INSERT INTO ANIMALS (ID, NAME, KIND) VALUES (1, 'Pancho', 'Dog')";
    private static final String SQL_INSERT2 = "INSERT INTO ANIMALS (ID, NAME, KIND) VALUES (2, 'Pillo', 'Cat')";
    private static final String SQL_INSERT3 = "INSERT INTO ANIMALS (ID, NAME, KIND) VALUES (3, 'Cepillo', 'Elephant')";
    private static final String SQL_INSERT4 = "INSERT INTO ANIMALS (ID, NAME, KIND) VALUES (4, 'Pepe', 'Dog')";
    private static final String SQL_INSERT5 = "INSERT INTO ANIMALS (ID, NAME, KIND) VALUES (5, 'Rolo', 'Horse')";

    private static final String SQL_DELETE = "DELETE FROM ANIMALS WHERE ID=2";



    public static void main(String[] args) throws SQLException {

        // Iniciando conección
        Connection connection = null;

        connection = getConnection();


        try {
            // Creo un objeto
            Statement statementCreate = connection.createStatement();
            statementCreate.execute(SQL_CREATE_TABLE);

            Statement statementInsert1 = connection.createStatement();
            statementInsert1.execute(SQL_INSERT1);

            Statement statementInsert2 = connection.createStatement();
            statementInsert2.execute(SQL_INSERT2);

            Statement statementInsert3 = connection.createStatement();
            statementInsert3.execute(SQL_INSERT3);

            Statement statementInsert4 = connection.createStatement();
            statementInsert4.execute(SQL_INSERT4);

            Statement statementInsert5 = connection.createStatement();
            statementInsert5.execute(SQL_INSERT5);

            seeAnimalsList(connection);


        } catch(Exception e){
            System.out.println("Error" + e);

        } finally {
            System.out.println(" Finally");
            connection.close();
        }


    }
    public static Connection getConnection() {
        //Clase que gestiona drivers -
        DriverManager driverManager = null;
        Connection connection = null;

        try {
            //ESPECIFICAMOS EL DRIVER
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            connection = driverManager.getConnection("jdbc:h2:~/h2-animals", "user", "");
        } catch(Exception e){
            System.out.println("Error" + e);
        }
        return connection;
    }
    private static void seeAnimalsList(Connection connection) throws SQLException {
        String selectAnimals = "SELECT * FROM ANIMALS";
        Statement statementSelect = connection.createStatement();


        ResultSet rs = statementSelect.executeQuery(selectAnimals);

        // con next() continuamos al siguiente registro
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
        }
    }
}
