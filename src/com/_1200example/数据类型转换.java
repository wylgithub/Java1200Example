package com._1200example;

public class ��������ת�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		char c = 'w';
		short s = 12345;
		int i = 123;
		long l = 123456789;
		float f = 3.123456F;
		double d = 2356.1234;
		
		System.err.println("�������������ת��:");
		System.out.println("�ۼ�byte����"+b);
		System.out.println("�ۼ�char����"+(b+c));
		System.out.println("�ۼ�short����"+(b+c+s));
		System.out.println("�ۼ�int����"+(b+c+s+i));
		System.out.println("�ۼ�long����"+(b+c+s+i+l));
		System.out.println("�ۼ�float����"+(b+c+s+i+l+f));
		System.out.println("�ۼ�double����"+(b+s+c+i+l+f+d));
		
		System.err.println("�������������Ҫǿ��ת��+(int)l"+(int)l);
		System.out.println("�������������Ҫǿ��ת��"+(short)l);
		System.out.println("�������������Ҫǿ��ת��"+(byte)d);
		
	}

}
