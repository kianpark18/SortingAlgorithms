/*Author: Kian Chanwoo Park  
 *Email: parkchan@brandeis.edu
 *Date: 01/22/18
 *Program: This program is to sort integers by a merge-sort algorithm.
 * Worst-Case O(n log n); Average-Case O(n log n); Best-Case O(n log n);
 */

import java.util.Arrays;

public class MergeSort {
	
	public void mergeSort(int[] array) { // recursive method
		if(array.length < 2) { // base condition
			return;
		}
		
		//create two new arrays && assign the values
		int[] leftArr = new int[array.length/2]; 
		int[] rightArr = new int[array.length - leftArr.length];
		
		for(int i=0; i<leftArr.length; i++) {
			leftArr[i] = array[i];
		}
		
		for(int i=0; i<rightArr.length; i++) {
			rightArr[i] = array[leftArr.length + i];
		}
		
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(array, leftArr,rightArr); // merge the two arrays into one
		
	}
	
	private void merge(int [] array, int[] leftArr, int[] rightArr) {
		int i = 0;
		int j = 0;
		int k = 0;
	
		while(i<leftArr.length && j<rightArr.length) {
			if(leftArr[i] < rightArr[j]) { // compare and swap
				array[k] = leftArr[i];
				i++;
				k++;
			}else {
				array[k] = rightArr[j];
				j++;
				k++;
			}
		}
		
		// put unassigned values into the array
		while(i<leftArr.length) {
			array[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j<rightArr.length) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	

	public static void main(String[] args) {
		int[] array = {21, 332, 7, 1, 6, 2,5};
		MergeSort merge = new MergeSort();
		System.out.println("Unsorted: " + Arrays.toString(array));
		merge.mergeSort(array);
		System.out.println("Sorted: " + Arrays.toString(array));

	}

}
