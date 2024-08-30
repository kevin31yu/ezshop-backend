package com.example.ezshop.controller;

import com.example.ezshop.model.Item;
import com.example.ezshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Add this annotation
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/inventory")
    public List<Item> getInventory() {
        return itemService.getAllItems();
    }
}
