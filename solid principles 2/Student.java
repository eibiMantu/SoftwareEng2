public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Refactored: Depends on abstraction, not concrete types
    public void borrowResource(LibraryResource resource) {
        resource.borrow();
    }
}