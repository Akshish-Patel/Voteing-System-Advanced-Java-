<%@page import="bean.suggestionBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
      <!-- Bootstrap CSS -->
    	<link rel="stylesheet" href="css/bootstrap.min.css">
    	
     <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  
    	<script src="js/jquery-3.2.1.slim.min.js"></script>
    	<script src="js/popper.min.js"></script>    
    	<script src="js/bootstrap.min.js"></script>  
    <style>
        #footersection{
            margin-top:25%;
        }
    </style>
</head>
<body>
<div class="container-fluid" id="cont-3">
        <header id="nav-bar">
          <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a class="navbar-brand" href=index.html  style="color: white; font-weight: 600; margin-top: 15px;">GO VOTE</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon" style="color: white;"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav ml-auto animate__animated animate__bounceInDown" style="padding-right: 50px;">
                <li class="nav-item" >
                  <a class="nav-link" href="index.jsp" style="color:white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Home</a>
                </li>
                <li class="nav-item" >
                  <a class="nav-link" href="processServlet" style="color:white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Dashboard</a>
                </li>
                <li class="nav-item" >
                  <a class="nav-link" href="userSuggestionServlet"  style="color: white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Suggestions</a>
                </li>
                <li class="nav-item" >
                  <a class="nav-link" href="showcontactServlet"  style="color: white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Contact</a>
                </li>
              
                <li class="nav-item">
                  <a class="nav-link" href="user_detail_year.jsp" style="color: white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Users</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="user_cand_year.jsp" style="color: white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Candidates</a>
                </li>
              
                <li class="nav-item" >
                  <a class="nav-link" href="logoutservlet"  style="color: white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Logout</a>
                </li>
              
              </ul>
            </div>
          </nav>
        </header>
        
         <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 style="margin-top: 15px;">Suggestion</h1>
                    </div>
                </div>
            </div>
        </section>
        
<section style="padding-top:50px; padding-botton:50px">
        <div class="container">
            <div class="row">
                <div class="col-md-12" >

	

    <table class="table">
        <tr class="table-info">
            <th>Sno.</th>
            <th>Name</th>
            <th>Email</th>
            <th>Number</th>
            <th>Roll No.</th>
            <th>Suggestion</th>
        </tr>
        <%
		ArrayList<suggestionBean> list = (ArrayList<suggestionBean>)request.getAttribute("list");
		suggestionBean sBean = new suggestionBean();
		int j=1;
		for(int i=0;i<list.size();i++,j++){
			sBean = list.get(i);
		%>
    <tr>
        <td><%=j %></td>
        <td><%=sBean.getName()%></td>
        <td><%=sBean.getEmail()%></td>
        <td><%=sBean.getNumber()%></td>
        <td><%=sBean.getRollno()%></td>
        <td><%=sBean.getSuggestion()%></td>
        
    </tr>

<%}%>
</table>

</div>
</div>
</div>
</section>
<%@ include file="footer.jsp" %>

</body>
</html>