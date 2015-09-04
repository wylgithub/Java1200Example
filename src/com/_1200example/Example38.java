package com._1200example;

import java.util.ArrayList;
import java.util.List;

public class Example38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试java的佛如循环和foreach循环
		String [] str = new String[5];
		str[0] = "a";
		str[1] = "b";
		str[2] = "c";
		str[3] = "d";
		str[4] = "e";
		//使用for循环输出str数组的元素
		System.out.println("使用for循环输出str数组的元素: ");
		for(int i = 0; i<str.length;i++){
			System.out.print("str["+i+"]"+"="+str[i]+"\n");
		}
		List<String> list = new ArrayList<String>();
		//使用foreach循环输出数组
		list.add("abc");
		list.add("bcd");
		list.add("def");
		list.add("efg");
		System.out.println("使用foreach循环输出数组");
		int j=1;
		for(String s:list){
			System.out.println("list["+j+"] = "+s);
			j++;
		}
//		System.out.println("j = "+j);
		for(String s1:str){
			System.out.println("arr["+j+"] = "+s1);
		}
		
	}	

}
