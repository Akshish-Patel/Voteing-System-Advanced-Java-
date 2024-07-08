<%@page import="bean.candidateBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <style>
      .td-1{
          text-align: center;
          padding-top: 20px;
          
      }
     
    </style>
</head>
<body>
    <div class="container-fluid" id="cont-3">
       <%@ include file="header.jsp" %>
    


    </section>
    <section id="center">
    <div class="container">
        <div class="row">
            <div class="col-md-6" >
                <h1 style="padding-top: 20px;">Confirmation</h1>
                <form action="SavedData_1_servlet" method="post" id=ConfirmForm> 
                <table>
                    <tr>
                        <td class="td-1">Name :</td>
                        <td class="td-1"><input type="text" style="text-align: left;" name="txtName" required></td>
                    </tr>
                    <tr>
                        <td class="td-1">Email :</td>
                        <td class="td-1"><input type="email" style="text-align: left;" name="txtEmail" required></td>
                    </tr>
                    <tr>
                        <td class="td-1">Branch :</td>
                        <td class="td-1"><input type="text" style="text-align: left;" name="txtBranch" required></td>
                    </tr>
                    <tr>
                        <td class="td-1">Mobile Number :</td>
                        <td class="td-1"><input type="number" style="text-align: left;" name="txtNumber" required pattern="[6-9]{1}[0-9]{9}"></td>
                    </tr>
                    <tr>
                        <td class="td-1">Which Candidate :</td>
					<td class="td-1"><select required name="txtCand" required>
            <option>--------Select--------</option>
           <%
           	ArrayList<candidateBean> list = (ArrayList<candidateBean>)request.getAttribute("list");
           	
           	for(int i=0; i<list.size(); i++)
         	{
         		candidateBean candBean = list.get(i);
           %>
        <option><%=candBean.getName()%></option>
        <%} %>			
					</select></td>
                    </tr>
                    <tr>
                        <td class="td-1">Roll No. :</td>
                        <td class="td-1" required><input type="number" style="text-align: left;" name="txtRollNo"></td>
                    </tr>
                    <tr>
                        <td class="td-1">Reason :</td>
                        <td class="td-1"><textarea style="text-align: left;" name="txtReason" id="" cols="23" rows="4" placeholder="Why You Vote This Candidate any Reason ?"></textarea></td>
                    </tr>
                    <tr>
                        <td class="td-2" id style="padding-top: 20px; padding-bottom: 40px;" ><button class="magnifyBtn" name="Submit">Submit</button></td>
                    </tr>
                </table>
              </form>
            </div>
            <div class="col-md-6" style="padding-top: 50px;">
                <img src="img/7.svg" alt="" srcset="">
            </div>
        </div>
    </div>
</section>
<div class="container-fluid">
    <div class="row">
      <div class="col-md-6">
        <hr>
        <div class="Footer">
        <ul style="display: flex;">
                  <li style="list-style: none; padding: 10px; "><a href="index.jsp" style="text-decoration: none; color: #a517ba;">Home</a></li>
                  <li style="list-style: none; padding: 10px; "><a href="about.jsp" style="text-decoration: none; color: #a517ba;">About</a></li>
                  <li style="list-style: none; padding: 10px; "><a href="suggestion.jsp" style="text-decoration: none; color: #a517ba;">Suggestion</a></li>
                  <li style="list-style: none; padding: 10px; "><a href="contact_form.jsp" style="text-decoration: none; color: #a517ba;">Contact</a></li>
                </ul>
        </div>
      </div>
      <div class="col-md-6">
        <hr>
        <div class="social-icon">
          <ul >
                          <li>
                              <a href="">
                                  <i class="fa fa-facebook"></i>
                              </a>
                          </li>
                          <li>
                              <a href="">
                                  <i class="fa fa-google-plus"></i>
                              </a>
                          </li>
                          <li>
                              <a href="">
                                  <i class="fa fa-linkedin"></i>
                              </a>
                          </li>
                          <li>
                              <a href="">
                                  <i class="fa fa-twitter"></i>
                              </a>
                          </li>
                          <li>
                              <a href="">
                                  <i class="fa fa-pinterest"></i>
                              </a>
                          </li>
                      </ul>
        </div>
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