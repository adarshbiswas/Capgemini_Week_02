// Q.2) Write a program to create a Circle class with an attribute radius.
// Add methods to calculate and display the area and circumference of the circle.

// Create Circle class to perform operations
class Circle {
    // Set attributes
    private int radius;

    // Create a constructor
    Circle(int radius) {
        this.radius = radius;
    }

    // Use getAreaOfCircle method to get the area of circle
    public void getAreaOfCircle() {
        double area = (Math.PI) * (Math.pow(radius, 2));
        System.out.printf("The Area of Circle is: %.2f\n", area); // Display area of circle
    }

    // Use getCircumferenceOfCircle method to get the circumference of circle
    public void getCircumferenceOfCircle() {
        double circumference = (2 * Math.PI) * radius;
        System.out.printf("The Circumference of Circle is: " + String.format("%.2f", circumference)); // Display
                                                                                                      // circumference
                                                                                                      // of circle
    }
}

// Create another class to call the main method
public class AreaOfCircle {
    public static void main(String[] args) {

        // Create object of Circle class
        Circle obj = new Circle(5);

        // Call the method using object from Circle class
        obj.getAreaOfCircle();
        obj.getCircumferenceOfCircle();
    }
}