package com.kh.practice1;

import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		int menu;
		menu = sc.nextInt();
		
		if (menu==1) {
			System.out.println("입력메뉴입니다.");
		} else if (menu==2) {
			System.out.println("수정메뉴입니다.");
		} else if (menu==3) {
			System.out.println("조회메뉴입니다.");
		} else if (menu==4) {
			System.out.println("삭제메뉴입니다.");
		} else {
			System.out.println("프로그램이 종료됩니다.");
		}
		
	}

}
