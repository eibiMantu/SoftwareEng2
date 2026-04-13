import java.util.ArrayList;
import java.util.List;

public class TestProgram {
    public static void main(String[] args) {
        // 1. Setup the Student
        Student student = new Student("Jonathan Doe");

        
        LibraryResource book1 = new Book("Design Patterns: Elements of Reusable Object-Oriented Software");
        LibraryResource book2 = new Book("Clean Architecture");
        LibraryResource journal1 = new Journal("ACM Computing Surveys");
        LibraryResource capstone = new LibraryResource() { 
            @Override public String getTitle() { return "AI-Powered Triage System for Vertical Campuses"; }
            @Override public void borrow() { System.out.println("Accessing Capstone: " + getTitle()); }
        };

        
        List<LibraryResource> cart = new ArrayList<>();
        cart.add(book1);
        cart.add(book2);
        cart.add(journal1);
        cart.add(capstone);

        
        System.out.println("--- NEU Library Transaction ---");
        for (LibraryResource resource : cart) {
            student.borrowResource(resource);
        }
        
        System.out.println("\nTransaction Complete for: " + student.getName());
    }
}