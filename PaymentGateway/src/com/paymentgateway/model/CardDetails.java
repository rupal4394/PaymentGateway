package com.paymentgateway.model;
import java.util.*;
public class CardDetails {

	private int card_id;
	private long cardNumber;
	private Date expiry_date;
	private int cvv;
	private float balance;
	
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "CardDetails [card_id=" + card_id + ", cardNumber=" + cardNumber + ", expiry_date=" + expiry_date
				+ ", cvv=" + cvv + ", balance=" + balance + "]";
	}
	
	
}
