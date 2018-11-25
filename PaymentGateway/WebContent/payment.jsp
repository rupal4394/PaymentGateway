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
                	<h3 class="text-center">Credit Card Payment</h3>
                    <hr>
                    
                    <form  action="processing.jsp" method="post" id="paymentForm">
                    	<div class="form-group">
                        	<label for="cc_name">Card Holder's Name</label>
                            <input type="text" class="form-control" name="cc_name" >
                   		</div>
                        <div class="form-group">
                        	<label>Card Number</label>
                            <input type="text" class="form-control" name="cc_no" autocomplete="off" title="Credit card number" >
                        </div>
                        <div class="form-group row">
                        	<label class="col-md-12">Card Exp. Date</label>
                            <div class="col-md-4">
                            	<select class="form-control" name="cc_exp_mo" size="0">
                                	<option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                  </select>
                   			</div>
                            <div class="col-md-4">
                            	<select class="form-control" name="cc_exp_yr" size="0">
                                	<option>2018</option>
                                    <option>2019</option>
                                    <option>2020</option>
                                    <option>2021</option>
                                    <option>2022</option>
                               	</select>
                           	</div>
                            <div class="col-md-4">
                            	<input type="text" class="form-control" name="cvv" autocomplete="off" maxlength="3" pattern="\d{3}" title="Three digits at back of your card"  placeholder="CVC">
                       	    </div>
                    	</div>
                        <div class="row">
                        	<label class="col-md-12">Amount</label>
                        </div>
                        <div class="form-inline">
                        	<div class="input-group">
                            	<div class="input-group-prepend"><span class="input-group-text">$</span></div>
                                <input type="text" name="amount" class="form-control text-right" placeholder="00">
                                <div class="input-group-append"><span class="input-group-text">.00</span></div>
                            </div>
                        </div>
                        
                        
                        <hr>
                        <div class="form-group row" >
                        	<div class="col-md-6">
                            	<button type="submit" name="action" value="cancel" class="btn btn-primary">Cancel</button>
                            </div>
                            <div class="col-md-6">
                            	<button type="submit" name="action" value="pay" class="btn btn-primary">Pay</button>
                        	</div>
                        </div>
                	</form>
              	</div>
          	</div>
    	</div>
	</body>
</html>
     