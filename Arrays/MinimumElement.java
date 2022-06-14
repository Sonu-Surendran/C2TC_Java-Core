package Arrays;

import java.util.Scanner;

public class MinimumElement {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<size;i++) {
			arr[i]= in.nextInt();
		}
		System.out.println("The minimum value is "+min(arr));
		
		
	}
	
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
	}

}
