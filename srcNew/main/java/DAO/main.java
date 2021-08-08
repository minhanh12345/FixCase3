package DAO;

import Models.BasketDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = ConnectMySQL.getConnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            statement.executeUpdate("insert into basketdetail(basketdetail_laptop_id,basketdetail_number,basketdetail_basket_id) value (1,1,1)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
