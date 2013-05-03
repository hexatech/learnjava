package com.learn.observerpattern;

public class JPBroker implements IBroker {
	
	public void calculateCommision(double exchangeRate) {
		System.out.println("JP broker charged commision of "
				+ (exchangeRate * 0.03));
	}
}
