package com._1200example;

public class Example40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//javaÖÐµÄcontinue
		int k = 0;
		for(int i=0;i<100;i++){
			if(i%2 == 0){
				continue;
			}else{
				k++;
				System.out.print(i+"\t");
				if(k%10 == 0){
					System.out.println();
				}
			}
		}
	}

}
