package com._1200example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.omg.Messaging.SyncScopeHelper;

public class Demo021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PrintStream out = System.out;//����ԭ�����
			//�����ļ������
			PrintStream ps = new PrintStream("./log.txt");
			//����ʹ���µ������
			System.setOut(ps);
			int age=18;
			System.out.println("��������ɹ����壬ֵΪ:"+age);
			String sex = "Ů";
			System.out.println("�Ա�����ɹ����壬ֵΪ:"+sex);
			//������������
			String info = "���Ǹ�"+sex+"���ӣ���������"+age+"������ӣ�";
			System.out.println("��������������֮��Ϊinfo����,�����:"+info);
			System.setOut(out);
			System.out.println("����������ϣ���鿴��־�ļ�");
			
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
