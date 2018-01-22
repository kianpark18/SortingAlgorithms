import java.util.Arrays;
//Kian Chanwoo Park
//Email: kianpark18@gmail.com 
//This program is to use quicksort algorithm to sort integers.
//worst case O(n2). average case O(n log n);  

public class QuickSort { 
	
	public void sort(int[] a) {
		quickSort(a, 0, a.length-1);
		
	}
	
	private void quickSort(int[]a, int start, int end) { // start index and end index
		if(start>=end) { // a base return condition
			return;
		}
		int p = partition(a,start,end); 
		quickSort(a,start,p-1);
		quickSort(a,p+1,end);
		
		
	}
	
	private int partition(int[] a, int start, int end) {
		int pivot = a[end]; // use the last element in array as pivot
		int pIndex = start;
		for(int i= start; i<end; i++) {
			if(a[i]<pivot) { // put elements that are smaller than pivot to the left side of array.
				int temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
		
		int temp = a[pIndex]; // put pivot in the midpoint of array.
		a[pIndex] = pivot;
		a[end] = temp;
		
		
		return pIndex;
	}
	
	public static void main(String[] args) {
		QuickSort quicksort = new QuickSort();
		int[] a = {10,7,8,9,1,5};
		System.out.println(Arrays.toString(a));
		quicksort.sort(a);
		System.out.println(Arrays.toString(a));
	}

	


}
