package com._1200example;

import java.util.Scanner;

public class Example29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡjava��hashCodeֵ
		String java = "Java";
		int java_hashcode = java.hashCode();
		//System.out.println(java_hashcode);
		//��ȡC#��hashCodeֵ
		String csharp = "C#";
		
		int csharp_hashCode = csharp.hashCode();
		//System.out.println(csharp_hashCode);
		//��ȡC���Ե�hashCodeֵ
		String cLanguage = "C";
		int clanguage = cLanguage.hashCode();
		//System.out.println(clanguage);
		//��ȡPHP��hashCode
		String php = "PHP";
		int phphashCode = php.hashCode();
		//System.out.println(phphashCode);
		//��ȡɨ��������Ҫ���û���������������
		Scanner console = new Scanner(System.in);
		System.out.println("Input your name: ");
		String userName = console.nextLine();
		System.out.println("Input your language: ");
		String language = console.nextLine();
		System.out.println("The infomation of your's is: "+userName+"  language: "+language);
		switch(language.hashCode()){
		case 2301506:
			System.out.println("��ӭ�����Java���ţ�");
			break;
		case 2112:
			System.out.println("��ӭ����C#���ţ�");
			break;
		case 67:
			System.out.println("��ӭ����C���Բ��ţ�");
			break;
		case 79192:
			System.out.println("��ӭ����PHP���ţ�");
			break;
		default: System.out.println("��ʱû�иò��ţ���������ò��ŵ��ϴ��ˣ�");
		}
	
	}

}
