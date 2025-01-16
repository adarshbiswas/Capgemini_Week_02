// Q.4) Create an Item class with attributes itemCode, itemName, and price.
// Add a method to display item details and calculate the total cost for a given quantity.

// Create Item class
class Item {
    // Set attributes
    private int itemCode;
    private String itemName;
    private int price;

    // Create Constructor
    Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // create getItemDetails method to get the item details
    void getItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price + "$");
    }

    // Create calculateCost method to calculate the total cost for a given quantity.
    int calculateCost(int quantity) {
        return price * quantity;
    }

}

public class TrackInventoryOfItems {
    public static void main(String[] args) {

        // Create object of Item class
        Item obj = new Item(2714, "Asus TUF A15", 2499);
        // Call method from the class to get details
        obj.getItemDetails();

        int quantity = 3;
        // Get the cost of given quantity
        int totalCost = obj.calculateCost(quantity);

        // Display total cost of given quantity
        System.out.println("The total cost for given quantity " + quantity + " is: " + totalCost);

    }
}
