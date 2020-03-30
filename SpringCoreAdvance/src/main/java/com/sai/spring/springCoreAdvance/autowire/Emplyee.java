package com.sai.spring.springCoreAdvance.autowire;

public class Emplyee {

	Payscale payscale;

	public Payscale getPayscale() {
		return payscale;
	}

	public void setPayscale(Payscale payscale) {
		this.payscale = payscale;
	}

	@Override
	public String toString() {
		return "Emplyee [payscale=" + payscale + "]";
	}
	
	
	
	
	
	}
	
	
	

