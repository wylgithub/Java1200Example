package com._1200example;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//构造java的扫描器对象
		Scanner console = new Scanner(System.in);
		System.out.println("请输入你的身份证号:");
		String Id = console.nextLine();
		//打印身份证的位数
		System.out.println("你的身份证是:"+Id.length()+"位的！");
	
	}

}
