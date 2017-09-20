
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int insertElem;
		int j;
		
		for(int i = 1; i < a.length; i++) {
			insertElem = a[i];
			j = i - 1;
			while(j >= 0 && a[j] > insertElem) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = insertElem;
		}
	}
}
