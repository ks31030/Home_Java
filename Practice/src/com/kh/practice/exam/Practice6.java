package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {
	/*
	  1�� ����.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i=1; i<=num; i++) {
				System.out.println(i);
			}
		}
	}

}
