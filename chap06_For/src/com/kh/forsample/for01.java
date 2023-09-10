package com.kh.forsample;

public class for01 {
	
	public static void main(String[] args) {
		 
		/*
		 for문은 프로그래밍에서 반복 작업을 수행하기 위해 사용되는 제어구조.
		 특정한 조건이 만족하는 동안 코드 블록을 반복 실행하는 데에 사용.
		 대부분의 프로그래밍 언어에서 for문이 가진 구조.
		 for (초기화; 조건식; 증감식) {
		 	// 조건식이 참일 경우 반복적으로 실행할 코드
		 }
		 
		 초기화 : 반복문이 시작될 때 한번만 실행되는 부분으로, 반복 변수를 초기화 하는 역할을 한다.
		 조건식 : 반복문이 실행될 조건을 검사하는 부분으로 조건이 참일 경우에만 반복코드 블록 실행 후 실행.
		 증감식 : 반복 변수를 증가시키거나 감소시키는 부분으로, 반복 코드 블록 실행 후 실행.
		 */
		/* 
		for (int i=1; i<=5; i++) {
			//조건 i<=5 참일 경우에 실행되는 공간
			System.out.println(i);
		}
		
		for (int i=0; i<=5; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		for (int i=2; i<=7; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		for (int i=10; i>=5; i--) {
			System.out.println("i - 값 : " + i);
		}
		*/
		int	sum = 0;
		for(int i=1; i<=10; i++) {//for문 안에서 반복될 정수 i를 선언하여 i가 10보다 작거나 같을 경우까지 지속적으로 1씩 증가.
			//합을 구하자.
			sum += i; //+=은 할당된 값들을 누적하여 더함. 10까지의 모든 값을 더해야 해서 사용함.
			System.out.println("1부터 10까지의 합 : " + sum);
		}
		
		// 1부터 5까지의 sum으로 출력하기
		int sum1 = 0;
		for(int i=1; i<=5; i++) {
			sum1 += i;
			System.out.println("1부터 5까지의 합 : " + sum1);
		}
		
		int sum2 = 100;
		for (int i=10; i>=2; i--) {
			sum2 -= i; //정수 i가 10부터 1씩 감소하면서 i가 2보다 크거나 같을 경우까지의 차를 출력.
			System.out.println("sum2 - : " + sum2);
		}
		int mul = 1;
		for(int i=1; i<=9; i++) {
			mul = 6*i;
			System.out.println("구구단 : " + mul);
		}
	}

}
