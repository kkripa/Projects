package Classes;

import java.io.Serializable;

public class OrderItem implements Serializable{
   
    private Product Product;
    private int Quantity;

    public OrderItem() {
    }

    public OrderItem(Product Product, int Quantity) {
        this.Product = Product;
        this.Quantity = Quantity;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public double getTotal()
    {
        double Total;
        Total= Quantity * Product.getPrice();
        return Total;
    }
}
