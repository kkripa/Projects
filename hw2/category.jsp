<%@page import="java.util.ArrayList"%>
<%@page import="Classes.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME ></a><a href="CatalogController">CATALOG ></a><a href="#">CATEGORY</a></div>
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">
        <%
            ArrayList<Product> catpro=(ArrayList<Product>)request.getAttribute("catpro");
            String catalogCategory=(String)request.getAttribute("catalogCategory");
        %>
        <h2><b><%=catalogCategory%></b></h2>
        <%
            for(Product p:catpro)
            { 
        %>
        <br><br>
        <img src="<%=p.getImageURL1()%>" alt="Image" width="220" height="420">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
        <img src="<%=p.getImageURL2()%>" alt="Image" width="220" height="420">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <img src="<%=p.getImageURL3()%>" alt="Image" width="220" height="420">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <img src="<%=p.getImageURL4()%>" alt="Image" width="220" height="420"><br>
        <%=p.getProductName()%><br>
        Retail:$<%=p.getPrice()%><br><br>
        <%=p.getDescription()%><br><br>
        <input type=button onClick="parent.location='cart.jsp'" value='ADD TO CART'><br>
        <%}%>   
        <br><br>
        <input type=button onClick="parent.location='CatalogController'" value='RETURN TO CATALOG'>
    </div>
<%@include file="footer.jsp" %>