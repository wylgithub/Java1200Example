package com._1200example;

import java.util.Scanner;

public class Example42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//ѭ����ӡ��С��ֵ
		int min = arr[0];
		for(int k=0;k<arr.length;k++){
			if(arr[k] < min){
				int temp = arr[k];
				arr[k] = min;
				min = temp;
			}
		}
		System.out.println("\n�����е���С��ֵΪ: "+min);
		
	}

}
