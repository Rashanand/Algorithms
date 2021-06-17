package quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int [] qsArr = new int[]{2, 7, 1, 6, 6, 8, 5, 3, 3, 3, 4}; 
		qs.sort(qsArr);
		
		for(int i = 0; i < qsArr.length; i++) {
			System.out.print(qsArr[i] + ", ");
		}
	}

}
