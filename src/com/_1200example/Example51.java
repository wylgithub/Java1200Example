package com._1200example;

public class Example51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		TogetherWay tw = new TogetherWay();
		//����һ������
		int  arr[] = new int[100];
		//�����������
		tw.getRandomdata(arr,1000);
		//������ɵ����������
//		tw.printArray(arr);
		//��ӡ���ɵ������
		System.out.println("���ɵ������Ϊ: ");
		
		tw.checkOutput(arr);
		//�����ɵ�������������ð������֮��Ľ��Ϊ
		System.out.println("�����ɵ�������������ð������֮��Ľ��Ϊ: ");
		tw.bubbleSort(arr);
		tw.checkOutput(arr);
		
		//��ӡ�������Ϣ
		tw.arrayInfo(arr);
		
		
	}

}
