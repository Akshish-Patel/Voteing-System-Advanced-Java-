<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
.btn-special-2 {
    padding: 12px 24px;
    background-color: white;
    color: hsl(243, 80%, 62%);
    border-radius: 6px;
    border: 2px hsl(243, 80%, 62%) solid;
    transition: transform 250ms ease-in-out;
}

.btn-special-2:hover {
    transform: scale(1.10);
}

.btn-special-2:active {
    transform: scale(.9);
}
#footersection{
    margin-top:70px;
}
.h2_1{
    text-align:center;
    margin-top:30px;
}

    </style>
</head>
<body>
	<%@ include file="header.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
            <h2 class="h2_1">Select Voting Year</h2>
            <a href="get_cand_1st_servlet"><button style="margin-top:50px;" class="btn-special-2">1<sup>st</sup> Year </button></a>
            </div>
            <div class="col-md-12">
            <a href="get_cand_2nd_servlet"><button style="margin-top:60px;" class="btn-special-2">2<sup>nd</sup> Year </button></a>
            </div>
            <div class="col-md-12">
            <a href="get_cand_3rd_servlet"><button style="margin-top:60px; " class="btn-special-2">3<sup>rd</sup> Year </button></a>
            </div>
        </div>
    </div>

	<%@ include file="footer.jsp" %>    
</body>
</html>
