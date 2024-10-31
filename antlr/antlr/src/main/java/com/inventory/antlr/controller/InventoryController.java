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
        System.out.printf("Adding item - Name: %s, Quantity: %d, Description: %s, Category: %s\n", name, quantity, description, category);
        inventoryService.addItem(name, quantity, description, category);
    }

    @DeleteMapping("/remove")
    public void removeItem(@RequestParam String name) {
        System.out.printf("Removing item - Name: %s\n", name);
        inventoryService.removeItem(name);
    }

    @PutMapping("/updateQuantity")
    public void updateItemQuantity(@RequestParam String name, @RequestParam int quantity) {
        System.out.printf("Updating quantity of item - Name: %s to Quantity: %d\n", name, quantity);
        inventoryService.updateItemQuantity(name, quantity);
    }

    @PutMapping("/updateDescription")
    public void updateItemDescription(@RequestParam String name, @RequestParam String newDescription) {
        System.out.printf("Updating description of item - Name: %s to Description: %s\n", name, newDescription);
        inventoryService.updateItemDescription(name, newDescription);
    }

    @PutMapping("/updateCategory")
    public void updateItemCategory(@RequestParam String name, @RequestParam String newCategory) {
        System.out.printf("Updating category of item: %s to %s\n", name, newCategory);
        inventoryService.updateItemCategory(name, newCategory);
    }

    @GetMapping("/show")
    public List<Item> showInventory() {
        System.out.println("Showing inventory:");
        List<Item> inventory = inventoryService.showInventory();
        inventory.forEach(item -> System.out.printf("- Name: %s, Quantity: %d, Description: %s, Category: %s\n", 
                                                     item.getName(), item.getQuantity(), item.getDescription(), item.getCategory()));
        return inventory;
    }

    @GetMapping("/history")
    public List<Change> showHistory() {
        System.out.println("Showing history of changes:");
        List<Change> history = inventoryService.showHistory();
        history.forEach(change -> System.out.printf("- Action: %s, Name: %s, Quantity: %d, Description: %s, Category: %s, Timestamp: %s\n", 
                                                    change.getAction(), change.getName(), change.getQuantity(), change.getDescription(), change.getCategory(), change.getTimestamp()));
        return history;
    }

    @GetMapping("/searchByName")
    public List<Item> searchByName(@RequestParam String name) {
        System.out.printf("Searching inventory for items with name: %s\n", name);
        return inventoryService.searchByName(name);
    }

    @GetMapping("/searchByDescription")
    public List<Item> searchByDescription(@RequestParam String description) {
        System.out.printf("Searching inventory for items with description: %s\n", description);
        return inventoryService.searchByDescription(description);
    }

    @GetMapping("/searchByCategory")
    public List<Item> searchByCategory(@RequestParam String category) {
        System.out.printf("Searching inventory for items with category: %s\n", category);
        return inventoryService.searchByCategory(category);
    }

}
