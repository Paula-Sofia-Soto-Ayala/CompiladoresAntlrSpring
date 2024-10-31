
import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    static class Item {
        String name;
        int quantity;
        String description;
        String category;

        public Item(String name, int quantity, String description, String category) {
            this.name = name;
            this.quantity = quantity;
            this.description = description;
            this.category = category;
        }
    }

    static class Change {
        String action;
        String name;
        int quantity;
        String description;
        String category;

        public Change(String action, String name, int quantity, String description, String category) {
            this.action = action;
            this.name = name;
            this.quantity = quantity;
            this.description = description;
            this.category = category;
        }
    }

    private List<Item> inventory = new ArrayList<>();
    private List<Change> history = new ArrayList<>();

    public void addItem(String name, int quantity, String description, String category) {
        Item newItem = new Item(name, quantity, description, category);
        inventory.add(newItem);
        history.add(new Change("ADD", name, quantity, description, category));
        System.out.println("Added " + quantity + " of " + name + " to inventory.");
    }

    public void removeItem(String name) {
        for (Item item : inventory) {
            if (item.name.equals(name)) {
                inventory.remove(item);
                history.add(new Change("REMOVE", name, item.quantity, item.description, item.category));
                System.out.println("Removed " + name + " from inventory.");
                return;
            }
        }
        System.out.println("Item " + name + " not found in inventory.");
    }

    public void updateItemQuantity(String name, int quantity) {
        for (Item item : inventory) {
            if (item.name.equals(name)) {
                item.quantity = quantity;
                history.add(new Change("UPDATE", name, quantity, item.description, item.category));
                System.out.println("Updated " + name + " to " + quantity + " in inventory.");
                return;
            }
        }
        System.out.println("Item " + name + " not found in inventory.");
    }

    // Implementar los demás métodos: updateItemDescription, updateItemCategory, showInventory, etc.
}
