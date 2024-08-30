// src/main/java/com/example/ezshop/service/ItemService.java

package com.example.ezshop.service;

import com.example.ezshop.model.Item;
import com.example.ezshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
