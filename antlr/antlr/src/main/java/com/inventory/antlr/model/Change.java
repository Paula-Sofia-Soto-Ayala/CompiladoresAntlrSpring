package com.inventory.antlr.model;

public class Change {
    private String action;
        private String name;
        private int quantity;
        private String description;
        private String category;
        private String timestamp;
    
        public Change(String action, String name, int quantity, String description, String category, String timestamp) {
            this.action = action;
            this.name = name;
            this.quantity = quantity;
            this.description = description;
            this.category = category;
            this.timestamp = timestamp;
        }
    
        // Getters
        public String getAction() {
            return action;
        }
    
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
    
        public String getTimestamp() {
            return timestamp;
        }
    
        // Setters
        public void setAction(String action) {
            this.action = action;
        }
    
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
    
        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    
}
