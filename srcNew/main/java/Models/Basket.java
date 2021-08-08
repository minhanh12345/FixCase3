package Models;

public class Basket {
    private int idLaptop;
    private String imageLaptop;
    private String nameLaptop;
    private String hardwareLaptop;
    private int priceLaptop;
    private int number;
    private int totalPrice;

    public Basket() {
    }

    public Basket(int idLaptop, String imageLaptop, String nameLaptop, String hardwareLaptop, int priceLaptop, int number) {
        this.idLaptop = idLaptop;
        this.imageLaptop = imageLaptop;
        this.nameLaptop = nameLaptop;
        this.hardwareLaptop = hardwareLaptop;
        this.priceLaptop = priceLaptop;
        this.number = number;
    }


    public int getTotalPrice() {
        return getPriceLaptop() * getNumber();
    }

    public int getIdLaptop() {
        return idLaptop;
    }

    public void setIdLaptop(int idLaptop) {
        this.idLaptop = idLaptop;
    }

    public String getImageLaptop() {
        return imageLaptop;
    }

    public void setImageLaptop(String imageLaptop) {
        this.imageLaptop = imageLaptop;
    }

    public String getNameLaptop() {
        return nameLaptop;
    }

    public void setNameLaptop(String nameLaptop) {
        this.nameLaptop = nameLaptop;
    }

    public String getHardwareLaptop() {
        return hardwareLaptop;
    }

    public void setHardwareLaptop(String hardwareLaptop) {
        this.hardwareLaptop = hardwareLaptop;
    }

    public int getPriceLaptop() {
        return priceLaptop;
    }

    public void setPriceLaptop(int priceLaptop) {
        this.priceLaptop = priceLaptop;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "idLaptop=" + idLaptop +
                ", imageLaptop='" + imageLaptop + '\'' +
                ", nameLaptop='" + nameLaptop + '\'' +
                ", hardwareLaptop='" + hardwareLaptop + '\'' +
                ", priceLaptop=" + priceLaptop +
                ", number=" + number +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
