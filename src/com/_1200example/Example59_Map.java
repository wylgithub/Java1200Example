package com._1200example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Example59_Map {
	//ʵ����map����
	public static Map<String, String[]> model = new LinkedHashMap();
	//����Map����
	static{
		model.put("����", new String[]{"����"});
		model.put("�Ϻ�", new String[]{"�Ϻ�"});
		model.put("���", new String[]{"���"});
		model.put("����", new String[]{"����"});
		model.put("����", new String[]{"����","��ͨ","����","����","�������","������"});
		model.put("�Ĵ�", new String[]{"����","�ɶ�","�ƹ���"});
		model.put("����", new String[]{"����","�Ͻ�","����"});
	}
	//��д��ȡʡ�ݷ���
	public static  Object[] getProvince(){
		Map<String,String[]> map = Example59_Map.model;
		//����ֵ�����Set������
		Set<String> set = map.keySet();
		//����ֵת��Ϊ����
		Object [] province = set.toArray();
		//����ʡ��
		return province;
	}
	//���ݷ��ص�ʡ����Ϣ:�������ڸ�ʡ�����г���
	public static String[] getCity(String selectProvince){
		Map <String, String[]> map = Example59_Map.model;
		//��ȡָ������ֵ
		String [] citys = map.get(selectProvince);
		return citys;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ó�������
		Example59_Map map = new Example59_Map();
		Object[] pro = map.getProvince();
		System.out.println("��ӡʡ�ݵĸ���: "+pro.length);
		//��ӡ���еĸ���:
		
//		System.out.println("����Ϻ��ж�Ӧ�ĳ��и���: "+citys.length);
		System.out.println("��������Ҫ�˽��ʡ�ݶ�Ӧ�ĳ���: ");
		Scanner console = new Scanner(System.in);
		String prov = console.nextLine();
		String citys[] = map.getCity(prov);
		//ѭ����ӡ����
		for(String s: citys){
			System.out.println("ʡ�� "+prov+" ��Ӧ�ĳ�����: "+ s);
		}
	}

}
