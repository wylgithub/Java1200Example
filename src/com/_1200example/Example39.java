package com._1200example;

public class Example39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java中循环的终止
		String arr[] = new String[]{
				"老鹰","乌鸦","斑点狗","唐老鸭","乌龟","麻雀","猪"
		};
		//打印数组arr中的值
		for(String s : arr){
			if(s.equals("乌龟")){
				break;
			}
			System.out.println("有"+s+"          ");
		}
		System.out.println("\n\n-----------中断双层循环的例子--------------");
		//创建一个二维数组
		int [][] myArr= new int[][]{
			{98,89,68,87},{98,89,68,87},{98,89,68,87},{98,89,68,87},{12,45,65,87}
		};
		No1:for(int[] is: myArr){
			for(int i:is){
				if(i<60){
					break No1;
				}
			}
			System.out.println();
		}
	}

}
