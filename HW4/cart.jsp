
<%@page import="Classes.Product"%>
<%@page import="Classes.OrderItem"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Classes.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME</a> ><a href="#">CART</a></div>
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">
        <form action="OrderController" method="POST">
	<%Cart cart=(Cart)session.getAttribute("theShoppingCart");
        double sub=0;    
        if(cart==null || cart.getCartItem().isEmpty())
            {%>
            <h2>There are no items in the cart</h2>
            <input type=button onClick="parent.location='CatalogController'" value='RETURN TO CATALOG'>
            <%}
            else
            {
        %>
        <table class="width">
            <tr>
                <td><h2>Your Cart</h2></td>
                <td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To remove an item, change the quantity to zero.</td>
            </tr>
            <tr>
                <td id="1" class="bottom"><b>ITEM</b></td><td id="2" class="bottom"><b>&nbsp;&nbsp;PRICE</b></td>
                <td id="4" class="bottom"><b>&nbsp;&nbsp;QUANTITY</b></td><td id="3" class="bottom"><b>&nbsp;&nbsp;TOTAL</b></td>
            </tr>
            <% ArrayList<OrderItem> oi=cart.getCartItem();
                for(OrderItem o:oi)
                {%>
            <tr>
                <td><br><%=o.getProduct().getProductName()%></td>
                <td><br>$ <%=o.getProduct().getPrice()%></td>
                <td><br><input type="text" name="<%=o.getProduct().getProductCode()%>" value="<%=o.getQuantity()%>" size="15" pattern="[0-9]" title="Quantity can contain only Numeric Values(0-9)" required name=Quantity>
                    <input type="hidden" name="productCode" value="<%=o.getProduct().getProductCode()%>">
                </td>
                <td><br>$ <%=o.getTotal()%></td>
            </tr>
            <%sub=sub+o.getTotal();}%>
            <tr>
                <td class="top"></td>
                <td class="top"></td>
                <td class="top"><br><b>SUBTOTAL</b></td>
                <td class="top"><br><b>$ <%=sub%></b></td>
            </tr>
            <tr>
                <td colspan="4"><br><br><button type="submit" name="action" value="updateCart">UPDATE CART</button></td>
            </tr>
            <tr>
                <td colspan="4"><br><button type="submit" name="action" value="checkout">CHECKOUT</button></td>
            </tr>
	</table><%}%>
    </form>
    </div>
<%@include file="footer.jsp" %>
