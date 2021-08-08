package Models;

public class BasketSQL {
    private int idBasket;
    private int idUser;
    public BasketSQL(){
    }

    public BasketSQL(int idBasket, int idUser) {
        this.idBasket = idBasket;
        this.idUser = idUser;
    }

    public int getIdBasket() {
        return idBasket;
    }

    public void setIdBasket(int idBasket) {
        this.idBasket = idBasket;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
