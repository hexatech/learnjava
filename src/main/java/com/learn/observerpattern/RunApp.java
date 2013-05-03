package com.learn.observerpattern;

import java.util.Scanner;

public class RunApp {

	public static void main(String[] args) {
		final StockExchange exchange = new StockExchange();
		
		IBroker mfBroker = new MFBroker();
		IBroker jpBroker = new JPBroker();
		
		exchange.addBroker(jpBroker);
		exchange.addBroker(mfBroker);
		
		Thread task = new Thread(){
			public void run(){
				while(true){
					Scanner scanner = new Scanner(System.in);
					String input = scanner.nextLine();
					exchange.setExchangeRate(Double.valueOf(input));
					exchange.notifyNewExchangeRateToRegisteredBrokers();
				}
			}
		};
		
		task.start();
		
		
		
		
	}

}
