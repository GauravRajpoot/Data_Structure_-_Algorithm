package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is Naive approach
 */
public class RotateArrayElement {
	
	/*
	 * Print array elements
	 */
	public void printArrayElements(int arr[]) {
		Arrays.stream(arr).forEach(System.out::print);
	}
	
	/*
	 * Store array elements in temporary array
	 */
	public int[] storeElementsInArray(int arr[], int d) {
		int newArray[] = new int[d];
		for(int i = 0; i < d; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
	
	/*
	 * Print left rotate the array by d element
	 */
	public int[] leftRotate(int arr[], int d) {
		int i;
		int storedValues[] = storeElementsInArray(arr, d);
		for (i = 0; i < arr.length - d; i++) {
			arr[i] = arr[d + i];
		}
		for (int j = 0; i <= arr.length - 1 && j < d; j++, i++) {
			arr[i] = storedValues[j];
		}
		return arr;
	}
	
	/*
	 * Input array elements from user
	 */
	public int[] enterElements(Scanner s) {
		 System.out.print("Enter number of elements : ");
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        System.out.print("Enter elements : ");
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	        }
	        return arr;
	}

	public static void main(String[] args) {
		RotateArrayElement a = new RotateArrayElement();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number to rotate the array : ");
			int d = sc.nextInt();
			int arr[] = a.enterElements(sc);
			System.out.println("Array before shifting : " + Arrays.toString(arr));
			System.out.println("Array before shifting : " + Arrays.toString(a.leftRotate(arr, d)));
		}catch (Exception e) {
			System.out.println("Number of element to be rotated is greater than array size :: "+e.getMessage());
		}
	}
}
