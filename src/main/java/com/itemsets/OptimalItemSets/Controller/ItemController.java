package com.itemsets.OptimalItemSets.Controller;

import com.itemsets.OptimalItemSets.Entity.Item;
import com.itemsets.OptimalItemSets.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import org.springframework.http.MediaType;

import java.util.Collection;


/**
 * Created by Lauri on 12.10.2017.
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    //Returns all items
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Item> getAllItems(){
        return itemService.getAllitems();
    }

    //with GET request to http://domain/items/{id} returns item that matches id.
    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable("id") int id) {
        return itemService.getItemById(id);
    }

    //with DELETE request to http://domain/items/{id} deletes item that matches id
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteItemById(@PathVariable("id") int id) {
        itemService.deleteItemById(id);
    }

    //with PUT request with JSON content to http://domain/items edits existing item in itemData
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
    }

    //with POSY
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertItem(@RequestBody Item item) {
        itemService.addItem(item);
    }
}
