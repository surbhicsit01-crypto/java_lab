// Base class
class LibraryItem {
    String title;
    boolean isCheckedOut = false;

    LibraryItem(String title) {
        this.title = title;
    }

    void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
}

// Book class
class Book extends LibraryItem {
    String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }
}

// DVD class
class DVD extends LibraryItem {
    int duration; // in minutes

    DVD(String title, int duration) {
        super(title);
        this.duration = duration;
    }
}

// Journal class
class Journal extends LibraryItem {
    int issueNumber;

    Journal(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }
}

// Main class
public class LibrarySystemDemo {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling");
        DVD dvd = new DVD("Inception", 148);
        Journal journal = new Journal("Science Today", 45);

        book.checkOut();
        book.returnItem();

        dvd.checkOut();
        dvd.checkOut();

        journal.returnItem();
    }
}