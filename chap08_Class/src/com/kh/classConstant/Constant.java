package com.kh.classConstant;

public class Constant {

	public static void main(String[] args) {
		// 상수 사용.
		final int a = 1; //더이상 a의 값을 바꾸지 못하게 잠궈둠.
		final int b = 1;
		System.out.println("a의 값 : " + a);		
		System.out.println("b의 값 : " + b);
		
		//a = 2; 바꿔지지 않음. 왜? a가 1이라는 상수를 위에서 지정했기 때문.
		System.out.println("a의 값 : " + a);

	}

}
