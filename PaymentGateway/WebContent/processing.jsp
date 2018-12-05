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
                            <input class="form-control" name="cc_name" value="<%=request.getParameter("cc_name") %>" readonly>
                   		</div>
                        <div class="form-group">
                        	<label>Card Number</label>
                            <input class="form-control" name="cc_no" value="<%=request.getParameter("cc_no") %>" readonly>
                        </div>
                        <div class="form-group row">
                        	<label class="col-md-12">Card Exp. Date</label>
                            <div class="col-md-4">
                            	<input class="form-control" name="cc_exp_mo" value="<%=request.getParameter("cc_exp_mo") %>" readonly>
                   			</div>
                            <div class="col-md-4">
                            	<input class="form-control" name="cc_exp_yr" value="<%=request.getParameter("cc_exp_yr") %>" readonly>
                           	</div>
                            <div class="col-md-4">
                            	<input class="form-control" name="cvv" value="<%=request.getParameter("cvv") %>" readonly>
                       	    </div>
                    	</div>
                        <div class="row">
                        	<label class="col-md-12">Amount</label>
                        </div>
                        <div class="form-inline">
                        	<div class="input-group">
                            	<div class="input-group-prepend"><span class="input-group-text">$</span></div>
                                <input class="form-control text-right" name="amount" value="<%=request.getParameter("amount") %>" readonly>
                                <div class="input-group-append"><span class="input-group-text">.00</span></div>
                            </div>
                        </div>
                        <hr>
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
