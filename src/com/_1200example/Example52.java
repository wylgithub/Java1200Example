package com._1200example;

public class Example52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		int arr[] = new int[10];
		//�������һ������
		TogetherWay tw = new TogetherWay();
		tw.getRandomdata(arr, 500);
		//��ӡ������ɵ�����
		tw.checkOutput(arr);
		
		//�����ɵ�������п�������
		System.out.println("\n��������֮���Ԫ��Ϊ: ");
		tw.quickSort(arr, 0, arr.length-1);
	}

}
