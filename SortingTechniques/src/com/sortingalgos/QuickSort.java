package com.sortingalgos;

public class QuickSort extends Sort {

	// quicksort the array
	public void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}

	// quicksort the subarray from a[lo] to a[hi]
	private void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	// partition the subarray a[lo .. hi] by returning an index j
	// so that a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
	private int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Comparable v = a[lo];
		while (true) {

			// find item on lo to swap
			while (less(a[++i], v))
				if (i == hi)
					break;

			// find item on hi to swap
			while (less(v, a[--j]))
				if (j == lo)
					break; // redundant since a[lo] acts as sentinel

			// check if pointers cross
			if (i >= j)
				break;

			exch(a, i, j);
		}

		// put v = a[j] into position
		exch(a, lo, j);

		// with a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
		return j;
	}

}
