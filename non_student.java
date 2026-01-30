package text-basedlib;

public class non_student extends user {
    public non_student (String name) {
        super(name);
    }

    @Override
    public int getBorrowedlimit() {
        return 2;
    }
    public void  borrow(book Book){
        Book.borrowBook();
    }
    public void returnBook(book Book){
        Book.returnBook();
    }
}
