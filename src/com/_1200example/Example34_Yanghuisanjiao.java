package com._1200example;

public class Example34_Yanghuisanjiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ӡ�������
		//����һ����ά����:
		int triangle [][] = new int[8][];
		//������ά����ĵ�һ��
		for(int i = 0;i <= triangle.length-1;i++){
			triangle[i] = new int[i];
			//�����ڶ�������
			for(int j = 0;j<triangle[i].length-1;j++){
				//�������ֵȫ����Ϊ1
				if(j==0||i==0||j==triangle[i].length-1){
					triangle[i][j] = 1;
				}else{
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
				}
				//�������Ԫ��
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
