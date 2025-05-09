<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="comp/links.jsp" %>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="content_container py-4 d-flex flex-column justify-content-center align-items-center">
    	<h3 class="text-white">Fill feedback form</h3>
    	<form action="<%=application.getContextPath() %>/feedback" method="post" class="mt-3 text-white w-50">
		  
<!-- 		  email field -->
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input placeholder="Enter here" name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		    <div id="emailHelp" class="form-text text:white">We'll never share your email with anyone else.</div>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Phone number</label>
		    <input placeholder="Enter here" name="phone" type="text" class="form-control" id="exampleInputPassword1">
		  </div>
		   <div class="mb-3">
		    <label for="feedbackMessage" class="form-label">Your feedback message</label>
		    <textarea id="feedbackMessage" name="feedback_message" rows="5" placeholder="Enter here" class="form-control"></textarea>
		  </div>
		  
		  <div class="mb-3 form-check">
		    <input type="checkbox" class="form-check-input" id="exampleCheck1">
		    <label class="form-check-label" for="exampleCheck1">Check me out</label>
		  </div>
		  <div class="d-flex justify-content-center">
		  	<button type="submit" class="btn btn-warning mx-2">Submit</button>
		  	<button type="reset" class="btn btn-light mx-2">Reset</button>
		  </div>
		</form>
    </div>
    <%@include file="scripts.jsp"%>
</body>
</html>