package com.kh.inheritance.calculator;
   
public class Calculator {
	//계산기
	//더하기 빼기 곱하기 나누기 나머지
	//1. 더하기
	public int add(int num1, int num2) {//파라미터 = 매개변수 숫자 2개 넣기
		return num1 + num2;
	}
	//2. 빼기
	public int substruct(int num1, int num2) {
		return num1 - num2;
	} 
	//3. 곱하기
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	//4. 나누기
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int mod(int num1, int num2) {
		return num1 % num2;
	}
}