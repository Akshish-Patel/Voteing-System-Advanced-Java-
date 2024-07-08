<%@page import="bean.validationBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
         <style>
        .card-5{
            border: 2px black solid;
            padding: 30px;
            margin-top:5%;
            width:70%;
            margin-left:auto;
            margin-right:auto;
            
        }
        #footersection{
            margin-top:18%;
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
                        <h1 style="margin-top: 15px;">ADMIN DASHBOARD</h1>
                    </div>
                </div>
            </div>
        </section>
     
          <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="card-5">
            <h2><strong>Result</strong></h2>
            <hr>
            <%
            	ArrayList<validationBean> list = (ArrayList<validationBean>)request.getAttribute("list");
            	
            	//ArrayList<validationBean> list = (ArrayList)request.getAttribute("list");
            	validationBean vBean = new validationBean();
            		for(int i=0;i<list.size();i++)
            	{
            		vBean = list.get(i);
            		String name = vBean.getCandidate();
            		String result = vBean.getResult() + "%";
         
            %>
			  <strong><%=vBean.getCandidate()%> = <%=vBean.getResult()%> </strong><br>
	  <div class='progress'>
    	<div class='progress-bar progress-bar-striped bg-success progress-bar-animated' role='progressbar' aria-valuenow="<%=name%>" aria-valuemin="0" aria-valuemax="1000" style='width: <%=result%>'>
    	</div>
  	</div>

            <%} %>
        </div>
    </div>
</div>

</div>
          <!-- JS -->
        
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script 0src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
        <%@ include file="footer.jsp" %>
</body>
</html>