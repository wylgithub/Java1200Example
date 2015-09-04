package com._1200example;

public class Example34_Yanghuisanjiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印杨辉三角
		//声明一个二维数组:
		int triangle [][] = new int[8][];
		//遍历二维数组的第一层
		for(int i = 0;i <= triangle.length-1;i++){
			triangle[i] = new int[i];
			//遍历第二层数组
			for(int j = 0;j<triangle[i].length-1;j++){
				//将两侧的值全部置为1
				if(j==0||i==0||j==triangle[i].length-1){
					triangle[i][j] = 1;
				}else{
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
				}
				//输出数组元素
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
