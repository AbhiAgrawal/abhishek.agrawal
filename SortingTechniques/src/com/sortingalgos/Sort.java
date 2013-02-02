package com.sortingalgos;

public abstract class Sort {

	// is v < w ?
	static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	// exchange a[i] and a[j]
	static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public abstract void sort(Comparable[] a);

}
