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
	        minIndex=i;//无序区的最小数据数组下标
	        for(int j=i+1;j<a.length;j++)
	        {
	            //在无序区中找到最小数据并保存其数组下标
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	    
	}
	

}
