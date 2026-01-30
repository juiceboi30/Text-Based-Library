public abstract class User implements Borrowable {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract int getBorrowLimit();
}
