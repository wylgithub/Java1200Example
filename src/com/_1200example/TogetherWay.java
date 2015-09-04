package com._1200example;

import java.util.Random;

public class TogetherWay {
	//打印一维数组的共通方法
	public static int[] printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ "\t");
		}
		return arr;
	}
	
	//打印二维数组的共通方法
	public static void printArray(int [][] arr){
		int ln = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
				ln++;
				if(ln==arr[i].length){
					System.out.println();
					if(ln==arr[i].length){
						ln=0;
					}
				}else{
					continue;
				}
			}
		}
	}
	
	//实现选择排序的代码如下:针对于一维数组
	public static void selectSort(int arr[]){
		int index;
		for(int i=1;i<arr.length;i++){
			index = 0;//将数组的首下表赋值给index
			for(int j=1;j<=arr.length-i;j++){
				if(arr[j] > arr[index]){
					index = j;
				}
			}
			//交换位置在arr.length和index(最大值)上的两个数
			int temp = arr[arr.length-i];
			arr[arr.length-i] = arr[index];
			arr[index] = temp;
		}
//		for(int j=0;j<arr.length;j++){
//			System.out.println();
//		}
		//此时数组的排序已经完成
	}
	
	//生成伪随机数
	//生成指定随机数的个数
	public static void getRandomdata(int [] arr, int dataRanda){
		//定义生成伪随机数的基本操作
		Random random = new Random();//创建生成随机数对象
		//循环生成随机数
		for(int i=0;i<arr.length;i++){
			//生成50以内的随机数
			arr[i] = random.nextInt(dataRanda);
		}
	}
	
	//定义冒泡排序
	public static void bubbleSort(int [] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//输出一个数组如果每行大于10个数字，则输出10个数
	public static void checkOutput(int arr[]){
//		int index=0;
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+"\t");
//			index++;
//			if(index == 10){
//				System.out.println();
//				index = 0;
//			}
//		}
		int check = 0;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"     ");
			check++;
			if(check >= 10){
				System.out.println();
				check = 0;
			}
		}
	}
	
	//打印一个数组的最大值,最小值,和平均值
	public static void arrayInfo(int arr[]){
		//数组的最大值:
		float max=0.f;
		//数组的最小值
		float min = 0.f;
		//数组的平均值
		float avg = 0.f;
		//数组的总和
		float sum = 0.f;
		//循环遍历数组的元素计算平均值，最大值,最小值
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		//平均值
		avg = sum/arr.length;
		//对数组进行冒泡排序
		bubbleSort(arr);
		//取出第一个为最小值
		min = arr[0];
		//取出最后一个为最大值
		max = arr[arr.length-1];
		//输出求得信息
		System.out.println("该数组的最大值为:\t\t"+max+"\n最小值为:\t\t"+min+"\n平均值为:\t\t"+avg+"\n和为:\t\t"+sum);
		
		
	}
		
		
}
