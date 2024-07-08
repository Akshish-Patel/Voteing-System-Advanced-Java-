<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!--Fonts CDN-->

    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
  
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!--- Custom Css --->
    <link rel="stylesheet" href="css/style.css">

    <!-- Font Awesome CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

  <!-- Internal CSS -->

    <style>
      .slideUpBtn {
    padding: 12px 24px;
    background-color: transparent;
    border: 2px solid hsl(243, 80%, 62%);
    border-radius: 6px;
    position: relative;
    overflow: hidden;
    transition: all 0.5s cubic-bezier(1,.15,.34,.92)
}

.slideUpBtn span {
    display: inline-block;
    transition: inherit;
    color: hsl(243, 80%, 62%);
}

.slideUpBtn:hover span {
    opacity: 0;
    transform: translateY(-100%)
}

.slideUpBtn::before {
    content: "";
    background-color: hsl(243, 80%, 62%);;
    height: 100%;
    left: 0;
    position: absolute;
    top: 0;
    transform: translateY(100%);
    transition: inherit;
    width: 100%;
    transition: transform 0.5s cubic-bezier(1,.15,.34,.92)
}

.slideUpBtn::after {
    content: 'Vote Now';
    align-items: center;
    display: flex;
    height: 100%;
    justify-content: center;
    left: 0;
    position: absolute;
    top: 0;
    transition: inherit;
    transform: translateY(100%);
    width: 100%;

}

.slideUpBtn:hover::before {
    transform: translateY(0) scale(3);
    transition-delay: .025s;
}

.slideUpBtn:hover::after {
    opacity: 1;
    color: hsl(222, 100%, 95%);
    transform: translateY(0);
}
    </style>
<!-- End Internal CSS -->
</head>
<body>

<!------------------  Navbar Section ------------------>

<div class="container-fluid" id="cont-3">
<%@ include file="header.jsp" %>

<!------------------  HomePage Section ------------------>

<section id="banner">
  <div class="container">
    <div class="row">
      <div class="col-md-6 animate__animated animate__bounceInLeft" style="text-align: center;">
        <h1>ONLINE VOTING SYSTEM</h1>
        <p>Online voting systems are software platforms used to securely conduct votes and elections. As a digital platform, they eliminate the need to cast your votes using paper or having to gather in person.</p>
      <a href="year.jsp"><button class="magnifyBtn">VOTE NOW</button></a>
      </div>
      
      <div class="col-md-6"> 
             <img src="img/2.svg" alt="" srcset="" height="400vh " width="90%" class="animate__animated animate__bounceInRight " style="margin-left: 10px; margin-top: 20px;" >
                </div> 
            </div>  
         </div>
        </div>
      </div>
    </div>
</section>
 <!------------------  Space Section ------------------> 
  
<section class="space">
  <div class="container">
    <div class="col-md-12">
      <div class="row">
    
      </div>
    </div>
</section>
</div>

<!------------------  Candidate Section ------------------>

<div class="container">
  <div class="row">
    <div class="col-md-12">     
      <h1>Online Voting System</h1>
    </div>
    <div class="col-md-12" style=" width: 100%; ">
      <img src="img/10.svg" alt="" srcset="">
    </div>


      <div class="col-md-12">
      <a href="year.jsp" ><span ><button style="margin-top: 20px;" class="slideUpBtn">Vote Now</button></span></a>
    </div>  
    </div>
  </div>
  </div>
</div>

<!------------------  About Section ------------------>
<section>
    <div class="container-fluid" style="margin-top: 50px;">
      <div class="row" style="background: linear-gradient(to right, #a517ba,#5f1178 );" width="100%">
        <div class="col-md-12" style="background-image: linear-gradient(to right, #a517ba,#5f1178 ); color: white;">
          <h1 style="text-align: center; background-image: linear-gradient(to right, #a517ba,#5f1178 ); color: white;"> About Voting</h1>
          <p> About Voting In Beif</p>
        </div>
        <div class="col-md-6" >
          <img src="img/4.svg" alt="" srcset="" >
        </div>
        <div class="col-md-6" data-aos="fade-left">
          <h1 style="color: white; margin-top: 40px;" class=" ">About</h1>
          <p style="color: white;" class=" ">Voting is a method for a group, such as a meeting or an electorate, in order to make a collective decision or express an opinion usually following discussions, debates or election campaigns. Democracies elect holders of high office by voting. Residents of a place represented by an elected official are called "constituents", and those constituents who cast a ballot for their chosen candidate are called "voters". There are different systems for collecting votes, but while many of the systems used in decision-making can also be used as electoral systems, any which cater for proportional representation can only be used in elections.</p>
        </div>
      </div>
      </div>
    </div>
</section>
<!------------------  Contact Form Section ------------------>
  <section>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <h1> Contact Form </h1>
          <p style="padding-bottom:50px;">Any Queries , Drop Contact Form  </p>  
        </div>
        <div class="col-md-4" style="border-radius: 6px; border: 3px  #a517ba solid;">
          <h2 style="padding-top: 30px;">Contact Form</h2>
          <form action="contactservlet" method="post">
            <table>
              <tr>
                <label style="float: left; position: absolute; margin-top: 25px; margin-left: -160px; outline:none;"> Name :</label>
				      	<td style="padding-top: 50px;"><input placeholder="Enter Your Name" type="text" name="txtName" ></td>
              </tr>
              <tr >
                <label style="float: left; position: absolute; margin-top: 100px;  px; margin-left: -160px;"> Email :</label>
					      <td style="padding-top: 50px;"><input required placeholder="Enter Your Email id " type="email" name="txtEmail"></td>
              </tr>
              <tr>
                <label style="float: left; position: absolute; margin-top: 175px; margin-left: -160px;"> Message :</label>
                <td style="padding-top: 50px;"><textarea placeholder="Enter Your Message" name="txtMessage" rows="3" cols="22"></textarea></td>
              
              </tr>
              <tr>
              <td style="padding-top: 50px; padding-bottom: 30px;"><button class="magnifyBtn">Submit</button></a></td>
              </tr>
            </table>
          </form>
        </div>
        <div class="col-md-8" style="padding-left: 50px; width: 100%; padding-top: 30px;">
          <img src="img/6.svg" alt="" srcset="">
        </div>
      </div>
    </div>
</section>

<section>
  <div class="container-fluid" style="margin-top: 50px;">
    <div class="row" style="background: linear-gradient(to right, #a517ba,#5f1178 );" width="100%">
      <div class="col-md-12" style="background-image: linear-gradient(to right, #a517ba,#5f1178 ); color: white;">
        <h1 style="text-align: center; background-image: linear-gradient(to right, #a517ba,#5f1178 ); color: white;"> Become Candidate</h1>
        <p>Become a Candidate</p>
      </div>
      <div class="col-md-6" >
        <img src="img/11.svg" style="height: 400px;" >
      </div>
      <div class="col-md-6" data-aos="fade-left">
        <h1 style="color: white; margin-top: 40px; margin-bottom: 40px;" class=" ">Apply</h1>
        <p style="color: white;" >
          If you want to become a candidate, then you click on the link below, then you will be redirected. In the second
           page, by filling that, you can request for a candidateAfter that, the administrator will approve your request so you can become a candidate.
           </p>
           <a href="Insert_candidate.jsp"><button class="magnifyBtn" style="margin-bottom: 40px;">Apply</button></a>
      </div>
    </div>
    </div>
  </div>
</section>

<!------------------  Footer Section ------------------>

<%@ include file="footer.jsp" %>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>  
 
  </body>
</html>