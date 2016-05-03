package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable{
 
    ArrayList <OrderItem> CartItem;

    public ArrayList<OrderItem> getCartItem() {
        return CartItem;
    }

    public void setCartItem(ArrayList<OrderItem> CartItem) {
        this.CartItem = CartItem;
    }

    public Cart() {
        CartItem = new ArrayList<>();
    }

public void addItem(Product p, int Quantity)
{
OrderItem oi=new OrderItem(p, Quantity);
for(OrderItem oitem: CartItem)
{
if(oitem.getProduct().getProductCode().equals(p.getProductCode()))
{
oitem.setQuantity(oitem.getQuantity() + 1);
return;
}
}
CartItem.add(oi);    
}

public void update(Product product, int quantity)
{
        for(OrderItem oitem: CartItem)
        {
            if(oitem.getProduct().getProductCode().equals(product.getProductCode())){
                if(quantity<0)
                {
                    break;
                }
                if(quantity== 0)
                {
                    removeItem(oitem.getProduct());
                } 
                else 
                {
                    oitem.setQuantity(quantity);
                }
            }
        }
    }
    
    public void removeItem(Product p)
    {
        for(OrderItem i: CartItem)
        {
            if(i.getProduct().getProductCode().equals(p.getProductCode()))
            {   
                CartItem.remove(i);
                break;
            }
        }
    }
    
    
    public void EmptyCart()
    {
        CartItem = null;
    }
}
