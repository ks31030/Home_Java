package com.kh.whilesample;

import java.util.Scanner;

public class While01 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//스캐너 입력
		
		boolean isTrue = true;//진위형 변수 isTrue를 true값으로 선언
		
		while(isTrue) {//isTrue = true이기 때문에 true 대신 사용.
			System.out.println("커피를 주문해주세요. 1. 아메리카노 2. 카푸치노 3. 말차밀크티");
			int choice = sc.nextInt();//while 안으로 이동	
			
			switch(choice) {//choice가 어떤 숫자냐에 따라 다르게 출력이 되어야 하므로 switch문 사용.
			case 1:
				System.out.println("아메리카노 주문!");
				isTrue = false; //아메리카노 주문을 받았으니 while문을 종료하기 위해서 false를 넣는다.
				break;
			case 2:
				System.out.println("카푸치노 주문!");
				isTrue = false;
				break;
			case 3:
				System.out.println("말차밀크티 주문!");
				isTrue = false;
				break;
			default :
				System.out.println("잘못된 선택. 다시 주문 요망.");
				System.out.println("");
				//default 뒤에 break를 넣지 않는 것은 이후 case 설정된 소스코드가 없기 때문.
				//default 뒤에 isTrue = false를 넣지 않는 것은 이후 메뉴 외의 숫자를 입력할 경우 반복하여 주문을 받아야 하기 때문.
			}
		}
	}

}
