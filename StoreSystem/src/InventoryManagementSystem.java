import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem {
    private final List<Vendor> vendors;
    private final List<Bill> bills;
    private final List<Item> items;

    public InventoryManagementSystem() {
        items = new ArrayList<>();
        vendors = new ArrayList<>();
        bills = new ArrayList<>();

    }

    public void addGoods(Item item) {
        items.add(item);
    }

    public void viewVendors() {
        for (Vendor vendor : vendors) {
            System.out.println("Vendor Name: " + vendor.getVendorName());
            System.out.println("Contact Info: " + vendor.getContactInfo());
            System.out.println("-----------------------------");
        }
    }

    public void viewGoods() {
        for (Item item : items) {
            System.out.println("Item Name: " + item.getItemName());
            System.out.println("Category: " + item.getCategory().getCategoryName());
            System.out.println("Vendor: " + item.getVendor());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("-----------------------------");
        }
    }

    /**
     *
     */
    public void viewBills() {
        for (Bill bill : bills) {
            System.out.println("Bill Number: " + bill.getBillNumber());
            System.out.println("Date: " + bill.getDate());
            System.out.println("Total Amount: " + bill.getTotalAmount());
            System.out.println("Items Purchased:");
            for (Item item : bill.getItems()) {
                System.out.println("- " + item.getItemName());
            }
            System.out.println("-----------------------------");
        }
    }

    public void issueGoods(Bill bill) {
        bills.add(bill);
        for (Item item : bill.getItems()) {
            int currentQuantity = item.getQuantity();
            item.setQuantity(currentQuantity - 1);
        }
    }

    public void viewIssuedGoods() {
        for (Bill bill : bills) {
            System.out.println("Bill Number: " + bill.getBillNumber());
            System.out.println("Date: " + bill.getDate());
            System.out.println("Total Amount: " + bill.getTotalAmount());
            System.out.println("Items Issued:");
            for (Item item : bill.getItems()) {
                System.out.println("- " + item.getItemName());
            }
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        // Example usage of the InventoryManagementSystem
        InventoryManagementSystem system = new InventoryManagementSystem();

        // Create item categories
        ItemCategory FrozenProduct = new ItemCategory("Frozen Products");
        ItemCategory Meat = new ItemCategory("Meat");
        // Add more categories...

        // Create items
        Item item1 = new Item("Waffles", FrozenProduct, "Vendor A", 20.99, 25);
        Item item2 = new Item("Beef", Meat, "Vendor B", 17.99, 15);
        // Add more items...

        // Add items to the system
        system.addGoods(item1);
        system.addGoods(item2);
        // Add more items...

        // View all goods
        system.viewGoods();

        // View all vendors
        system.viewVendors();

        // Create a bill
        List<Item> purchasedItems = new ArrayList<>();
        purchasedItems.add(item1);
        purchasedItems.add(item2);
        Bill bill = new Bill(1, new Date(), 794.6,purchasedItems);

        // Issue goods and update quantities
        system.issueGoods(bill);

        // View issued goods
        system.viewIssuedGoods();
    }
}
