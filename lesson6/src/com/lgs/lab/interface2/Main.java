package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator();
		m.newNumber = 4;
		m.number = 9;
		System.out.println("Plus " + m.number + " + "+ m.newNumber + " = " );
		m.plus();
		System.out.println("Minus " + m.number + " - "+ m.newNumber + " = " );
		m.minus();
		System.out.println("Multipy " + m.number + " * "+ m.newNumber + " = " );
		m.multiply();
		System.out.println("Devide " + m.number + " / "+ m.newNumber + " = " );
		m.devide();
		
		
	

	}

}
