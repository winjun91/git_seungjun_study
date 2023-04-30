package com.home;

public class Run {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		

		int[] arr =new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		b.bubblesort(arr);
	}

}
