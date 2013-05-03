package com.learn.observerpattern;

public class MFBroker implements IBroker {

	public void calculateCommision(double exchangeRate) {
		System.out.println("MF broker charged commision of "
				+ (exchangeRate * 0.02));
	}

}
