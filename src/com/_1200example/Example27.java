package com._1200example;

import java.util.Scanner;

public class Example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ʵ������������λ�ý���������Ҫ����������
		 */
		//ʵ��Scanner���ʵ��
		Scanner console = new Scanner(System.in);
		int  a;
		int b;
		System.out.println("���������A: ");
		a = console.nextInt();
		//�������B
		System.out.println("���������B: ");
		b = console.nextInt();
		//չʾ����ı���A�ͱ���B
		System.out.println("����ı���AΪ: "+a+"\n"+"����ı���BΪ: "+b);
		
		//ʵ�ֱ���a�ͱ���b����λ�ý���
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("����֮��Ľ��Ϊ: ");
		System.out.println("a = "+a+"\n"+"b = "+b);
		
	}

}
