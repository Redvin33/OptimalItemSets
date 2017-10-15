package com.itemsets.OptimalItemSets.Entity;

/**
 * Created by Lauri on 12.10.2017.
 */
public class Item {
    private int id;
    private String name;


    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(){}

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
}
