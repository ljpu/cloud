package com.abc;

public class AwsLambda {
	
	// The following function does  work in AWS lambda
	public String alterPayload(String payload) {
		System.out.println("I am in lambda of AWS");
		return payload.toLowerCase().replace('e', '3').replace('l', '1');
//		return payload;  // works
	}
	
	
   // The following function does work in AWS lambda
	public void simplePrint() {
		System.out.println("999999");
	}

}
