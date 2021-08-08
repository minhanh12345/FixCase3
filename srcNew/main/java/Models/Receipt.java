package Models;

import java.util.ArrayList;

public class Receipt {
    private int id;
    private ArrayList<BasketDetail> listLaptop_Number=new ArrayList<>();
    private int idUser;

    public Receipt() {
    }

    public Receipt(int id, ArrayList<BasketDetail> listLaptop_Number, int idUser) {
        this.id = id;
        this.listLaptop_Number = listLaptop_Number;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<BasketDetail> getListLaptop_Number() {
        return listLaptop_Number;
    }

    public void setListLaptop_Number(ArrayList<BasketDetail> listLaptop_Number) {
        this.listLaptop_Number = listLaptop_Number;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
