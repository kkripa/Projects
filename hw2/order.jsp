<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME ></a><a href="#">ORDER</a></div>
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">
	<table class="width">
            <tr>
                <td colspan="4"><h3>Invoice</h3></td>
            </tr>
            <tr>
                <td colspan="4">Date : Sep.16,2014<br>
                    <u>Ship To/Bill To</u><br>
                    Radhakrishnan Krishna Kripa<br>
                    Grove Crest Lane<br>Apartment 1602 Colonial<br>
                    Charlotte,NC </td>
            </tr>
            <tr>
                <td id="1" class="bottom"><br><br><b>ITEM</b></td>
                <td id="2" class="bottom"><br><br><b>&nbsp;&nbsp;PRICE</b></td>
                <td id="4" class="bottom"><br><br><b>QUANTITY</b></td>
                <td id="3" class="bottom"><br><br><b>&nbsp;&nbsp;TOTAL</b></td>
            </tr>
            <tr>
                <td><br>Gibson Billy F. Gibbons Les Paul Aged Goldtop</td>
                <td><br>$ 9,165.99</td>
                <td><br>1</td>
                <td><br>$ &nbsp; 9,165.99</td>
            </tr>
            <tr>
                <td>Martin D45 Dreadnought Acoustic</td>
                <td>$ 8,249.99</td>
                <td>2</td>
                <td>$ 16,499.98</td>
            </tr>
            <tr>
                <td class="top"></td>
                <td class="top"></td>
                <td class="top"><br><b>SUBTOTAL</b></td>
                <td class="top"><br><b>$ 25,665.97</b></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><br><b>TAX</b></td>
                <td><br><b>$ 25,66.597</b></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><br><b>TOTAL</b></td>
                <td><br><b>$ 28232.57</b></td>
            </tr>
            <tr>
                <td colspan="4"><br><br><input type=button onClick="parent.location='cart.jsp'" value='BACK TO CART'></td>
            </tr>
            <tr>
                <td colspan="4"><br><input type=button onClick="parent.location='order.jsp'" value='PURCHASE'></td>
            </tr>
	</table>
    </div>
<%@include file="footer.jsp" %>