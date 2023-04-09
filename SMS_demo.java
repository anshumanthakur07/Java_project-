

// import java.nio.file.*;
// import java.io.BufferedWriter;
import java.util.ArrayList;
// import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

class Supplier implements Serializable {
     String name;
     int id;
     String date;
     String location;
     long contact;
     ArrayList<String> order_placed;

    public Supplier(String name, int id,long contact, String location) {
        this.name = name;                              
        this.id = id;
        this.contact = contact;
        this.location = location;
        this.order_placed = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public long getContact() {
        return contact;
    }

    public void Place_order(String order) {
        order_placed.add(order);
    }

    public ArrayList<String> Order_placed() {
        return order_placed;
    }
}

public class SMS_demo  {
    private ArrayList<Supplier> suppliers;

    public SMS_demo() {
    suppliers = new ArrayList<Supplier>();
    }
  public static void main(String[] args) throws IOException{
    SMS_demo obj = new SMS_demo();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n************ SUPPLY MANAGEMENT SYSTEM ************");
            System.out.println("1. Add Supplier");
            System.out.println("2. List Supplier");
            System.out.println("3. Assign order");
            System.out.println("4. List order Assigned to Supplier");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
        


            int choice = sc.nextInt();
         

            switch (choice) {
                case 1:
                    obj.add_Supplier();
                    break;
                case 2:
                    obj.Supplier_details();
                    break;
                case 3:
                    obj.get_order();
                    break;
                case 4:
                    obj.Total_order_placed();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

  public void add_Supplier() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID of Supplier: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter name of Supplier: ");
        String name = sc.nextLine();
        
        System.out.print("Enter contact of Supplier: ");
        long contact = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter location of Supplier: ");
        String location = sc.nextLine();

        Supplier supplier = new Supplier(name, id, contact, location);
        suppliers.add(supplier);

        try{
            FileOutputStream writeData = new FileOutputStream("supplier.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
        
            writeStream.writeObject(suppliers);
            writeStream.flush();
            writeStream.close();
            System.out.println("Supplier data  added successfully to file!");
            
        }catch (IOException e) {
            System.out.println("Supplier data NOT added successfully to file!");
        
        }

        // System.out.println("Supplier added successfully");

    }
  public void Supplier_details() throws IOException {

    try
    {
        FileInputStream readData = new FileInputStream("supplier.ser");
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList sup = (ArrayList<Supplier>) readStream.readObject();
        readStream.close();

        System.out.println(sup.toString());

    }
    catch (IOException | ClassNotFoundException e) 
    {
        System.out.println("No data found!");
    }
}
  
  public void get_order() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter supplier ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        // sc.close();

        Supplier supplier = findsupplier_ById(id);
        if (supplier == null) {
            System.out.println("Supplier with ID " + id + " not found");
            return;
        }

        System.out.print("place order details for Supplier: ");
        String order = sc.nextLine();
        supplier.Place_order(order);

        System.out.println("Order successfully placed to the supplier!");

    }
   private Supplier findsupplier_ById(int id) {
        for (Supplier supplier :suppliers) {
            if (supplier.getId() == id) {
                return supplier;
            }
        }

        return null;
    }
  public void Total_order_placed() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter ID of Supplier: ");
        int id = sc.nextInt();
        sc.nextLine();
        // sc.close();

        Supplier supplier = findsupplier_ById(id);
        if (supplier == null) {
            System.out.println("Supplier with ID " + id + " not found");
            return;
        }

        ArrayList<String> orderPlaced= supplier.Order_placed();
        if (orderPlaced.isEmpty()) {
            System.out.println("No order placed to the supplier ID:: " + id);
            return;
        }
        else
        {

        System.out.println("Number of order placed to the supplier ID ::" + id);
        for (String o: orderPlaced) {
            System.out.println(o);
        }
        }
        
    }
  
}