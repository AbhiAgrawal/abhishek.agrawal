package com.sortingalgos;

public class MergeSort extends Sort {

	// stably merge a[lo .. mid] with a[mid+1 .. hi] using aux[lo .. hi]
	public void merge(Comparable[] a, Comparable[] aux, int lo, int mid,
			int hi) {

		// copy to aux[]
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		// merge back to a[]
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}

	}

	// mergesort a[lo..hi] using auxiliary array aux[lo..hi]
	private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

}
