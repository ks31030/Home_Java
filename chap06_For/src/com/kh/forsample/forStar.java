package com.kh.forsample;

import java.util.Scanner;
  
public class forStar {
/*
������ ���� ���� ������ �����ϼ���.

ex.
���� �Է� : 5
*****
*   *
*   *
*   *
*****

 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		int num = sc.nextInt();
		
		//�簢��
		//*****
		//*   *
		//*   *
		//*   *
		//*****
		for(int i = 1; i <= 5; i++) { //�� ���� : i�� 1���� 1�� �����ϸ鼭 �ݺ��ϴµ� 5���� ������ �ȴ�.
			for(int j = 1; j <=5; j++) { //�� ���� : j�� 1���� 1�� �����ϸ鼭 �ݺ��ϴµ� 5���� ������ �ȴ�.
			    // ���� 1�� ��� (���� ����)
				// ���� �࿡�� ����ϴ� ���� ù ��° ���� ��� (j == 1)
				// ���� �࿡�� ���� �������� ���� ��� (j == num)
				// ���� �������� ���(���� �Ʒ���)
				if(i == 1 || j == 1 || j == num || i == num ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();//�ٹٲ�
		}
	}

}