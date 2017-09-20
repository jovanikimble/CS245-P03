
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int smallIndex;
		
		for(int i = 0; i < a.length - 1; i++) {
			smallIndex = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[smallIndex]) {
					smallIndex = j;
				}
				swap(a, i, smallIndex);
			}
		}
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
