package Sorting;

public class Sorting {

	public void insertionSort(Integer[] A) {
		for (int i = 1; i < A.length; i++) {
			Integer temp = A[i];
			Integer j = i;
			while (j > 0 && A[j - 1] > temp) {
				A[j] = A[j - 1];
				j--;
			}
			A[j] = temp;
		}
	}

	public void selectionSort(Integer[] A) {
		Integer temp;
		for (int i = 0; i < A.length; i++) {
			Integer j = min(A, i);
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	}

	public Integer min(Integer[] A, Integer k) {
		Integer min = k;
		for (int j = k + 1; j < A.length; j++) {
			if (A[j] < A[min])
				min = j;
		}
		return min;
	}

	public void mergeSort(Integer[] A, Integer primo, Integer ultimo) {
		if (ultimo > primo) {
			Integer mezzo = (ultimo + primo) / 2;
			mergeSort(A, primo, mezzo);
			mergeSort(A, mezzo + 1, ultimo);
			merge(A, primo, ultimo, mezzo);
		}
	}
	
	public void merge(Integer[] A, Integer primo, Integer ultimo, Integer mezzo) {
		
		Integer i = primo;
		Integer j = mezzo + 1;
		Integer k = primo;
		Integer[] B = new Integer [A.length];
		while (i <= mezzo && j <= ultimo) {
			if (A[i] <= A[j]) {
				B[k] = A[i];
				i++;
			}
			else {
				B[k] = A[j];
				j++;
			}
			k++;
		}
		j = ultimo;
		for (int h = mezzo; h >= i; h--) {
			A[j] = A[h];
			j--;
		}
		for (j = primo; j <= k - 1; j++) {
			A[j] = B[j];
		}
	}

}
