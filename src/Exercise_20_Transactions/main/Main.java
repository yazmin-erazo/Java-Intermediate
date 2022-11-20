package Exercise_20_Transactions.main;

import Exercise_20_Transactions.main.model.Account;

import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS account; CREATE TABLE account "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NAME varchar(100) NOT NULL, "
            + " ACCOUNT_NUMBER NUMERIC(10, 2) NOT NULL,"
            + " BALANCE INT NOT NULL"
            + " )";

    private static final String SQL_INSERT = "INSERT INTO account (ID, NAME, ACCOUNT_NUMBER, BALANCE) VALUES (?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE account SET BALANCE=? WHERE ID=?";

    public static void main(String[] args) throws Exception {

        Account account = new Account(123, "Sueldo", 10.5);
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1, 1);
            psInsert.setString(2, account.getName());
            psInsert.setInt(3, account.getAccountNumber());
            psInsert.setDouble(4, account.getBalance());

            psInsert.execute();


            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1, account.getBalance() + 10);
            psUpdate.setInt(2, 1);
            psUpdate.execute();

            connection.commit();
            connection.setAutoCommit(true);

            System.out.println("FIRST CONNECTION");
            String select = "SELECT * FROM ACCOUNT";
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(select);
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " - " +
                                rs.getString(2) + " - " +
                                rs.getInt(3) + " - " +
                                rs.getString(4)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }


        System.out.println("");
        System.out.println("SECOND CONNECTION");
        Connection connection2 = getConnection();
        String sql = "SELECT * FROM ACCOUNT";
        Statement sqlSmt = connection2.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " - " +
                            rs.getString(2) + " - " +
                            rs.getInt(3) + " - " +
                            rs.getString(4)
            );
        }


    }


    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/db-accounts", "user", "");


    }
}