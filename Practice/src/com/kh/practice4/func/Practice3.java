package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		/*
		 ����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		 ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				for ( ; ; ) { //for�� �ȿ� �ϼ��ϱ�
					System.out.println("");
				}
			}
		}
	}

