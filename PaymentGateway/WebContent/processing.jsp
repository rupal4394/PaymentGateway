<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.paymentgateway.model.RSA" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<html>
	<head>
		<link rel = "stylesheet" type = "text/css"  href = "login.css" />
 	</head>
	<body id="LoginForm">
		<div class="container">
            <div class="login-form">
            	<div class="main-div">
					<form  action="payment" method="post" id="paymentForm">
                    	<div class="form-group">
                        	<label for="cc_name">Card Holder's Name</label>
                            <p class="form-control" ><%=request.getParameter("cc_name") %></p>
                   		</div>
                        <div class="form-group">
                        	<label>Card Number</label>
                            <p  class="form-control"><%=request.getParameter("cc_no") %></p>
                        </div>
                        <div class="form-group row">
                        	<label class="col-md-12">Card Exp. Date</label>
                            <div class="col-md-4">
                            	<p class="form-control" ><%=request.getParameter("cc_exp_mo") %></p>
                   			</div>
                            <div class="col-md-4">
                            	<p class="form-control"><%=request.getParameter("cc_exp_yr") %></p>
                           	</div>
                            <div class="col-md-4">
                            	<p class="form-control"><%=request.getParameter("cvv") %></p>
                       	    </div>
                    	</div>
                        <div class="row">
                        	<label class="col-md-12">Amount</label>
                        </div>
                        <div class="form-inline">
                        	<div class="input-group">
                            	<div class="input-group-prepend"><span class="input-group-text">$</span></div>
                                <p class="form-control text-right"><%=request.getParameter("amount") %></p>
                                <div class="input-group-append"><span class="input-group-text">.00</span></div>
                            </div>
                        </div>
                        <hr>
                        <%
                        
                        
                        %>
                        <div class="form-group row" >
                        	<div class="col-md-6">
                            	<button type="submit" name="action" value="cancel" class="btn btn-primary">Cancel</button>
                            </div>
                            <div class="col-md-6">
                            	<button type="submit" name="action" value="pay" class="btn btn-primary">Confirm</button>
                        	</div>
                        </div>
                	</form>
                </div>
            </div>
         </div>     	
	</body>
</html>
