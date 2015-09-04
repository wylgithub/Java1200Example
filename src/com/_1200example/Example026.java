package com._1200example;

import java.util.Scanner;

public class Example026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 使用左右移动实现元素的相乘和相除
		 */
		/**
		 * 首先接收键盘上输入一个数字，然后分别算出对该数字左右移动一位，两位和三位甚至更多位数的最终值
		 */
		System.out.println("请输入你要乘法运算的数: ");
		Scanner console = new Scanner(System.in); 
		int num;
		//检测是否有输入异常
		try{
			num = console.nextInt();
			System.out.println("您输入额数字是: "+num);
			System.out.println("您输入额数"+num+"乘以2的结果是: "+(num<<1));
			System.out.println("您输入额数"+num+"乘以4的结果是: "+(num<<2));
			System.out.println("您输入额数"+num+"乘以8的结果是: "+(num<<3));
			System.out.println("您输入额数"+num+"乘以16的结果是: "+(num<<4));
		}catch(Exception ex){
			System.out.println("输入非法，请重新输入！"+ex.getMessage());
		}
		System.out.println("请输入你要除法运算的数: ");
		try{
			long number = console.nextLong();
			System.out.println("你输入的数字是: "+number);
			System.out.println("你输入的数字"+number+"除以2之后得到: "+(number>>1));
			System.out.println("你输入的数字"+number+"除以4之后得到: "+(number>>2));
			System.out.println("你输入的数字"+number+"除以8之后得到: "+(number>>3));
			System.out.println("你输入的数字"+number+"除以16之后得到: "+(number>>4));
			System.out.println("你输入的数字"+number+"除以32之后得到: "+(number>>5));
		}catch(Exception ex){
			System.out.println("输入非法，请重新输入！"+ex.getMessage());
		}
		/**
		 * 总结:将一个数左移动n次就相当于将概述乘以2的n次方，右移动n次就相当于除以2的n次方。
		 */
	}

}
