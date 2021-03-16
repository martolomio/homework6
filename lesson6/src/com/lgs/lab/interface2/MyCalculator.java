package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	int number;
	int newNumber;
	
	@Override
	public void devide() {
		System.out.println(number / newNumber);
		Numerable.super.devide();
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNewNumber() {
		return newNumber;
	}

	public void setNewNumber(int newNumber) {
		this.newNumber = newNumber;
	}
	

	@Override
	public void multiply() {
		System.out.println(number * newNumber);
		Numerable.super.multiply();
	}
	
	@Override
	public void minus() {
		System.out.println(number - newNumber);
		Numerable.super.minus();
	}
	
	@Override
	public void plus() {
		System.out.println(number + newNumber);
		Numerable.super.plus();
	}

	@Override
	public String toString() {
		return "MyCalculator [number=" + number + ", newNumber=" + newNumber + ", getNumber()=" + getNumber()
				+ ", getNewNumber()=" + getNewNumber() + ", toString()=" + super.toString() + "]";
	}

	
	
	

	

}
