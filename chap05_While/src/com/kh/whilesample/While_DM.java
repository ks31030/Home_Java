package com.kh.whilesample;

import java.util.Scanner;

public class While_DM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean goodplace = true;
		
		while(goodplace) {
			System.out.println("��� ���ųİ�");
			int place = sc.nextInt();
			
			switch(place) {
				case 1 :
					System.out.println("�ŵ����� ���� ��⸦ ����");
					goodplace = false;
					break;
				case 2 :
					System.out.println("ȭ� ���� �ػ깰�� ����");
					goodplace = false;
					break;
				case 3 :
					System.out.println("���׿��� �ƹ��ų� ����");
					goodplace = false;
					break;
				default :
					System.out.println("�ڱⰡ �ѹ� ã�ƺ���?");
					System.out.println("");
			}
		}
	}

}
