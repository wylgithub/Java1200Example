package com._1200example;

public class Example43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将二维数组的行列互换
		int [][] arr= new int[][]{
			{1,2,3},{4,5,6},{7,8,9}
		};
		printArray(arr);
		//将二维数组的行列互换之后打印
		int [][] arr2 = new int [arr.length][arr.length];
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("行列互换之后的结果: ");
		printArray(arr2);
		
		
	}
	//按照格式打印一个二维数组
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

}
