package com.payment;

import com.paymentgateway.model.RSA;

public class KeyGeneration {

	public static void main(String[] args) throws Exception {
		
		RSA.generateKeyPair();
		System.out.println("\n"+RSA.pubKey+"\n"+RSA.privateKey+"\n");
		
		
		
	}

}
