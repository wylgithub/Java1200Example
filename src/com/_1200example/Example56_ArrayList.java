package com._1200example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example56_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ������ѧ��������
		//ʵ����һ��List����
		List<String> list = new ArrayList<String>();
		//���ɨ��������
		Scanner console = new Scanner(System.in);
		
		//����Ҫ��ӵ�ѧ��������
		int totalStudent;
		System.out.println("������Ҫ���ѧ����Ŀ: ");
		totalStudent = console.nextInt();
		System.out.println("��Ҫ��ӵ�ѧ����ĿΪ: "+totalStudent);
		//ѭ������ѧ��
		System.out.println("\n\n��ֱ�����ѧ��������: ");
		int count = 1;
//		while(count <= totalStudent){
//			System.out.println("������� "+count+" ѧ��������: ");
//			String student = console.nextLine();
//			list.add(student);
//			totalStudent--;
//			count++;
//		}
		for(int i=0;i<totalStudent;i++){
			System.out.println("������� "+(i+1)+" ѧ��������: ");
			list.add(console.next());
		}
		//��ӡ���������е�ѧ����Ϣ
		for(String s:list){
			System.out.println("��"+count+"��ѧ��Ϊ: "+s);
			count++;
		}
		//2. ���ɾ��ѧ��������
		//ѭ��ɾ��ѧ��
		while(true){
			System.out.println("��������Ҫɾ����ѧ��������: ");
			String name = console.next();
			for(int i=0;i<list.size();i++){
				boolean flag = false;
				if(((String)list.get(i)).equals(name)){
					list.remove(name);
					flag = true;
				}
				if(flag){
					int countt=1;
					System.out.println("ɾ��ѧ��"+name+"֮��ʣ��ѧ���У�");
					for(String s:list){
						System.out.println("��"+countt+"��ѧ��Ϊ: "+s);
						countt++;
					}
				}else{
					System.out.println("�Բ��𣬸�ѧ��������!��ȷ��֮�������룡");
				}
			}
			
		}
	}

}
