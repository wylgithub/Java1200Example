package com._1200example;

import java.util.ArrayList;
import java.util.List;

public class Example57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ�����ϴ���ѧ������Ϣ
		List <String> list = getStudentInfo();
		//��ӡѧ������Ϣ
		printInfo(list);
	}
	//��дʵ����ѧ����Ϣ�ķ���
	public static List<String> getStudentInfo(){
		//���ѧ����ʵ����Ϣ
		List <String> studentInfo = new ArrayList();
		studentInfo.add("Jack, �У�25");
		studentInfo.add("Aliase, Ů, 22");
		studentInfo.add("Tom, ��, 22");
		studentInfo.add("Ted, ��, 25");
		studentInfo.add("Jacj, �У�89");
		return studentInfo;
	}
	
	//��ӡѧ���Ļ���Ϣ
	public static void printInfo(List<String> list){
		int i=1;
		for(String li: list){
			System.out.println("�� "+i+"��ѧ������ϢΪ: "+li);
			i++;
		}
	}

}
