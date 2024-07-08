<%@page import="bean.candidateBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
</head>
<body>
     <!-- Required meta tags -->
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

 <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">

 <!-- Bootstrap CSS -->
 <link rel="stylesheet" href="css/bootstrap.min.css">
 <link rel="stylesheet" href="css/style.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
 <title></title>
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
                  <a class="nav-link" href="admin_dashboard.jsp" style="color:white; font-weight: 600; text-align: center; font-size: 18px; margin-top: 20px;  text-transform: capitalize; padding: 20px;">Dashboard</a>
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
				<th>Branch</th>
				<th>Roll No.</th>
				<th>Enroll ID</th>
				<th>status</th>
				<th>Action</th>
			</tr>
			
			 <%
           	ArrayList<candidateBean> list = (ArrayList<candidateBean>)request.getAttribute("list");
           	int j=1;
           	String status;
           	String action;
         
           	for(int i=0; i<list.size(); i++,j++)
         	{
         		candidateBean candBean = list.get(i);
           %>
		<tr>
			<td><%=j%></td>
			<td><%=candBean.getName()%></td>
			<td><%=candBean.getEmail()%></td>
			<td><%=candBean.getMobile()%></td>
			<td><%=candBean.getBranch()%></td>
			<td><%=candBean.getRollno()%></td>
			<td><%=candBean.getEnrollment()%></td>
			<td>
			<%
				if(candBean.getApproveStatus() == 2){
					out.print("Pending");
				}else if(candBean.getApproveStatus() == 1){
					out.print("Approved");
				}else{
					out.print("Rejected");
				}
			%>
			
			</td>
			
			<td>
				<%					
					if(candBean.getApproveStatus() == 2)
					{%>
						<a href="change_status_servlet?id=<%=candBean.getId()%>&status=1" class="btn btn-success">Approve</a>	
					<%}else if(candBean.getApproveStatus() == 1)
					{%>
						<a href="change_status_servlet?id='<%=candBean.getId()%>'&status=2" class="btn btn-danger">Reject</a>
					<%}else if(candBean.getApproveStatus() == 0)
					{%>
						<a href="change_status_servlet?id='<%=candBean.getId()%>'&status=1" class="btn btn-success">Approve</a>
						<a href="change_status_servlet?id='<%=candBean.getId()%>'&status=2" class="btn btn-danger">Reject</a>
					<%}%>
			</td>
	        </tr>	
	    <%} %>
		</table>
    
        </div>
            </div>
        </div>
    </section>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
      
        <script src="js/jquery-3.2.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>    
        <script src="js/bootstrap.min.js"></script>  
   
</body>
</html>