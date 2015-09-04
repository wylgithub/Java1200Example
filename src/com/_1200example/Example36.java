package com._1200example;

import java.math.BigDecimal;

public class Example36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal sum = new BigDecimal(0.0);	//计算和的精度
		BigDecimal factorial = new BigDecimal(1.0);//算式的精度
		int i = 1;
		while(i<=20){
			sum = sum.add(factorial);
			++i;
			factorial = factorial.multiply(new BigDecimal(1.0/i));
		}
		System.out.println("1+1/2!+1/3!+......+1/20! = "+"\n"+sum);
	}

}
