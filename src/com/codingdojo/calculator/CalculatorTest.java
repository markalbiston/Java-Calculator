package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ti86 = new Calculator();
		ti86.setOperandOne(10.5);
		ti86.setOperation("+");
		ti86.setOperandTwo(5.2);
		ti86.performOperation();
		ti86.getResults();
	}

}
