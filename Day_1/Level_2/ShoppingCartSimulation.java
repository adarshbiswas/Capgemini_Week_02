// Q.5) Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
//Add an item to the cart.
//Remove an item from the cart.
//Display the total cost.

// Import all necessary classes and packages
import java.util.ArrayList;
import java.util.Scanner;

// Create CartItem class
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor for CartItem class
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set quantity (for removal or update)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }
}

// Create a ShoppingCart class
class ShoppingCart {

    // Set attributes
    private ArrayList<CartItem> cartItems;

    // Constructor for ShoppingCart class
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println(quantity + " more of " + itemName + " added to the cart.");
                return;
            }
        }
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total cost of the cart: $" + totalCost);
    }

    // Method to display the items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("=== Shopping Cart ===");
        for (CartItem item : cartItems) {
            System.out.println(item.getItemName() + " - $" + item.getPrice() + " x " + item.getQuantity() + " = $"
                    + item.getTotalCost());
        }
        System.out.println("=====================");
    }
}

// Create class that contains the Main method
public class ShoppingCartSimulation {
    public static void main(String[] args) {

        // Create instance of scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Call the constructor of ShoppingCart class
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display cart items");
            System.out.println("4. Display total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    cart.removeItem(itemToRemove);
                    break;

                case 3:
                    cart.displayCartItems();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting the shopping cart system. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}