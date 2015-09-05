package com._1200example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example56_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 完成添加学生的任务
		//实例化一个List容器
		List<String> list = new ArrayList<String>();
		//获得扫描器对象
		Scanner console = new Scanner(System.in);
		
		//输入要添加的学生的总数
		int totalStudent;
		System.out.println("请输入要添加学生数目: ");
		totalStudent = console.nextInt();
		System.out.println("你要添加的学生数目为: "+totalStudent);
		//循环输入学生
		System.out.println("\n\n请分别输入学生的姓名: ");
		int count = 1;
//		while(count <= totalStudent){
//			System.out.println("请输入第 "+count+" 学生的姓名: ");
//			String student = console.nextLine();
//			list.add(student);
//			totalStudent--;
//			count++;
//		}
		for(int i=0;i<totalStudent;i++){
			System.out.println("请输入第 "+(i+1)+" 学生的姓名: ");
			list.add(console.next());
		}
		//打印出集合类中的学生信息
		for(String s:list){
			System.out.println("第"+count+"个学生为: "+s);
			count++;
		}
		//2. 完成删除学生的任务
		//循环删除学生
		while(true){
			System.out.println("请输入你要删除的学生的名字: ");
			String name = console.next();
			for(int i=0;i<list.size();i++){
				boolean flag = false;
				if(((String)list.get(i)).equals(name)){
					list.remove(name);
					flag = true;
				}
				if(flag){
					int countt=1;
					System.out.println("删除学生"+name+"之后还剩的学生有！");
					for(String s:list){
						System.out.println("第"+countt+"个学生为: "+s);
						countt++;
					}
				}else{
					System.out.println("对不起，该学生不存在!请确定之后再输入！");
				}
			}
			
		}
	}

}
