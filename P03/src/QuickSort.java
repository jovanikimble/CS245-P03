
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}
	
	private void sort(int[] a, int low, int high) {
		int pivot;
		
		if(low < high) {
			pivot = partition(a, low, high);
			sort(a, low, pivot - 1);
			sort(a, pivot + 1, high);	
		}
	}
	
	public int partition(int[] a, int low, int high) {
		int pivot;
		int tmp;
		int max = high;
		int mid = (low + high) / 2;

		tmp = a[mid];
		a[mid] = a[high];
		a[high] = tmp;
		pivot = a[high];
		low--;
		
		do {
			while (a[++low] < pivot)
				;
			while ((low < high) && (a[--high] > pivot))
				;
			tmp = a[low];
			a[low] = a[high];
			a[high] = tmp;
		} while (low < high);
		
		tmp = a[low];
		a[low] = a[max];
		a[max] = tmp;
		
		return low;
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
