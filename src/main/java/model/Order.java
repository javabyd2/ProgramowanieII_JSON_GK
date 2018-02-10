package model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> itemList = new ArrayList<>();
    private int id;

    public Order() {
    }

    public Order(List<Item> itemList, int id) {
        this.itemList = itemList;
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
