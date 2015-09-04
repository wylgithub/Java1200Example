package com._1200example;

import java.util.Scanner;

public class Example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 实现两个变量的位置交换，不需要第三个变量
		 */
		//实现Scanner类的实例
		Scanner console = new Scanner(System.in);
		int  a;
		int b;
		System.out.println("请输入变量A: ");
		a = console.nextInt();
		//输入变量B
		System.out.println("请输入变量B: ");
		b = console.nextInt();
		//展示输入的变量A和变量B
		System.out.println("输入的变量A为: "+a+"\n"+"输入的变量B为: "+b);
		
		//实现变量a和变量b进行位置交换
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("交换之后的结果为: ");
		System.out.println("a = "+a+"\n"+"b = "+b);
		
	}

}
