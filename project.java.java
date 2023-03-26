public class project {
    public class Supplier {
        private int id;
        private String name;
        private String address;
        private String contact;
    
        // constructor
        public Supplier(int id, String name, String address, String contact) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.contact = contact;
        }
    
        // getters and setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
        public String getContact() { return contact; }
        public void setContact(String contact) { this.contact = contact; }
    }



    public class Order {
        private int id;
        private Supplier supplier;
        private Date orderDate;
        private List<Item> items;
    
        // constructor
        public Order(int id, Supplier supplier, Date orderDate, List<Item> items) {
            this.id = id;
            this.supplier = supplier;
            this.orderDate = orderDate;
            this.items = items;
        }
    
        // getters and setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public Supplier getSupplier() { return supplier; }
        public void setSupplier(Supplier supplier) { this.supplier = supplier; }
        public Date getOrderDate() { return orderDate; }
        public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
        public List<Item> getItems() { return items; }
        public void setItems(List<Item> items) { this.items = items; }
    }

    

    public class Item {
        private String name;
        private int quantity;
        private double price;
    
        // constructor
        public Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    
        // getters and setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

    

    public class PurchaseRecord {
        private Order order;
        private Date receivedDate;
        private double payment;
    
        // constructor
        public PurchaseRecord(Order order, Date receivedDate, double payment) {
            this.order = order;
            this.receivedDate = receivedDate;
            this.payment = payment;
        }
    
        // getters and setters
        public Order getOrder() { return order; }
        public void setOrder(Order order) { this.order = order; }
        public Date getReceivedDate() { return receivedDate; }
        public void setReceivedDate(Date receivedDate) { this.receivedDate = received;}

        public double getPayment() {
            return payment;
        }

        public void setPayment(double payment) {
            this.payment = payment;
        }
    }

    
    


