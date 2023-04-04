import java.util.UUID;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Supplier{
    int id;
    String name;
    String address;
    int seller;
    UUID uuid=UUID.randomUUID();

    
    public void printinfo(){
        System.out.println(this.name);
        //System.out.println(this.id);
        System.out.println(uuid);

        String sellername="";  
    //Switch statement  
    switch(seller){    
    //case statements within the switch block  
    case 1: sellername="Anshuman singh";
    id=1;  
    break;    
    case 2: sellername="Sukhman singh";
    this.id=2;  
    break;    
    case 3: sellername="Govind krishna";
    id=3; 
    //System.out.println("TUM"); 
    break;    
    case 4: sellername="Mudit thakur"; 
    id=4; 
    break;    
    case 5: sellername="Prince Kumar"; 
    id=5; 
    break;    
    default:System.out.println("Invalid Name!");    
    }    
    System.out.println(sellername); 
    System.out.println(this.id);

    }

}
class Order
{
    int p_id;
    int p_type;
    String p_name;
    int quantity;
    int price;
    int total_price;
    int gst;
    Date order_date;

    public void orderinfo()
    {

        String product_type="";  
        //Switch statement  
        switch(p_type){    
        //case statements within the switch block  
        case 1: product_type="Electronics";
        this.p_id=1;
        gst=18; 
        break;    
        case 2: product_type="Garments";
        this.pid=2;
        gst=12;  
        break;    
        case 3: product_type="Fooding";
        this.p_id=3;
        gst=5; 
        break;    
        case 4: product_type="Ornaments"; 
        this.p_id=4;
        gst=3;
        break;    
        case 5: product_type="Wooden"; 
        this.p_id=5;
        gst=28;
        break;    
        default:System.out.println("Invalid Name!");    
        }    
        System.out.println(product_type); 
        System.out.println(this.p_id);
        System.out.println(p_name);
        System.out.println(quantity);
        System.out.println(price);
        int total=quantity*price;
        int a= (total/100)*gst; 
        total_price=total + a;
        System.out.println(total_price);
        System.out.println(date);


    
    }

    class Payment{
        Date date;
        String p_method;
        int pay_id;
        int paid_amount;

        public void paymentinfo(){
            System.out.println(date);
            

        }


    }
}



/*class Order {
     int id;
    Supplier supplier;
    Date orderDate;
    Date expectedDeliveryDate;
     boolean isDelivered;


}



class Payment {
    int id;
    Order order;
    Date paymentDate;
    double amount;

}

public class PurchaseSystem {
    private List<Supplier> suppliers;
    private List<Order> orders;
    private List<Payment> payments;

    public PurchaseSystem() {
        this.suppliers = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier) {
        this.suppliers.add(supplier);
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<Order> getUndeliveredOrders() {
        List<Order> undeliveredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (!order.isDelivered()) {
                undeliveredOrders.add(order);
            }
        }
        return undeliveredOrders;
    }
}

    public List<Payment> getPaymentsByDateRange(Date startDate, Date endDate) {
        List<Payment> paymentsByDateRange = new ArrayList<>();
        for (Payment payment : payments)
    }*/
public class project {
    public static void main(String args[]){
        Supplier s1 = new Supplier();
        s1.name="Aryan";
        //s1.id=5;
        s1.seller=5;
        s1.printinfo();
        Supplier s2 = new Supplier();
        s2.name="Ravi";
        //s2.id=6;
        s2.seller=2;
        s2.printinfo();

        Supplier S;
        for(int i=1;i<n;i++){
            s = new Supplier();
        }


    }
    
    
}
