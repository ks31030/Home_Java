package com.kh.example.practice4.model.vo;
/*
 - grade : int
- classroom : int
- name : String
- height : double
- gender : char
+ Student()
+ information() : void
 
 */
public class Student {
	
	//1. ��� ����
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2. ������
	public Student(int grade, int classroom, String name, double height, char gender) {
		//�ʱ�ȭ ����� �̿��� �� �ʵ� �ʱ�ȭ �ʱ�ȭ���{}
		{
		 grade = 1;
		 classroom = 2;
		 name = "�ڼ�ö";
		 height = 180.5;
		 gender = '��';
		}
	}
	//3. ��� �޼��� + information() : void
	public void information() {
		 System.out.println("�г� : " + grade);
		 System.out.println("�� : " + classroom);
		 System.out.println("�̸� : " + name);
		 System.out.println("Ű : " + height);
		 System.out.println("���� : " + gender);
	}

}
