<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <title>Content Page</title>
        <style>
           .anand
           {
               height: 200px
           }
           body{
               background-color: skyblue;
               
           }
            </style>
    </head>
    <body>
        
        <%@include file="menu.jsp" %>
        <div>    
            <div class="container">
                <!--Slider Code-->
        <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
    <center>        
  <div class="carousel-inner">
      
    <div class="carousel-item active">
        <img src="Images/1.jpg" class="anand" alt="..."width="1000px">
   
      </div>
     
    <div class="carousel-item active">
      <img src="Images/1.jpg" class="anand" alt="..."width="1000px">
    </div>
        
       
    <div class="carousel-item">
      <img src="Images/1.jpg" class="anand" alt="..."width="1000px">
    </div>
      </center>
  </div>
        
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button> 
        </div>
        </div>
            <style>
           .form
           {
               height: 30px
           }
            </style>
            <center>
            
             </center>
            </div>
         <%@include file="footer.jsp" %>