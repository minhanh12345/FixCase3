package Controller;

import DAO.CRUD_SQL;
import DAO.ConnectMySQL;
import DAO.SelectLaptop;
import Models.Basket;
import Models.BasketDetail;
import Models.Laptop;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/show"})
public class Servlet extends HttpServlet {
    static ArrayList<Laptop> list;

    {
        try {
            list = (ArrayList<Laptop>) SelectLaptop.select();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showDetail":
                int index = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("Laptop", list.get(index));
                requestDispatcher = req.getRequestDispatcher("Views/DetailProduct.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "basketNow":
                Integer idBasket1 = Integer.valueOf(req.getParameter("indexLaptop"));
                Integer numberLaptop1 = Integer.valueOf(req.getParameter("number"));
                try {
                    SelectLaptop.addBasket(idBasket1, numberLaptop1);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                req.setAttribute("listBasket", SelectLaptop.listBasket);
                requestDispatcher = req.getRequestDispatcher("Views/Basket.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "basket":
                Integer idBasket = Integer.valueOf(req.getParameter("indexLaptop"));
                Integer numberLaptop = Integer.valueOf(req.getParameter("number"));
                try {
                    SelectLaptop.addBasket(idBasket, numberLaptop);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                resp.sendRedirect("show");
                break;
            case "remove":
                int indexRemove = Integer.parseInt(req.getParameter("index"));
                SelectLaptop.listBasket.remove(indexRemove);
                req.setAttribute("listBasket", SelectLaptop.listBasket);
                requestDispatcher = req.getRequestDispatcher("Views/Basket.jsp");
                requestDispatcher.forward(req, resp);
                break;
//            case "editQuantity":
//                int indexEditQuantity = Integer.parseInt(req.getParameter("index"));
//                SelectLaptop.listBasket.get(indexEditQuantity).setNumber(indexEditQuantity);
//                req.setAttribute("listBasket",  SelectLaptop.listBasket);
//                requestDispatcher = req.getRequestDispatcher("Views/Basket.jsp");
//                requestDispatcher.forward(req, resp);
//                break;
            case "viewBasket":
                req.setAttribute("listBasket", SelectLaptop.listBasket);
                requestDispatcher = req.getRequestDispatcher("Views/Basket.jsp");
                requestDispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("listLaptop", list);
                requestDispatcher = req.getRequestDispatcher("Views/Menu.jsp");
                requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;

        if (action == null) {
            action = "";
        }
        switch (action) {
// thêm searchname
            case "searchName":
                ArrayList<Laptop> listLaptopSearch = new ArrayList<>();
                String searchName = req.getParameter("searchName");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().contains(searchName)) {
                        listLaptopSearch.add(list.get(i));
                    }
                }
                req.setAttribute("listLaptop", listLaptopSearch);
                requestDispatcher = req.getRequestDispatcher("Views/Menu.jsp");
                requestDispatcher.forward(req, resp);
                break;
                // sửa lại receipt
            case "receipt":

                int quantity = 0;
                for (int i = 0; i < SelectLaptop.listBasket.size(); i++) {
                    quantity = Integer.valueOf(req.getParameter("numberBuy" + i));
                    SelectLaptop.listBasket.get(i).setNumber(quantity);
                    SelectLaptop.listBasketDetail.add(new BasketDetail(SelectLaptop.listBasket.get(i).getIdLaptop(), quantity, SelectLaptop.idBasketSQL));
                }
                for (int i = 0; i < SelectLaptop.listBasketDetail.size(); i++) {
                    CRUD_SQL.createBasketDetail(SelectLaptop.listBasketDetail.get(i));
                }
                int totalAll = 0;
                for (int i = 0; i < SelectLaptop.listBasket.size(); i++) {
                    totalAll += SelectLaptop.listBasket.get(i).getTotalPrice();
                }
                req.setAttribute("totalAll", totalAll);
                req.setAttribute("listBasket", SelectLaptop.listBasket);
                requestDispatcher = req.getRequestDispatcher("Views/Receipt.jsp");
                requestDispatcher.forward(req, resp);
                SelectLaptop.listBasketDetail=new ArrayList<>();
                SelectLaptop.listBasket=new ArrayList<>();
                break;
            default:
                ArrayList<Basket> listBasket = SelectLaptop.listBasket;

                req.setAttribute("listBasket", listBasket);
                requestDispatcher = req.getRequestDispatcher("Views/Basket.jsp");
                requestDispatcher.forward(req, resp);
        }
    }
}
