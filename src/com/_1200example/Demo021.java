package com._1200example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.omg.Messaging.SyncScopeHelper;

public class Demo021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PrintStream out = System.out;//保存原输出流
			//创建文件输出流
			PrintStream ps = new PrintStream("./log.txt");
			//设置使用新的输出流
			System.setOut(ps);
			int age=18;
			System.out.println("年龄变量成功定义，值为:"+age);
			String sex = "女";
			System.out.println("性别变量成功定义，值为:"+sex);
			//整合两个变量
			String info = "这是个"+sex+"孩子，看起来有"+age+"岁的样子！";
			System.out.println("整合了两个变量之后为info变量,结果是:"+info);
			System.setOut(out);
			System.out.println("程序运行完毕，请查看日志文件");
			
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
