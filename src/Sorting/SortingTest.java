package Sorting;

public class SortingTest {

	public static void main(String[] args) {

		Integer A[] = { 44, 2, 10, 7, 10, 22, 0, 1, 3, 5, 9, 2, 6, 0};
		Integer B[] = {};
		Sorting sorting = new Sorting();

//		sorting.insertionSort(A);
//		sorting.insertionSort(B);
		
		sorting.selectionSort(A);
		sorting.selectionSort(B);
		
		sorting.mergeSort(A, 0, A.length-1);
		
		

		for (Integer integer : A) {
			System.out.print(integer + "::");
		}
		
		for (Integer integer : B) {
			System.out.print(integer + "::");
		}
		
		

	}
}
