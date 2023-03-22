package com.home;

public class D_Operator {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int) d;
		System.out.println("score=" + score);
		System.out.println("d=" + d);
		operator5();
	}

	public static void operator5() {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
	}
		
}
