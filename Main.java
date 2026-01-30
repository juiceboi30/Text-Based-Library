public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("This Is Java Beginner Practice", "Johnson Koryon"));
        library.addBook(new Book("OOP Made Easy", "Martin"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        System.out.println();

        library.removeBook("OOP Made Easy");

        System.out.println();

        User student = new Student("Johnson");

        Book book = library.findBook("This Is Java Beginner Practice");
        if (book != null) {
            student.borrow(book);
        }

        System.out.println("\nLibrary Books:");
        library.showBooks();
    }
}
