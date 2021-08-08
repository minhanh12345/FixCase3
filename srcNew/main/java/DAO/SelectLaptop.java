package DAO;

import Models.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectLaptop {
    public static String select = "select laptop_id,laptop_name, laptop_trademark,laptop_hardware, laptop_operating,laptop_type,laptop_image,laptop_description,laptop_productionTime,laptop_price,laptop_number\n" +
            "from laptop";
    public static ArrayList<Basket> listBasket = new ArrayList<>();
public static ArrayList<Receipt> listReceipt=new ArrayList<>();
public static ArrayList<BasketDetail> listBasketDetail=new ArrayList<>();

    public static List<Laptop> select() throws SQLException, ClassNotFoundException {
        ArrayList<Laptop> list = new ArrayList<>();
        Connection connection = ConnectMySQL.getConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        while (resultSet.next()) {
            Integer id = resultSet.getInt("laptop_id");
            String name = resultSet.getString("laptop_name");
            String trademark = resultSet.getString("laptop_trademark");
            String hardware = resultSet.getString("laptop_hardware");
            String operating = resultSet.getString("laptop_operating");
            String type = resultSet.getString("laptop_type");
            String image = resultSet.getString("laptop_image");
            String description = resultSet.getString("laptop_description");
            String productionTime = resultSet.getString("laptop_productionTime");
            Integer number = resultSet.getInt("laptop_number");
            Integer price = resultSet.getInt("laptop_price");
            list.add(new Laptop(id, name, trademark, hardware, operating, type, image, description, productionTime, price, number));
        }
        return list;
    }

    public static void addBasket(int id, int number) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectMySQL.getConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select Laptop_id,Laptop_name,laptop_hardware,laptop_price,laptop_image from laptop\n" +
                "where laptop_id=" + id);
        while (resultSet.next()) {
            int idLaptop= resultSet.getInt("laptop_id");
            String nameLaptop = resultSet.getString("laptop_name");
            String hardware = resultSet.getString("laptop_hardware");
            Integer price = resultSet.getInt("laptop_price");
            String image = resultSet.getString("laptop_image");
            listBasket.add(new Basket(idLaptop,image, nameLaptop, hardware, price, number));
        }
    }
    //sửa lại addbasket
    public static List<BasketSQL> selectBasketSQL() throws SQLException, ClassNotFoundException {
        ArrayList<BasketSQL> list=new ArrayList<>();
        Connection connection = ConnectMySQL.getConnect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from basket");
        while (resultSet.next()){
            int idBasket=resultSet.getInt("basket_id");
            int idUser=resultSet.getInt("basket_user_id");
            list.add(new BasketSQL(idBasket,idUser));
        }
        return list;
    }
    //thêm idbasket
    public static int idBasketSQL;

    static {
        try {
            idBasketSQL = selectBasketSQL().size();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
