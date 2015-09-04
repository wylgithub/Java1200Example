package com._1200example;

import java.util.Random;

public class Example50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个一维数组:数组长度为10
		TogetherWay tw = new TogetherWay();
		int []array = new int[10];
		tw.getRandomdata(array,50);
		//获取打印数组的实例
		System.out.println("随机生成的数组如下: ");
		tw.printArray(array);
		
		//对随机生成的数组进行选择排序结果如下:
		System.out.println("\n对随机生成的数组进行选择排序结果如下:");
		tw.selectSort(array);
		tw.printArray(array);
	}
}
