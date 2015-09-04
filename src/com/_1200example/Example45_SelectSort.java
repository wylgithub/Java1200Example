package com._1200example;

public class Example45_SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[]{10	,19	,18	,17	,16	,15	,14	,13	,12,	1};
		selectSort(arr);
		for(int i: arr){
	    	System.out.println(i+"  ");
	    }
	}
	public static void selectSort(int[]a)
	{
	    int minIndex=0;
	    int temp=0;
	    if((a==null)||(a.length==0))
	        return;
	    for(int i=0;i<a.length-1;i++)
	    {
	        minIndex=i;//����������С���������±�
	        for(int j=i+1;j<a.length;j++)
	        {
	            //�����������ҵ���С���ݲ������������±�
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //�����������������Сֵλ�ò���Ĭ�ϵĵ�һ�����ݣ��򽻻�֮��
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	    
	}
	

}
