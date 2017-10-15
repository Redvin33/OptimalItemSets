package com.itemsets.OptimalItemSets.Service;

import com.itemsets.OptimalItemSets.Dao.ItemDaoInterface;
import com.itemsets.OptimalItemSets.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Lauri on 12.10.2017.
 */
@Service
public class ItemService {

    @Autowired
    @Qualifier("testData")
    private ItemDaoInterface itemDao;
    public Collection<Item> getAllitems(){
        return this.itemDao.getAllitems();
    }

    public Item getItemById(int id) {
        return this.itemDao.getItemById(id);
    }

    public void deleteItemById(int id) {
        this.itemDao.deleteItemById(id);
    }

    public void updateItem(Item i) {
        this.itemDao.updateItemById(i);
    }

    public void addItem(Item item) {
        this.itemDao.addItem(item);
    }
}
