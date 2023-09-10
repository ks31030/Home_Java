package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		// while문을 활용한 switch
		Scanner sc = new Scanner(System.in);//스캐너 입력
		
		int choice;//정수형 변수 선언
		boolean isChoice = true;//진위형 변수 false 선언
		
		while (isChoice) { //조건이 참인 동안 코드 블록을 반복적으로 실행. 잘못되면 기계가 끝나지 '않아야' 하니까
			System.out.println("커피 주문해주세요. 1. 아메리카노 2. 카페라떼 3. 홍차");//스캐너 입력
			
			choice = sc.nextInt();//고객이 choice를 입력하게끔 함.
			
			switch (choice) {//고르는 숫자에 따라(각기 다른 case에) 다른 결과(출력값)가 나와야 하기 때문에
			case 1://1을 입력하면 어떠한 메뉴가 나오게끔 조건을 제시
			System.out.println("아메리카노 주문");
			isChoice = false;//주문이 끝나면 while문 반복이 끝나도록 설정
			break;//아메리카노가 출력되면 더이상의 case들에 대하여 출력을 하지 않게끔 설정
			case 2:
				System.out.println("카페라떼 주문");
				isChoice = false;
				break;
			case 3:
				System.out.println("홍차 주문");
				isChoice = false;
				break;
			default :
				System.out.println("잘못된 선택. 재주문 요망.");
			}
		}

	}

}
