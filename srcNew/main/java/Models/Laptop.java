package Models;

public class Laptop {
    private int id;
    private String name;
    private String trademark;
    private String hardWare;
    private String operating;
    private String type;
    private String image;
    private String description;
    private String productionTime;
    private int price;
    private int number;

    public Laptop() {
    }

    public Laptop(int id,String name, String trademark, String hardWare, String operating, String type, String image, String description, String productionTime, int price, int number) {
        this.id=id;
        this.name = name;
        this.trademark = trademark;
        this.hardWare = hardWare;
        this.operating = operating;
        this.type = type;
        this.image = image;
        this.description = description;
        this.productionTime = productionTime;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                ", hardWare='" + hardWare + '\'' +
                ", operating='" + operating + '\'' +
                ", type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", productionTime='" + productionTime + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getHardWare() {
        return hardWare;
    }

    public void setHardWare(String hardWare) {
        this.hardWare = hardWare;
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
