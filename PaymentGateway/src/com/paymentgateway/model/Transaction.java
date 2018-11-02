package com.paymentgateway.model;

public class Transaction {
	
	private int user_id;
	private int transaction_id;
	private String privateKey;
	private String publicKey;
	private String data;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Transaction [user_id=" + user_id + ", transaction_id=" + transaction_id + ", privateKey=" + privateKey
				+ ", publicKey=" + publicKey + ", data=" + data + "]";
	}
	
	
}
