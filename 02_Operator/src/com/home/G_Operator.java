package com.home;

public class G_Operator {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		operator10();
		operator11();
	}
	public static void operator10() {
		int x = 10;
		int y = 8;
		System.out.printf("%d을 %d로 나누면, %n", x,y);
		System.out.printf("몫을 %d이고, 나이지는 %d입니다.%n", x / y, x % y);
	}
	public static void operator11() {
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		
	}
	

}
