package com._1200example;

import java.util.Scanner;

public class Example42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//循环打印最小的值
		int min = arr[0];
		for(int k=0;k<arr.length;k++){
			if(arr[k] < min){
				int temp = arr[k];
				arr[k] = min;
				min = temp;
			}
		}
		System.out.println("\n数组中的最小的值为: "+min);
		
	}

}
