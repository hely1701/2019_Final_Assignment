package com.maven.calc2019.calculator2019.classes;

import com.maven.calc2019.calculator2019.interfaces.*;

public class SimpleCalculator implements BasicMathOperations {
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			return -0.123456789;
		} else {
			return result;
		}

	}

}
