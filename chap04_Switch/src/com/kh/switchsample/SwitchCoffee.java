package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		// while���� Ȱ���� switch
		Scanner sc = new Scanner(System.in);//��ĳ�� �Է�
		
		int choice;//������ ���� ����
		boolean isChoice = true;//������ ���� false ����
		
		while (isChoice) { //������ ���� ���� �ڵ� ����� �ݺ������� ����. �߸��Ǹ� ��谡 ������ '�ʾƾ�' �ϴϱ�
			System.out.println("Ŀ�� �ֹ����ּ���. 1. �Ƹ޸�ī�� 2. ī��� 3. ȫ��");//��ĳ�� �Է�
			
			choice = sc.nextInt();//���� choice�� �Է��ϰԲ� ��.
			
			switch (choice) {//���� ���ڿ� ����(���� �ٸ� case��) �ٸ� ���(��°�)�� ���;� �ϱ� ������
			case 1://1�� �Է��ϸ� ��� �޴��� �����Բ� ������ ����
			System.out.println("�Ƹ޸�ī�� �ֹ�");
			isChoice = false;//�ֹ��� ������ while�� �ݺ��� �������� ����
			break;//�Ƹ޸�ī�밡 ��µǸ� ���̻��� case�鿡 ���Ͽ� ����� ���� �ʰԲ� ����
			case 2:
				System.out.println("ī��� �ֹ�");
				isChoice = false;
				break;
			case 3:
				System.out.println("ȫ�� �ֹ�");
				isChoice = false;
				break;
			default :
				System.out.println("�߸��� ����. ���ֹ� ���.");
			}
		}

	}

}
