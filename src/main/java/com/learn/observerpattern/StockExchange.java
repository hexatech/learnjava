package com.learn.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class StockExchange {

	private double exchangeRate;
	private List<IBroker> brokers = new ArrayList<IBroker>();

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public void addBrokers(List<IBroker> brokers) {
		for(IBroker broker: brokers){
			brokers.add(broker);
		}
	}

	public void addBroker(IBroker broker) {
		brokers.add(broker);
	}
	
	public void notifyNewExchangeRateToRegisteredBrokers(){
		for(IBroker broker: brokers){
			broker.calculateCommision(exchangeRate);
		}
	}

}
