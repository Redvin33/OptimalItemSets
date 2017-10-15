package com.itemsets.OptimalItemSets.Dao;

import com.itemsets.OptimalItemSets.Entity.Item;

import java.util.Collection;

/**
 * Created by Lauri on 12.10.2017.
 * This is Interface for communicating with wanted item data or database.
 * Idea is that if DAO class implements this interface it will work perfectly fine with Service and Controller packages.
 */
public interface ItemDaoInterface {
    Collection<Item> getAllitems();

    Item getItemById(int id);

    void deleteItemById(int id);

    void updateItemById(Item i);

    void addItem(Item item);
}
