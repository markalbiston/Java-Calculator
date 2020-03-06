package com.codingdojo.calculator;

public class Calculator implements BasicFunctions {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
		
	}
	
	public double getOperandOne() {
		return this.operandOne;
	}
	public double getOperandTwo() {
		return this.operandTwo;
	}
	public String getOperation() {
		return this.operation;
	}
	public void setOperandOne(double value) {
		this.operandOne = value;
	}
	public void setOperandTwo(double value) {
		this.operandTwo = value;
	}
	public void setOperation(String operator) {
		this.operation = operator;
	}
	public void performOperation() {
		if(this.operation == "+") {
			result = this.operandOne + this.operandTwo;
		}
		else if(this.operation == "-") {
			result = this.operandOne - this.operandTwo;
		}
		else {
			System.out.println("please provide a valid operator");
		}
	}
	public void getResults() {
		System.out.println(this.result);
	}
}
