package com._1200example;

public class 数据类型转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		char c = 'w';
		short s = 12345;
		int i = 123;
		long l = 123456789;
		float f = 3.123456F;
		double d = 2356.1234;
		
		System.err.println("低类型向高类型转换:");
		System.out.println("累加byte等于"+b);
		System.out.println("累加char等于"+(b+c));
		System.out.println("累加short等于"+(b+c+s));
		System.out.println("累加int等于"+(b+c+s+i));
		System.out.println("累加long等于"+(b+c+s+i+l));
		System.out.println("累加float等于"+(b+c+s+i+l+f));
		System.out.println("累加double等于"+(b+s+c+i+l+f+d));
		
		System.err.println("高类型向低类型要强制转换+(int)l"+(int)l);
		System.out.println("高类型向低类型要强制转换"+(short)l);
		System.out.println("高类型向低类型要强制转换"+(byte)d);
		
	}

}
