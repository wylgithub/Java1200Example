package com._1200example;

import java.util.Random;

public class TogetherWay {
	//��ӡһά����Ĺ�ͨ����
	public static int[] printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ "\t");
		}
		return arr;
	}
	
	//��ӡ��ά����Ĺ�ͨ����
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
	
	//ʵ��ѡ������Ĵ�������:�����һά����
	public static void selectSort(int arr[]){
		int index;
		for(int i=1;i<arr.length;i++){
			index = 0;//����������±�ֵ��index
			for(int j=1;j<=arr.length-i;j++){
				if(arr[j] > arr[index]){
					index = j;
				}
			}
			//����λ����arr.length��index(���ֵ)�ϵ�������
			int temp = arr[arr.length-i];
			arr[arr.length-i] = arr[index];
			arr[index] = temp;
		}
//		for(int j=0;j<arr.length;j++){
//			System.out.println();
//		}
		//��ʱ����������Ѿ����
	}
	
	//����α�����
	//����ָ��������ĸ���
	public static void getRandomdata(int [] arr, int dataRanda){
		//��������α������Ļ�������
		Random random = new Random();//�����������������
		//ѭ�����������
		for(int i=0;i<arr.length;i++){
			//����50���ڵ������
			arr[i] = random.nextInt(dataRanda);
		}
	}
	
	//����ð������
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
	
	//���һ���������ÿ�д���10�����֣������10����
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
	
	//��ӡһ����������ֵ,��Сֵ,��ƽ��ֵ
	public static void arrayInfo(int arr[]){
		//��������ֵ:
		float max=0.f;
		//�������Сֵ
		float min = 0.f;
		//�����ƽ��ֵ
		float avg = 0.f;
		//������ܺ�
		float sum = 0.f;
		//ѭ�����������Ԫ�ؼ���ƽ��ֵ�����ֵ,��Сֵ
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		//ƽ��ֵ
		avg = sum/arr.length;
		//���������ð������
		bubbleSort(arr);
		//ȡ����һ��Ϊ��Сֵ
		min = arr[0];
		//ȡ�����һ��Ϊ���ֵ
		max = arr[arr.length-1];
		//��������Ϣ
		System.out.println("����������ֵΪ:\t\t"+max+"\n��СֵΪ:\t\t"+min+"\nƽ��ֵΪ:\t\t"+avg+"\n��Ϊ:\t\t"+sum);
		
		
	}
		
		
}
