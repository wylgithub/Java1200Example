package com._1200example;

public class Example39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java��ѭ������ֹ
		String arr[] = new String[]{
				"��ӥ","��ѻ","�ߵ㹷","����Ѽ","�ڹ�","��ȸ","��"
		};
		//��ӡ����arr�е�ֵ
		for(String s : arr){
			if(s.equals("�ڹ�")){
				break;
			}
			System.out.println("��"+s+"          ");
		}
		System.out.println("\n\n-----------�ж�˫��ѭ��������--------------");
		//����һ����ά����
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
