package DAO;

import Models.BasketDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_SQL {
    public static void createBasketDetail(BasketDetail basketDetail) {

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
            statement.executeUpdate("insert into basketdetail(basketdetail_laptop_id,basketdetail_number,basketdetail_basket_id) value ("+basketDetail.getIdLaptop()+","+basketDetail.getNumberLaptop()+","+basketDetail.getIdBasket()+")");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void update(String username,String passEdit){
        Connection connection = null;
        try {
            connection = ConnectMySQL.getConnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {

            PreparedStatement statement = connection.prepareStatement("update user set passWord=? where username ="+username);
            statement.setString(1, passEdit);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void delete(String username){
        Connection connection = null;
        try {
            connection = ConnectMySQL.getConnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        try {

            PreparedStatement statement = connection.prepareStatement("delete from user where username ="+username);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
