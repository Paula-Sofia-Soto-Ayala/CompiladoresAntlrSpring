package com.inventory.antlr.service;

import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import com.inventory.antlr.model.Change;
import com.inventory.antlr.model.Item;

@Service
public class InventoryService {
    private final List<Item> inventory = new ArrayList<>();
    private final List<Change> history = new ArrayList<>();

    public void addItem(String name, int quantity, String description, String category) {
        Item newItem = new Item(name, quantity, description, category);
        inventory.add(newItem);
        history.add(new Change("ADD", name, quantity, description, category, getCurrentTime()));
        System.out.printf("Added item: %s, Quantity: %d, Description: %s, Category: %s\n", name, quantity, description, category);
    }

    public void removeItem(String name) {
        boolean removed = inventory.removeIf(item -> item.getName().equals(name));
        if (removed) {
            history.add(new Change("REMOVE", name, 0, null, null, getCurrentTime()));
            System.out.printf("Removed item: %s\n", name);
        } else {
            System.out.printf("Item %s not found for removal.\n", name);
        }
    }

    public void updateItemQuantity(String name, int quantity) {
        inventory.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .ifPresentOrElse(item -> {
                    int previousQuantity = item.getQuantity();
                    item.setQuantity(quantity);
                    history.add(new Change("UPDATE", name, quantity, item.getDescription(), item.getCategory(), getCurrentTime()));
                    System.out.printf("Updated quantity of %s from %d to %d\n", name, previousQuantity, quantity);
                }, () -> System.out.printf("Item %s not found for quantity update.\n", name));
    }

    public void updateItemDescription(String name, String newDescription) {
        inventory.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .ifPresentOrElse(item -> {
                    String previousDescription = item.getDescription();
                    item.setDescription(newDescription);
                    history.add(new Change("UPDATE_DESC", name, item.getQuantity(), newDescription, item.getCategory(), getCurrentTime()));
                    System.out.printf("Updated description of %s from '%s' to '%s'\n", name, previousDescription, newDescription);
                }, () -> System.out.printf("Item %s not found for description update.\n", name));
    }

    public void updateItemCategory(String name, String newCategory) {
        inventory.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .ifPresentOrElse(item -> {
                    String currentCategory = item.getCategory();
                    item.setCategory(newCategory);
                    history.add(new Change("UPDATE_CATEGORY", name, item.getQuantity(), item.getDescription(), newCategory, getCurrentTime()));
                    System.out.printf("Updated category of %s from '%s' to '%s'\n", name, currentCategory, newCategory);
                }, () -> System.out.printf("Item %s not found in inventory.\n", name));
    }

    public List<Item> showInventory() {
        System.out.println("Showing all items in inventory:");
        inventory.forEach(item -> System.out.printf("- %s: Quantity: %d, Description: %s, Category: %s\n", item.getName(), item.getQuantity(), item.getDescription(), item.getCategory()));
        return inventory;
    }

    public List<Change> showHistory() {
        System.out.println("Showing all changes in history:");
        history.forEach(change -> System.out.printf("- Action: %s, Item: %s, Quantity: %d, Description: %s, Category: %s, Timestamp: %s\n",
                change.getAction(), change.getName(), change.getQuantity(), change.getDescription(), change.getCategory(), change.getTimestamp()));
        return history;
    }

    public List<Item> searchByCategory(String category) {
        System.out.printf("Searching for items in category: %s\n", category);
        List<Item> result = inventory.stream()
                .filter(item -> item.getCategory().equals(category))
                .collect(Collectors.toList());
        result.forEach(item -> System.out.printf("- Found item: %s\n", item.getName()));
        return result;
    }

    public List<Item> searchByDescription(String description) {
        System.out.printf("Searching for items with description: %s\n", description);
        List<Item> result = inventory.stream()
                .filter(item -> item.getDescription().equalsIgnoreCase(description))
                .collect(Collectors.toList());
        result.forEach(item -> System.out.printf("- Found item: %s\n", item.getName()));
        return result;
    }
    
    public List<Item> searchByName(String name) {
        System.out.printf("Searching for items with name: %s\n", name);
        List<Item> result = inventory.stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        result.forEach(item -> System.out.printf("- Found item: %s\n", item.getName()));
        return result;
    }

    private String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(new Date());
    }
}
