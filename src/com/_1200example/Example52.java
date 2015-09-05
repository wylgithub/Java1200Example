package com._1200example;

public class Example52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组
		int arr[] = new int[10];
		//随机生成一个数组
		TogetherWay tw = new TogetherWay();
		tw.getRandomdata(arr, 500);
		//打印随机生成的数组
		tw.checkOutput(arr);
		
		//对生成的数组进行快速排序
		System.out.println("\n快速排序之后的元素为: ");
		tw.quickSort(arr, 0, arr.length-1);
	}

}
