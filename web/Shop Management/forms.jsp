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
               <form class="row g-3">
  <div class="">
    <label for="inputEmail4" class="form-label">Email</label>
    <input type="email" class="form" id="inputEmail4">
  </div>
  <div class="">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form" id="inputPassword4">
  </div>
  <div class="">
    <label for="inputAddress" class="form-label">Address</label>
    <input type="text" class="form" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="">
    <label for="inputAddress2" class="form-label">Address 2</label>
    <input type="text" class="form" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="">
    <label for="inputCity" class="form-label">City</label>
    <input type="text" class="form" id="inputCity">
  </div>
  <div class="">
    <label for="inputState" class="form">State</label>
    <select id="inputState" class="form">
      <option selected>Choose...</option>
      <option>Delhi</option>
      <option>Lucknow</option>
    </select>
  </div>
  <div class="">
    <label for="inputZip" class="form-label">Zip</label>
    <input type="text" class="form" id="inputZip">
  </div>
  <div class="">
    <div class="">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <div class="">
    <button type="submit" class="btn btn-primary">Sign in</button>
  </div>
</form>
             </center>
            
            <form class="row row-cols-lg-auto g-3 align-items-center">
  <div class="col-12">
    <label class="visually-hidden" for="inlineFormInputGroupUsername">Username</label>
    <div class="input-group">
      <div class="input-group-text">@</div>
      <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Username">
    </div>
  </div>

  <div class="col-12">
    <label class="visually-hidden" for="inlineFormSelectPref">Preference</label>
    <select class="form-select" id="inlineFormSelectPref">
      <option selected>Choose...</option>
      <option value="1">One</option>
      <option value="2">Two</option>
      <option value="3">Three</option>
    </select>
  </div>

  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="inlineFormCheck">
      <label class="form-check-label" for="inlineFormCheck">
        Remember me
      </label>
    </div>
  </div>

  <div class="col-12">
    <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>
            
            <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Example label</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">Another label</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder">
</div>
            
            <div class="row">
  <div class="col">
    <input type="text" class="form-control" placeholder="First name" aria-label="First name">
  </div>
  <div class="col">
    <input type="text" class="form-control" placeholder="Last name" aria-label="Last name">
  </div>
</div>
            
            <div class="row g-3">
  <div class="col">
    <input type="text" class="form-control" placeholder="First name" aria-label="First name">
  </div>
  <div class="col">
    <input type="text" class="form-control" placeholder="Last name" aria-label="Last name">
  </div>
</div>
            <form class="row g-3">
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">Email</label>
    <input type="email" class="form-control" id="inputEmail4">
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">Password</label>
    <input type="password" class="form-control" id="inputPassword4">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">City</label>
    <input type="text" class="form-control" id="inputCity">
  </div>
  <div class="col-md-4">
    <label for="inputState" class="form-label">State</label>
    <select id="inputState" class="form-select">
      <option selected>Choose...</option>
      <option>...</option>
    </select>
  </div>
  <div class="col-md-2">
    <label for="inputZip" class="form-label">Zip</label>
    <input type="text" class="form-control" id="inputZip">
  </div>
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <div class="col-12">
    <button type="submit" class="btn btn-primary">Sign in</button>
  </div>
</form>
            
            </div>
         <%@include file="footer.jsp" %>