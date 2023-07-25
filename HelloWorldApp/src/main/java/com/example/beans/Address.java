package com.example.beans;

public class Address {
	private String line;
	private String city;
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[line=" + line + ", city=" + city + "]";
	}
	

}
