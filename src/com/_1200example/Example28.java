package com._1200example;

import java.util.Scanner;

public class Example28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �ж����������:��������������������(
		 * 1.�ܹ���4�����Ҳ����Ա�100������
		 * 2.�ܹ���400����
		 * 	����ʵ������:
		 * )
		 */
		Scanner console = new Scanner(System.in);
		long year;
		while(true){
			System.out.println("���������:");
			year = console.nextLong();
			System.out.println("������������: "+year);
			if(year%4==0&&year%100!=0||year%400 == 0){
				System.out.println("���"+year+"�����꣡");
				break;
			}else{
				System.out.println("���"+year+"�������꣡");
				break;
			}
		}
	}	

}
