// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;

// public class Supplier {
//     private String name;
//     private String address;
//     private List<Order> orders;

//     public Supplier(String name, String address) {
//         this.name = name;
//         this.address = address;
//         this.orders = new ArrayList<>();
//     }

//     public String getName() {
//         return name;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void addOrder(Order order) {
//         orders.add(order);
//     }

//     public List<Order> getOrders() {
//         return orders;
//     }
// }

// public class Order {
//     private Supplier supplier;
//     private Date date;
//     private List<Item> items;
//     private boolean isReceived;
//     private double payment;

//     public Order(Supplier supplier, Date date, List<Item> items, double payment) {
//         this.supplier = supplier;
//         this.date = date;
//         this.items = items;
//         this.payment = payment;
//     }

//     public Supplier getSupplier() {
//         return supplier;
//     }

//     public Date getDate() {
//         return date;
//     }

//     public List<Item> getItems() {
//         return items;
//     }

//     public boolean isReceived() {
//         return isReceived;
//     }

//     public void setReceived(boolean received) {
//         isReceived = received;
//     }

//     public double getPayment() {
//         return payment;
//     }

//     public void setPayment(double payment) {
//         this.payment = payment;
//     }
// }

// public class Item {
//     private String name;
//     private double price;

//     public Item(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }
// }
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isAvailable;

    public Book(String title, String author, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public String toString() {
        return "Book Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Book ID: " + bookId + "\n" +
                "Availability: " + (isAvailable ? "Available" : "Not Available");
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

public class Supplier {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("Enter an option: ");
            System.out.println("1. Add a book");
            System.out.println("2. Find a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.next();
                    System.out.println("Enter author name: ");
                    String author = scanner.next();
                    System.out.println("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    library.addBook(new Book(title, author, bookId, true));
                    break;

                case 2:
                    System.out.println("Enter book ID: ");
                    int id = scanner.nextInt();
                    Book book = library.findBook(id);
                    if (book != null) {
                        System.out.println(book.toString());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 3:
                    ArrayList<Book> books = library.getBooks();
                    for (Book b : books) {
                        System.out.println(b.toString() + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
    }
}

