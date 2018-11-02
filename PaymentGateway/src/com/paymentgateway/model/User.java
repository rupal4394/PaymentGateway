package com.paymentgateway.model;

public class User {

	private int user_id;
	private String name;
	private String password;
	private int card_id;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", password=" + password + ", card_id=" + card_id + "]";
	}
	
	
}
