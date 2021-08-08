package Models;

public class BasketDetail {
    private int idLaptop;
    private int numberLaptop;
    private int idBasket;
    public BasketDetail(){};

    public BasketDetail(int idLaptop, int numberLaptop, int idBasket) {
        this.idLaptop = idLaptop;
        this.numberLaptop = numberLaptop;
        this.idBasket = idBasket;
    }

    public int getIdLaptop() {
        return idLaptop;
    }

    public void setIdLaptop(int idLaptop) {
        this.idLaptop = idLaptop;
    }

    public int getNumberLaptop() {
        return numberLaptop;
    }

    public void setNumberLaptop(int numberLaptop) {
        this.numberLaptop = numberLaptop;
    }

    public int getIdBasket() {
        return idBasket;
    }

    public void setIdBasket(int idBasket) {
        this.idBasket = idBasket;
    }
}
