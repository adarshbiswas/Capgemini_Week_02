// Q.3) Write a program to create a Book class with attributes title,
// author, and price. Add a method to display the book details.

// Create Book class to perform operations
class Book{
//    Provide attributes
    private String title;
    private String author;
    private int price;

//  Create a constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

//  Create getBookDetails method to display book details
    public void getBookDetails(){
//        Display result
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price + "$");
    }
}

// Create class to call main method in it
public class HandleBookDetails {
    public static void main(String[] args) {

//        Create object of Book class
        Book obj = new Book("The Deadly Hallows", "J.K. Rowling", 69);

//        Call method from the class
        obj.getBookDetails();
    }
}
