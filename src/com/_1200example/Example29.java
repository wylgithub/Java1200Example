package com._1200example;

import java.util.Scanner;

public class Example29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取java的hashCode值
		String java = "Java";
		int java_hashcode = java.hashCode();
		//System.out.println(java_hashcode);
		//获取C#的hashCode值
		String csharp = "C#";
		
		int csharp_hashCode = csharp.hashCode();
		//System.out.println(csharp_hashCode);
		//获取C语言的hashCode值
		String cLanguage = "C";
		int clanguage = cLanguage.hashCode();
		//System.out.println(clanguage);
		//获取PHP的hashCode
		String php = "PHP";
		int phphashCode = php.hashCode();
		//System.out.println(phphashCode);
		//获取扫描器对象，要求用户输入姓名和语言
		Scanner console = new Scanner(System.in);
		System.out.println("Input your name: ");
		String userName = console.nextLine();
		System.out.println("Input your language: ");
		String language = console.nextLine();
		System.out.println("The infomation of your's is: "+userName+"  language: "+language);
		switch(language.hashCode()){
		case 2301506:
			System.out.println("欢迎你加入Java部门！");
			break;
		case 2112:
			System.out.println("欢迎加入C#部门！");
			break;
		case 67:
			System.out.println("欢迎加入C语言部门！");
			break;
		case 79192:
			System.out.println("欢迎加入PHP部门！");
			break;
		default: System.out.println("暂时没有该部门，你可以做该部门的老大了！");
		}
	
	}

}
