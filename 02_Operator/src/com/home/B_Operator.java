package com.home;

public class B_Operator {
	public void operator2() {
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행후 , i=" + i +", j=" + j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행후, i=" + i +", j="+j);
	}
}
