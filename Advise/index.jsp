<%-- 
    Document   : index
    Created on : Apr 12, 2015, 12:24:50 AM
    Author     : sourabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
                <link rel="icon" type="image/ico" href="images/favicon.ico">
		<title>WeAdvise</title>
		<link href="css/style.css" rel="stylesheet">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	
		<script>
		$(document).ready(function(){
			$("#menu_show").click(function(){
				$("#side_navigation").toggle(1000);
				$("#text").toggleClass("color");
			});
		});
		</script>
		
	
	</head>
	<body>
	
		<!-- header with navigation -->
			<div id="header">
			<h1 id="logo">We Advise</h1>
			
			</div>
		<!-- end -->
		
		<!-- top navigation -->
			<div id="header_nav">
			<ul >
				<li><a href="login.jsp">Login In</a></li><li><a href="signup.jsp">Sign Up</a></li>
			</ul>
			</div>
		<!-- end -->
		
		<!-- side navigation -->
			<div id="menu_show">
			<p id="text" class="blue">Menu</p>
			</div>
			<div id="side_navigation">
				<ul>Content<hr>
					<li><a href="#">Please Login</a></li><hr>
					<li>Please Login</li><hr>
					<li>Please Login</li><hr>
				</ul>
			</div>
		<!-- end -->
		
		<!-- main space -->
		<div id="mainContainer">
		
			<h2>About WeAdvise:</h2>
			<p><b>Content Goes Here</b></p>
			
		</div>
		<!-- end -->
		
		<!-- footer -->
			<div id="footer">
			<p>Copyright Kripa</p>
			</div>
		<!-- end -->
	
	</body>
</html>