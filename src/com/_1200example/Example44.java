package com._1200example;

import java.util.Scanner;

public class Example44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ķ�ת���
		//����һ����������
				int [] arr = new int[10];
				//�Ӽ��������뵥�������ֵ
				Scanner console = new Scanner(System.in);
				for(int i=0;i<arr.length;i++){
					System.out.println("�������"+(i+1)+"����: " );
					arr[i] = console.nextInt();
				}
				//ѭ����ӡ�����������
				for(int j: arr){
					System.out.print(j+"\t");
				}
				//�����鷴�����
				System.out.println("\n�����鷴������Ľ��: ");
				for(int k = arr.length-1;k>0;k--){
					System.out.print(arr[k]+"\t1");
				}
	}

}
