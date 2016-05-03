<%@page import="Classes.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="path"><a href="index.jsp">HOME ></a><a href="CatalogController">CATALOG</a></div>
    <% ArrayList<Product> pro=(ArrayList<Product>)request.getAttribute("pro");
       ArrayList<String> Cat=(ArrayList<String>)request.getAttribute("Cat");
    %>    
    <%@include file="site-navigation.jsp" %>
    <%@include file="user-navigation.jsp" %>
    <div id="main">   
        <%
        for(String cat:Cat)
        {%>
        <h2><b><a href="CatalogController?catalogCategory=<%=cat%>"><%=cat%></a></b></h2>
        <% 
        for(Product p: pro)
        {
            if(p.getCatalogCategory().equals(cat))
            {%>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="CatalogController?productCode=<%=p.getProductCode().toString()%>"><%=p.getProductName()%></a><br>
            <%}
        }
        }%>
    </div>
<%@include file="footer.jsp" %>