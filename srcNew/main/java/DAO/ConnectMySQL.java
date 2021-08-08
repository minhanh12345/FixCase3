package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/case_module3";
        String jdbcUsername = "root";
        String jdbcPassword = "miamihaha1995";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        return connection;
    }
}
