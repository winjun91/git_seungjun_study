package com.home;

public class BubbleSort {
	void bubblesort(int arr[]) {
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		
		for(int i=0; i < arr.length-1; i++) {
			for(int j=0; j < arr.length -1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					System.out.println();
				}
			
				for(int s=0; s < arr.length; s++) {
					System.out.print("j배열 반복 : " + arr[s]);
				}
				
			}
			for(int f=0; f < arr.length; f++) {
				System.out.println("i배열 반복 : " + arr[f]);
			}
		
			
		}
		
	}


}
