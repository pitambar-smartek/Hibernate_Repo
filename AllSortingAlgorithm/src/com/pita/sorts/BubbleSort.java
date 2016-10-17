package com.pita.sorts;

public class BubbleSort {
    static  long totalTime=System.currentTimeMillis();

	public static void main(String[] args) {
		System.out.println("Good site One=  http://www.java2novice.com/java-sorting-algorithms/");
		System.out.println("Good site Two="+"http://www.studytonight.com/data-structures/bubble-sort");
		int arr[]={1,0,6,95,10,202,33,250};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Outer loop");
			int flag=0;
			for(int j=0;j<arr.length-1;j++)
			{
				System.out.println("inner loop");
				
				if(arr[j]>arr[j+1]){
					System.out.println("One swapping happen");
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
					continue;
				}
			}
			if(flag==0){
				break;
			}
		}
		 System.out.println("Displaying all the elements of array");
		 
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+",");
		 }
		 System.out.println("Total Time taken is="+(System.currentTimeMillis()-totalTime));
 

	}

}
