
public class Supplier {
    private String name;
    private String address;
    private String contactNumber;
    private String email;

    public Supplier(String name, String address, String contactNumber, String email) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // getters and setters
}
// ---------------------------------
public class Order {
    private Supplier supplier;
    private Date date;
    private List<Item> itemsOrdered;

    public Order(Supplier supplier, Date date, List<Item> itemsOrdered) {
        this.supplier = supplier;
        this.date = date;
        this.itemsOrdered = itemsOrdered;
    }

    // getters and setters
}




public class Item {
    private String name;
    private String description;
    private double price;

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // getters and setters
}

public class GoodsReceived {
    private Supplier supplier;
    private Date date;
    private List<Item> itemsReceived;

    public GoodsReceived(Supplier supplier, Date date, List<Item> itemsReceived) {
        this.supplier = supplier;
        this.date = date;
        this.itemsReceived = itemsReceived;
    }

    // getters and setters
}

public class Payment {
    private Supplier supplier;
    private Date date;
    private double amount;

    public Payment(Supplier supplier, Date date, double amount) {
        this.supplier = supplier;
        this.date = date;
        this.amount = amount;
    }

    // getters and setters
}



// import java.sql.*;

// public class DatabaseManager {
//     private static final String DB_URL = "jdbc:mysql://localhost/purchases";
//     private static final String DB_USER = "root";
//     private static final String DB_PASS = "password";

//     public static void insertSupplier(Supplier supplier) throws SQLException {
//         try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//              PreparedStatement stmt = conn.prepareStatement("INSERT INTO suppliers (name, address, contact_number, email) VALUES (?, ?, ?, ?)")) {
//             stmt.setString(1, supplier.getName());
//             stmt.setString(2, supplier.getAddress());
//             stmt.setString(3, supplier.getContactNumber());
//             stmt.setString(4, supplier.getEmail());
//             stmt.executeUpdate();
//         }
//     }

//     public static void insertOrder(Order order) throws SQLException {
//         try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//              PreparedStatement stmt = conn.prepareStatement("INSERT INTO orders (supplier_id, date) VALUES (?, ?)")) {
//             stmt.setInt(1, getSupplierId(order.getSupplier()));
//             stmt.setDate(2, new java.sql.Date(order.getDate().getTime()));
//             stmt.executeUpdate();
//         }
//         int orderId = getLastInsertId();
       
