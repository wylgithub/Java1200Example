package com._1200example;

import java.util.Scanner;

public class Example026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ʹ�������ƶ�ʵ��Ԫ�ص���˺����
		 */
		/**
		 * ���Ƚ��ռ���������һ�����֣�Ȼ��ֱ�����Ը����������ƶ�һλ����λ����λ��������λ��������ֵ
		 */
		System.out.println("��������Ҫ�˷��������: ");
		Scanner console = new Scanner(System.in); 
		int num;
		//����Ƿ��������쳣
		try{
			num = console.nextInt();
			System.out.println("�������������: "+num);
			System.out.println("���������"+num+"����2�Ľ����: "+(num<<1));
			System.out.println("���������"+num+"����4�Ľ����: "+(num<<2));
			System.out.println("���������"+num+"����8�Ľ����: "+(num<<3));
			System.out.println("���������"+num+"����16�Ľ����: "+(num<<4));
		}catch(Exception ex){
			System.out.println("����Ƿ������������룡"+ex.getMessage());
		}
		System.out.println("��������Ҫ�����������: ");
		try{
			long number = console.nextLong();
			System.out.println("�������������: "+number);
			System.out.println("�����������"+number+"����2֮��õ�: "+(number>>1));
			System.out.println("�����������"+number+"����4֮��õ�: "+(number>>2));
			System.out.println("�����������"+number+"����8֮��õ�: "+(number>>3));
			System.out.println("�����������"+number+"����16֮��õ�: "+(number>>4));
			System.out.println("�����������"+number+"����32֮��õ�: "+(number>>5));
		}catch(Exception ex){
			System.out.println("����Ƿ������������룡"+ex.getMessage());
		}
		/**
		 * �ܽ�:��һ�������ƶ�n�ξ��൱�ڽ���������2��n�η������ƶ�n�ξ��൱�ڳ���2��n�η���
		 */
	}

}
