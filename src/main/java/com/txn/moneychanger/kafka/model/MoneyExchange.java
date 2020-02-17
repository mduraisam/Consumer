/**
 * 
 */
package com.txn.moneychanger.kafka.model;


public class MoneyExchange {

	private String currency;
	private String type;
	private double rate;
	private double convertedRate;
	
	public MoneyExchange(String currency, String type, double rate,double convertedRate) {
		this.currency = currency;
		this.type = type;
		this.rate = rate;
		this.convertedRate = convertedRate;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getConvertedRate() {
		return convertedRate;
	}
	public void setConvertedRate(double convertedRate) {
		this.convertedRate = convertedRate;
	}
	
	
}
