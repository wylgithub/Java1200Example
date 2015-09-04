package com._1200example;

public class Example41_循环的极限 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = Integer.MAX_VALUE;
		System.out.println("Integer的最大值是:"+end);
		int start = end-50;
		int sum = 0;
		//循环累加
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		System.out.println("累加和等于: "+sum);
	}

}
