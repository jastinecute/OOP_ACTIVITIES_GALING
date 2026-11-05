/*
JASTINE C. GALING
BSIT - 2B
*/

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Juan Dela Cruz","S001", "BSIT", 2);
        

        College student2 = new College(
              "Juan Dela Cruz","S001", "BSIT", 2, "FHE" 
        );

        System.out.println("=== Student Record ===");
        student1.displayInfo();

        System.out.println("\n=== College Student Record ===");
        student2.displayInfo();

        student1.setYearLevel(3);
        student2.setYearLevel(4);

        student1.setCourse("BSCS");
        student2.setCourse("BSBA");

        System.out.println("\n=== Updated Student Record ===");
        student1.displayInfo();

        System.out.println("\n=== Updated College Student Record ===");
        student2.displayInfo();

/* Guide Questions:
        
 1. Why should the attributes of Student be private instead of public?
      Answer: Private attributes protect data and allow controlled access through getters and setters.

 2. What would happen if CollegeStudent did not call super(...) in its constructor?
      Answer: Java tries to call the parent's no-argument constructor. If it does not exist, a compilation error occurs.
        
 3. What is the benefit of overriding displayInfo() instead of writing a new method with a different name?
       Answer: Overriding lets the child class customize the parent's method while supporting polymorphism.
*/
    }
}