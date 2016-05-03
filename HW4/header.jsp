<%@page import="Classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>The Guitar Shopee, Once you play, it becomes a remembrance for life</title>
	<link href="style.css" rel="stylesheet" type="text/css"/>
        <link href="images/favicon.ico" rel="icon" type="image/x-icon" />
	<meta charset="UTF-8">
    </head>
    <body>
        <%
            User user=(User)session.getAttribute("theUser");
            if(user==null)
            {%>
                <div id="signin">Not Signed In</div>
            <%}
            else
            {%>
                <div id="signin"><%=user.getFirst_Name()%>&nbsp;<%= user.getLast_Name()%></div>
            <%}%>
        <div id="header"><img src="images/logo.gif" alt="Logo"></div>
   
