
public class BinarySearch {

	public static final int CAPACITY = 100;
	private Integer[] A = new Integer[CAPACITY];
	private Integer value;
	private Integer i, j;

	public static Integer binarySearch(Integer[] A, Integer value, Integer i, Integer j) {
		if (i > j)
			return 0;
		else {
			Integer m = (i + j) / 2;
			if (A[m].equals(value))
				return m;
			else if (A[m] < value)
				return binarySearch(A, value, m + 1, j);
			else
				return binarySearch(A, value, i, m - 1);
		}
	}

	public static void main(String[] args) {

		Integer[] A = { 2, 3, 5, 9, 22, 23, 33, 35, 44, 220, 255, 422 };

		System.out.println(binarySearch(A, 2 , 0, 12));

	}

}
