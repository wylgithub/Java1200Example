package com._1200example;

public class Example43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ά��������л���
		int [][] arr= new int[][]{
			{1,2,3},{4,5,6},{7,8,9}
		};
		printArray(arr);
		//����ά��������л���֮���ӡ
		int [][] arr2 = new int [arr.length][arr.length];
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("���л���֮��Ľ��: ");
		printArray(arr2);
		
		
	}
	//���ո�ʽ��ӡһ����ά����
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
