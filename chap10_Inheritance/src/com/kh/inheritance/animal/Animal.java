package com.kh.inheritance.animal;

public class Animal {//���� Ŭ���� ����
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println("�̸� : " + name + " ���� : " + age);
	}
	public void eat() {
		System.out.println(name + "(��)�� ���̸� �Խ��ϴ�.");
	}
	public void sleep() {
		System.out.println(name + "(��)�� ���� ��ϴ�.");
	}
}
