package com.home;

public class B_Variable {
	public static void main(String[] args) {
		String name = "Ja" + "Va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+ " ");
		System.out.println(" " + 7);
		System.out.println(7+"");
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		temporary();
		
	}
	public static void temporary() {
		int x = 10, y = 5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
