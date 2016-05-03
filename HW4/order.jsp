<%@page import="Classes.Cart"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="Classes.OrderItem"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Classes.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME</a> ><a href="#">ORDER</a></div>
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">
        <%DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy hh:mm aa");
            Date date = new Date();
            Order o=(Order)session.getAttribute("order");
            Cart c=(Cart)session.getAttribute("theShoppingCart");
        double sub=0,tax=0;    
        if(o==null || c.getCartItem().isEmpty())
            {%>
            <h2>There are no items in the cart</h2>
            <input type=button onClick="parent.location='CatalogController'" value='RETURN TO CATALOG'>
            <%}
            else
            {
        %>
	<table class="width">
            <%
         
            if(o!= null)
            {
                ArrayList<OrderItem> oi= o.getItem();
            %>
            <tr>
                <td colspan="4"><h3>Invoice</h3></td>
            </tr>
            <tr>
                <td colspan="4">Date : <%= dateFormat.format(date)%><br>
                    <u>Ship To/Bill To</u><br>
                    <%= user.getFirst_Name()%>&nbsp;<%= user.getLast_Name()%><br>
                    <%= user.getAddress_1_Field()%><br>
                    <%= user.getAddress_2_Field() %><br>
                    <%= user.getCity()%>,<%= user.getState()%>,<%= user.getPost_Code()%><br>
                    <%= user.getCountry()%></td>
            </tr>
            <tr>
                <td id="1" class="bottom"><br><br><b>ITEM</b></td>
                <td id="2" class="bottom"><br><br><b>&nbsp;&nbsp;PRICE</b></td>
                <td id="4" class="bottom"><br><br><b>QUANTITY</b></td>
                <td id="3" class="bottom"><br><br><b>&nbsp;&nbsp;TOTAL</b></td>
            </tr>
            <%
                for(OrderItem item :oi)
                {
            %>
            <tr>
                <td><br><%= item.getProduct().getProductName()%></td>
                <td><br>$ <%= item.getProduct().getPrice()%></td>
                <td><br><%= item.getQuantity()%></td>
                <td><br>$ <%= item.getTotal()%></td>
            </tr>
            <%sub=sub+item.getTotal();}
            tax=(sub*10)/100;
             }%>
            <tr>
                <td class="top"></td>
                <td class="top"></td>
                <td class="top"><br><b>SUBTOTAL</b></td>
                <td class="top"><br><b>$ <%= sub%></b></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><br><b>TAX</b></td>
                <td><br><b>$ <%= tax %></b></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><br><b>TOTAL</b></td>
                <td><br><b>$ <%= sub+tax%></b></td>
            </tr>
            <tr>
                <td colspan="4"><br><br><input type=button onClick="parent.location='cart.jsp'" value='BACK TO CART'></td>
            </tr>
            <tr>
                <td colspan="4"><br><input type=button onClick="parent.location='order.jsp'" value='PURCHASE'></td>
            </tr>
	</table><%}%>
    </div>
<%@include file="footer.jsp" %>