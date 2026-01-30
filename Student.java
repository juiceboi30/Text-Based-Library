public class Student extends User {

    public Student(String name) {
        super(name);
    }

    @Override
    public int getBorrowLimit() {
        return 3;
    }

    public void borrow(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}
