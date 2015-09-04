package com._1200example;

public class Example51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义
		TogetherWay tw = new TogetherWay();
		//定义一个数组
		int  arr[] = new int[100];
		//生成随机数组
		tw.getRandomdata(arr,1000);
		//输出生成的随机数个数
//		tw.printArray(arr);
		//打印生成的随机数
		System.out.println("生成的随机数为: ");
		
		tw.checkOutput(arr);
		//对生成的随机数数组进行冒泡排序之后的结果为
		System.out.println("对生成的随机数数组进行冒泡排序之后的结果为: ");
		tw.bubbleSort(arr);
		tw.checkOutput(arr);
		
		//打印数组的信息
		tw.arrayInfo(arr);
		
		
	}

}
