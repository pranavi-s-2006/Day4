package com.example.junitdemo.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

	public double calculateDiscount(double amount) {
		
		if(amount<0) {
			throw new IllegalArgumentException("Amount cannot be  negative");
		}
		if(amount>=1000) {
			return amount*0.10;  //10% discount
		}
		else if(amount>=500) {
			return amount*0.5; //5% discount
		}
		else {
			return 0;
		}
	}
	
	public double calculateFinalAmount(double amount) {
		double discount=calculateDiscount(amount);
		return amount-discount;
	}
 
}
