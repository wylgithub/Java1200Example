package com._1200example;

import java.util.Random;
import java.util.TreeSet;

public class Example58_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSetʵ��������ɲ��ظ��Զ���������
		TreeSet<Integer> set = new TreeSet<Integer>();
		//���������
		Random ran = new Random();
		//������
		Integer count=0;
		while(count < 10){
			boolean success = set.add(ran.nextInt(100));
			if(success){
				count++;
			}
		}
		int size = set.size();
		//����һ��������setԪ��
		Integer [] array = new Integer[size];
		//��ӡ�����ɵ�setԪ��:
		System.out.println("��ӡ�����ɵ�setԪ��: ");
		for(int s:set){
			System.out.print(s+"\t");
		}
		
		//��setת��Ϊ����
		set.toArray(array);
		//��ӡ�����Ԫ��
		System.out.println("\n�����Ԫ��Ϊ: ");
		for(int num: array){
			System.out.print(num+"\t");
		}
		
	}

}
