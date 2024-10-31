package com.inventory.antlr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.inventory.antlr.model.Change;
import com.inventory.antlr.model.Item;
import com.inventory.antlr.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/add")
    public void addItem(@RequestParam String name, @RequestParam int quantity,
                        @RequestParam String description, @RequestParam String category) {
        inventoryService.addItem(name, quantity, description, category);
    }

    @DeleteMapping("/remove")
    public void removeItem(@RequestParam String name) {
        inventoryService.removeItem(name);
    }

    @PutMapping("/updateQuantity")
    public void updateItemQuantity(@RequestParam String name, @RequestParam int quantity) {
        inventoryService.updateItemQuantity(name, quantity);
    }

    @PutMapping("/updateDescription")
    public void updateItemDescription(@RequestParam String name, @RequestParam String newDescription) {
        inventoryService.updateItemDescription(name, newDescription);
    }

    @GetMapping("/show")
    public List<Item> showInventory() {
        return inventoryService.showInventory();
    }

    @GetMapping("/history")
    public List<Change> showHistory() {
        return inventoryService.showHistory();
    }

    @GetMapping("/searchByCategory")
    public List<Item> searchByCategory(@RequestParam String category) {
        return inventoryService.searchByCategory(category);
    }
}
