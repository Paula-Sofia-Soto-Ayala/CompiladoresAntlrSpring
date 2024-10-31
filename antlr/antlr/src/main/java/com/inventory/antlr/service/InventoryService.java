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
    }

    public void removeItem(String name) {
        inventory.removeIf(item -> item.getName().equals(name));
        history.add(new Change("REMOVE", name, 0, null, null, getCurrentTime()));
    }

    public void updateItemQuantity(String name, int quantity) {
        inventory.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .ifPresent(item -> {
                    item.setQuantity(quantity);
                    history.add(new Change("UPDATE", name, quantity, item.getDescription(), item.getCategory(), getCurrentTime()));
                });
    }

    public void updateItemDescription(String name, String newDescription) {
        inventory.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .ifPresent(item -> {
                    item.setDescription(newDescription);
                    history.add(new Change("UPDATE_DESC", name, item.getQuantity(), newDescription, item.getCategory(), getCurrentTime()));
                });
    }

    public List<Item> showInventory() {
        return inventory;
    }

    public List<Change> showHistory() {
        return history;
    }

    public List<Item> searchByCategory(String category) {
        return inventory.stream()
                .filter(item -> item.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    private String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(new Date());
    }
}
