package com.itemsets.OptimalItemSets.Dao;

/**
 * Created by Lauri on 12.10.2017.
 */
import com.itemsets.OptimalItemSets.Entity.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

@Repository
@Qualifier("testData")
public class testItemDaoImpl implements ItemDaoInterface {
    private static Map<Integer, Item> items;
    static {
        items = new HashMap<Integer, Item>(){
            {
                put(1001, new Item(1001,"boots of speed"));
                put(1004, new Item(1004,"Faerie Charm"));
                put(1006, new Item(1006, "Rejuvenation bead"));
            }
        };
    }

    @Override
    public Collection<Item> getAllitems(){
        return this.items.values();
    }

    @Override
    public Item getItemById(int id) {
        return this.items.get(id);
    }

    @Override
    public void deleteItemById(int id) {
        this.items.remove(id);
    }

    @Override
    public void updateItemById(Item i) {
        Item i2 = items.get(i.getId());
        i2.setName(i.getName());
        items.put(i.getId(), i2);
    }

    @Override
    public void addItem(Item item) {
        items.put(item.getId(), item);
    }
}
