package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable{
 
   private String Order_Number;
   private Date Date;
   private User User;
   private ArrayList<OrderItem> Item;
   private double Tax_Rate;
   private float Total_Cost;
   private boolean Paid;

    public Order() {
        Item=new ArrayList<>();
    }

    public String getOrder_Number() {
        return Order_Number;
    }

    public void setOrder_Number(String Order_Number) {
        this.Order_Number = Order_Number;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }

    public ArrayList<OrderItem> getItem() {
        return Item;
    }

    public void setItem(ArrayList<OrderItem> Item) {
        this.Item = Item;
    }

    public double getTax_Rate() {
        return Tax_Rate;
    }

    public void setTax_Rate() {
        this.Tax_Rate = 12.5;
    }

    public float getTotal_Cost() {
        return Total_Cost;
    }

    public void setTotal_Cost(float Total_Cost) {
        this.Total_Cost = Total_Cost;
    }

    public boolean isPaid() {
        return Paid;
    }

    public void setPaid(boolean Paid) {
        this.Paid = Paid;
    }

    public void updateTotal()
    {
        double total=0.0;
        for(OrderItem oi:Item)
        {
            total=total+(oi.getProduct().getPrice()*oi.getQuantity());
        }
    }
}