
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
            default:
                book1 = null;
                book2 = null;
                book3 = null;
        }
    }
    public void removeBook(int slot) {
        switch (slot) {
            case 1 -> book1 = null;
            case 2 -> book2 = null;
            default -> book3 = null;
        }
    }
    public void printLibraryDetail() {
        System.out.println("Library: " + libraryName);
        // white space+
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Publisher: " + book1.publisher);
        System.out.println("Year Published: " + book1.yearPublished);
        System.out.println("Price: $" + book1.price);
            if (book1.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        // white space
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Publisher: " + book2.publisher);
        System.out.println("Year Published: " + book2.yearPublished);
        System.out.println("Price: $" + book2.price);
            if (book2.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        // white space
        System.out.println("Title: " + book3.title);
        System.out.println("Author: " + book3.author);
        System.out.println("Publisher: " + book3.publisher);
        System.out.println("Year Published: " + book3.yearPublished);
        System.out.println("Price: $" + book3.price);
            if (book3.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
    }
    public void checkBookAvailablity(int slot) {
        Book selectedBook = null;
        if (slot == 1) {
            selectedBook = book1;
        } else if (slot == 2) {
            selectedBook = book2;
        } else {
            selectedBook = book3;
        }
        
        if (selectedBook != null) {
            System.out.println(selectedBook.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        Book selectedBook = null;
        switch (slot) {
            case 1:
                selectedBook = book1;
                break;
            case 2:
                selectedBook = book2;
                break;
            default:
                selectedBook = book3;
                break;
        }
        
        if (selectedBook != null) {
            System.out.println("Update price of " + selectedBook.title + "to $ " + newPrice + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book) {
        if (book != null) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.println("Available: " + book.isAvailable);
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
