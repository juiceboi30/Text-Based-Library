public class Teacher extends User {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    public void borrow(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}
