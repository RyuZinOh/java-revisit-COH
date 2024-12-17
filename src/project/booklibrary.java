package project;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                break;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("Book has been issued: " + book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book doesn't exist.");
    }
}

public class booklibrary {
    public static void main(String[] args) {
        Library lbs = new Library();
        lbs.addBook("C++");
        lbs.addBook("Charlie and the Chocolate Factory");
        lbs.showBooks();
        lbs.issueBook("C++");
        lbs.issueBook("Sex");
    }
}
