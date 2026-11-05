/*
JASTINE C. GALING
BSIT - 2B
*/

public class Main {
    public static void main(String[] args) {
    
        Book book1 = new Book("Noli Me Tangere", "Jose Rizal", "ISBN-001", 350.00);
        Book book2 = new Book("El Filibusterismo", "Jose Rizal", "ISBN-002" , 320.00);

        EBook ebook1 = new EBook("Florante at Laura", "Francisco Balagtas", "ISBN-003", 150.00, "PDF");
      
        System.out.println("=== PRINTED BOOK ===");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println("\n=== E-BOOK ===");
        ebook1.displayInfo();
       
        System.out.println("\n=== UPDATING BOOK PRICE ===");
        book2.setPrice(299.50);
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());

        System.out.println("\n=== UPDATED PRINTED BOOK ===");
        book1.displayInfo();

/* 
Reflection Questions:

1. Why is it better to change the price through setPrice()
   instead of making price public?
   Answer: It protects the price from direct access and allows
   validation before changing its value.

2. Which members does EBook inherit from Book, and which does
   it add on its own?
   Answer: EBook inherits the public and protected members of Book.
   It adds its own private fileFormat field and its getter and setter.
   It also overrides displayInfo().

3. If the library later adds an AudioBook class, how would
   inheritance make that easier?
   Answer: AudioBook can extend Book and reuse its title, author,
   price, and displayInfo() method. It only needs to add its own
   properties, such as duration or narrator.
*/
    }
}