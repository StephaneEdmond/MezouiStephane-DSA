import java.util.Date;
import java.util.List;
public class Bill {
    private int billNumber;
    private Date date;
    private double totalAmount;
    private List<Item> items;

    public Bill(int billNumber, Date date, double totalAmount, List<Item> items) {
        this.billNumber = billNumber;
        this.date = date;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
