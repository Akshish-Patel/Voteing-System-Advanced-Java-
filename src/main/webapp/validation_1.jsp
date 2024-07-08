<%@page import="javax.swing.text.Document"%>
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
   <%@  include file="header.jsp" %> 
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="card-5">
            <h2><strong>Result</strong></h2>
            <hr>
            <%
            	ArrayList<validationBean> list = (ArrayList<validationBean>)request.getAttribute("list");
            	validationBean vBean = new validationBean();
            	for(int i=0;i<list.size();i++)
            	{
            		vBean = list.get(i);
            		
         
            %>
			  <strong><%=vBean.getCandidate()%> = <%=vBean.getResult()%> </strong><br>
	  <div class='progress'>
    	<div class='progress-bar progress-bar-striped bg-success progress-bar-animated' role='progressbar' aria-valuenow="<%=vBean.getCandidate()%>" aria-valuemin="0" aria-valuemax="1000" style='width: <%=vBean.getResult()%>%'>
    	</div>
  	</div>

            <%} %>
        </div>
    </div>
</div>

</div>

  	
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<%@ include file="footer.jsp" %>
</body>
</html>
