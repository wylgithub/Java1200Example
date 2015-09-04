package com._1200example;

import java.util.Scanner;

public class Example44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的反转输出
		//定义一个单行数组
				int [] arr = new int[10];
				//从键盘上输入单行数组的值
				Scanner console = new Scanner(System.in);
				for(int i=0;i<arr.length;i++){
					System.out.println("请输入第"+(i+1)+"个数: " );
					arr[i] = console.nextInt();
				}
				//循环打印出输入的数组
				for(int j: arr){
					System.out.print(j+"\t");
				}
				//将数组反序输出
				System.out.println("\n将数组反序输出的结果: ");
				for(int k = arr.length-1;k>0;k--){
					System.out.print(arr[k]+"\t1");
				}
	}

}
