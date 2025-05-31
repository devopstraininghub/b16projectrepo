This is java new application implementation code please find below !!!!!!!!!!!!!!!!!!

Cheers,
Saikumar

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.*;

class Book {
    int id;
    String title;
    boolean isBorrowed;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book wasn't borrowed.");
        }
    }

    void display() {
        System.out.println(id + ": " + title + " - " + (isBorrowed ? "Not Available" : "Available"));
    }
}

public class LibraryApp {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Book> books = new HashMap<>();
    static int nextId = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Book\n2. View Books\n3. Borrow Book\n4. Return Book\n5. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // flush

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        Book book = new Book(nextId++, title);
        books.put(book.id, book);
        System.out.println("Book added.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book b : books.values()) {
            b.display();
        }
    }

    static void borrowBook() {
        System.out.print("Enter book ID to borrow: ");
        int id = scanner.nextInt();
        Book b = books.get(id);
        if (b != null) {
            b.borrow();
        } else {
            System.out.println("Book not found.");
        }
    }

    static void returnBook() {
        System.out.print("Enter book ID to return: ");
        int id = scanner.nextInt();
        Book b = books.get(id);
        if (b != null) {
            b.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}

