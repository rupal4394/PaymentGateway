package com.payment;

import com.paymentgateway.model.RSA;
import java.security.PublicKey;


public class KeyGeneration {

	public static void main(String[] args) throws Exception {
		
		RSA.generateKeyPair();
		byte [] name = RSA.encrypt(RSA.privateKey, "rupal");
		System.out.println(new String(name));
		
		byte [] dec= RSA.decrypt(RSA.pubKey, name);
		System.out.println("\n\nDecrypted   :"+new String(dec));
	
		
	}

}
