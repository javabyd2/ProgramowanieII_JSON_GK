package model;

public class Item {

    private String name;
    private String price;
    private String shop;

    public Item() {
    }

    public Item(String name, String price, String shop) {
        this.name = name;
        this.price = price;
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
