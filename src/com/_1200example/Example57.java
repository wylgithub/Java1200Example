package com._1200example;

import java.util.ArrayList;
import java.util.List;

public class Example57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过集合传递学生的信息
		List <String> list = getStudentInfo();
		//打印学生的信息
		printInfo(list);
	}
	//编写实例化学生信息的方法
	public static List<String> getStudentInfo(){
		//获得学生的实例信息
		List <String> studentInfo = new ArrayList();
		studentInfo.add("Jack, 男，25");
		studentInfo.add("Aliase, 女, 22");
		studentInfo.add("Tom, 男, 22");
		studentInfo.add("Ted, 男, 25");
		studentInfo.add("Jacj, 男，89");
		return studentInfo;
	}
	
	//打印学生的基信息
	public static void printInfo(List<String> list){
		int i=1;
		for(String li: list){
			System.out.println("第 "+i+"个学生的信息为: "+li);
			i++;
		}
	}

}
