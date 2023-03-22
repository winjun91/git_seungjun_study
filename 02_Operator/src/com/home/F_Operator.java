package com.home;

public class F_Operator {
	public static void operator6() {
		System.out.println(5/2);
		System.out.println(5/(float)2); 
	}
	public void operator7() {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
	}
	public void operator8() {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a*b;
		System.out.println(c);
	}
	public void operator9() {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
