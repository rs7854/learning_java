package learning.dataStructure.Arrays;

import java.util.Arrays;

public class SortTheArrays {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void insertionSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j > 0; j--) {
					if (arr[j] < arr[j - 1]) swap(arr, j, j - 1);
					else break;
				}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

//		int arr[] = new int[6];
		int[] arr = { 2, 1, 3, 7, 6, 5, 4 };
		insertionSort(arr);

	}

}
