package com._1200example;

import java.util.Scanner;

public class Example029_userLoginCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		//�����û���
		System.out.println("please input your username: ");
		String userName = console.nextLine();
		//��������
		System.out.println("Please input your password: ");
		String password = console.nextLine();
		
		if(!userName.equals("ltwuyanlong")){
			System.out.println("wrong username!");
		}else if(!password.equals("woaiwojia")){
			System.out.println("wrong password!");
		}else{
			System.out.println("Check pass!");
		}
		
		
		
	}

}
