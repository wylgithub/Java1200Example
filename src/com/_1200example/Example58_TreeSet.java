package com._1200example;

import java.util.Random;
import java.util.TreeSet;

public class Example58_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet实现随机生成不重复自动排序数组
		TreeSet<Integer> set = new TreeSet<Integer>();
		//随机生成数
		Random ran = new Random();
		//计数器
		Integer count=0;
		while(count < 10){
			boolean success = set.add(ran.nextInt(100));
			if(success){
				count++;
			}
		}
		int size = set.size();
		//生成一个数组存放set元素
		Integer [] array = new Integer[size];
		//打印出生成的set元素:
		System.out.println("打印出生成的set元素: ");
		for(int s:set){
			System.out.print(s+"\t");
		}
		
		//将set转换为数组
		set.toArray(array);
		//打印数组的元素
		System.out.println("\n数组的元素为: ");
		for(int num: array){
			System.out.print(num+"\t");
		}
		
	}

}
