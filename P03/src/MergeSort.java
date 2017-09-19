
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length - 1);
	}
	
	private static void mergeSort(int[] a, int[] temp, int low, int high) {
		if (low >= high) {
			return;
		}
		
		// divide in half
		int mid = (low + high) / 2;
		mergeSort(a, temp, low, mid);
		mergeSort(a, temp, mid + 1, high); //merge halves to one
		merge(a, temp, low, mid, high);
											
	}
	
	public static void merge(int[] a, int[] temp, int low, int mid, int high) {
		int k = low;
		int i = low;
		int j = mid + 1;
		
		while (k <= high) {
			if (i > mid) { // ran out of elements in the i sublist
				temp[k] = a[j];
				k++;
				j++;
			} else if (j > high) {// ran out of elements in the j sublist
				temp[k] = a[i];
				k++;
				i++;
			} else if (a[i] < a[j]) { // place a[i] in temp, move i
				temp[k] = a[i];
				k++;
				i++;
			} else {
				temp[k] = a[j]; // place a[j] in temp, move j
				k++;
				j++;
			}
		}
		
		// copy the result from temp back to a
		for (k = low; k <= high; k++)
			a[k] = temp[k];
	}
}
