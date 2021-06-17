package quicksort;

public class QuickSort {
	public void sort(int [] dataArray) {
		if(dataArray != null && dataArray.length > 1) {
			quickSort(dataArray, 0, dataArray.length - 1);
		}
	}
	
	private void quickSort(int [] dataArray, int start, int end) {
		if(start < end) {
			int partitionIndex = getPartitionIndex(dataArray, start, end);
			quickSort(dataArray, start, partitionIndex - 1);
			quickSort(dataArray, partitionIndex, end);
		}
	}
	
	private int getPartitionIndex(int [] dataArray, int start, int end) {
		int pIndex = start;
		int pivot = dataArray[end];
		
		for(int i = start; i < end; i++) {
			if(dataArray[i] <= pivot) {
				int temp = dataArray[i];
				dataArray[i] = dataArray[pIndex];
				dataArray[pIndex] = temp;
				
				pIndex++;
			}
		}
		dataArray[end] = dataArray[pIndex]; 
		dataArray[pIndex] = pivot;
		
		return pIndex;
	}
}
