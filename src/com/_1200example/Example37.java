package com._1200example;

public class Example37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintImage(10);
	}
	public static void PrintImage(int size){
		//��ӡ����
		//�������εĴ�С
		if(size % 2 == 0){
			size++;
		}
		for(int i=0;i<size/2+1;i++){
			for(int j=size/2+1;j>i+1;j--){
				System.out.print(" ");//������ϽǵĿհ�
			}
			//��������ϰ벿��Ե
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
