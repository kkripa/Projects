<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME ></a><a href="#">CART</a></div>
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">
	<table class="width">
            <tr>
                <td><h2>Your Cart</h2></td>
                <td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To remove an item, change the quantity to zero.</td>
            </tr>
            <tr>
                <td id="1" class="bottom"><b>ITEM</b></td><td id="2" class="bottom"><b>&nbsp;&nbsp;PRICE</b></td>
                <td id="4" class="bottom"><b>&nbsp;&nbsp;QUANTITY</b></td><td id="3" class="bottom"><b>&nbsp;&nbsp;TOTAL</b></td>
            </tr>
            <tr>
                <td><br>Gibson Billy F. Gibbons Les Paul Aged Goldtop</td>
                <td><br>$ 9,165.99</td><td><br><input type="text" value="1" size="15"></td><td><br>$ &nbsp; 9,165.99</td>
            </tr>
            <tr>
                <td>Martin D45 Dreadnought Acoustic</td>
                <td>$ 8249.99</td><td><input type="text" value="2" size="15"></td>
                <td>$ 16,499.98</td>
            </tr>
            <tr>
                <td class="top"></td>
                <td class="top"></td>
                <td class="top"><br><b>SUBTOTAL</b></td>
                <td class="top"><br><b>$ 25,665.97</b></td>
            </tr>
            <tr>
                <td colspan="4"><br><br><input type=button onClick="parent.location='#'" value='UPDATE CART'></td>
            </tr>
            <tr>
                <td colspan="4"><br><input type=button onClick="parent.location='order.jsp'" value='CHECKOUT'></td>
            </tr>
	</table>
    </div>
<%@include file="footer.jsp" %>
