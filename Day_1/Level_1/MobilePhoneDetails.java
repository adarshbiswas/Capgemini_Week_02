// Q.5) Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics.
// The method is used to retrieve and display this information for each object.

// Create class MobilePhone to perform operations
class MobilePhone {

    // Set attributes
    private String brand;
    private String model;
    private int price;

    // Create a constructor
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Crate method getPhoneDetails to get all the details of phone
    void getPhoneDetails() {
        System.out.println("Mobile brand: " + brand);
        System.out.println("Mobile model: " + model);
        System.out.println("Mobile price: " + price + "$");
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {

        // Create object of MobilePhone class
        MobilePhone obj = new MobilePhone("Realme", "RMX2061", 899);

        // Call method from the class to get the details of the mobile phone
        obj.getPhoneDetails();
    }
}
