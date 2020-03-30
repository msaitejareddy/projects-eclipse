package com.sai.spring.springCoreAdvance.autowire;

public class Payscale {

	int pay;

	public Payscale(int pay) {
		
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Payscale [pay=" + pay + "]";
	}

}
