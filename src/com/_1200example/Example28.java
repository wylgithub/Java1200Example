package com._1200example;

import java.util.Scanner;

public class Example28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 判断闰年的条件:必须满足以下两个条件(
		 * 1.能够被4整除且不可以被100整除；
		 * 2.能够被400整除
		 * 	代码实现如下:
		 * )
		 */
		Scanner console = new Scanner(System.in);
		long year;
		while(true){
			System.out.println("请输入年份:");
			year = console.nextLong();
			System.out.println("你输入的年份是: "+year);
			if(year%4==0&&year%100!=0||year%400 == 0){
				System.out.println("年份"+year+"是闰年！");
				break;
			}else{
				System.out.println("年份"+year+"不是闰年！");
				break;
			}
		}
	}	

}
