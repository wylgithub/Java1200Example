package com._1200example;

import java.util.Random;

public class Example50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��һά����:���鳤��Ϊ10
		TogetherWay tw = new TogetherWay();
		int []array = new int[10];
		tw.getRandomdata(array,50);
		//��ȡ��ӡ�����ʵ��
		System.out.println("������ɵ���������: ");
		tw.printArray(array);
		
		//��������ɵ��������ѡ������������:
		System.out.println("\n��������ɵ��������ѡ������������:");
		tw.selectSort(array);
		tw.printArray(array);
	}
}
