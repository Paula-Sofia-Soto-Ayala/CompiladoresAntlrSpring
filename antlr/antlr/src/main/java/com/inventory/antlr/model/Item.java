package com.inventory.antlr.model;

public class Item {
    private String name;
        private int quantity;
        private String description;
        private String category;
    
        public Item(String name, int quantity, String description, String category) {
            this.name = name;
            this.quantity = quantity;
            this.description = description;
            this.category = category;
        }
    
        // Getters
        public String getName() {
            return name;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public String getDescription() {
            return description;
        }
    
        public String getCategory() {
            return category;
        }
    
        // Setters
        public void setName(String name) {
            this.name = name;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public void setCategory(String category) {
            this.category = category;
        }
    }
    
