package com._1200example;

public class Example37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintImage(10);
	}
	public static void PrintImage(int size){
		//打印菱形
		//计算菱形的大小
		if(size % 2 == 0){
			size++;
		}
		for(int i=0;i<size/2+1;i++){
			for(int j=size/2+1;j>i+1;j--){
				System.out.print(" ");//输出左上角的空白
			}
			//输出菱形上半部边缘
			for(int j = 0;j<2*i+1;j++){
				if(j==0||j==2*i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 for(int i=size/2+1;i<size;i++){
			 for(int j=0;j<i-size/2;j++){
				 System.out.print(" ");
			 }
			 for(int j=0;j<2*size-1-2*i;j++){
				 if(j==0||j==2*(size-i-1)){
					 System.out.print(" ");
				 }else{
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
	}

}
