package com.weborder;

import java.util.Random;

public class Dene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String cardNumber = "";
		for (int i = 0; i < 16; i++) {
			
			cardNumber += r.nextInt(9);
		}
		System.out.println(cardNumber);
		
	}

}
