package com;

import java.util.Scanner;

import com.constants.ArrayConstants;
import com.constants.StringConstants;
import com.sortingalgos.InsertionSort;
import com.sortingalgos.MergeSort;
import com.sortingalgos.QuickSort;
import com.sortingalgos.SelectionSort;
import com.sortingalgos.Sort;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(StringConstants.START_THE_PROGRAM);
		for(int i=0;i<5;i++){
			System.out.print((i+1) + "-->");
			show(ArrayConstants.arrayToBeSorted[i]);
			System.out.println();
		}
		System.out.println(StringConstants.ENTER_DIGIT);
		int arrIndex = in.nextInt();
		Integer[] tempArr = ArrayConstants.arrayToBeSorted[arrIndex-1];
		System.out.println(StringConstants.SORT_THE_PROGRAM);
		for(int i=0;i<4;i++){
			System.out.print((i+1) + "-->");
			System.out.println(ArrayConstants.sortingTechniques[i]);
		}
		System.out.println(StringConstants.ENTER_DIGIT_4);
		int sortIndex = in.nextInt();
		SortArray(tempArr,sortIndex);
	}
	
	private static void SortArray(Integer[] tempArr, int sortIndex) {
			Sort sorter = new QuickSort(); //default.
			switch(sortIndex){
			case 1:
				sorter = new MergeSort();break;
			case 2:
				sorter = new QuickSort();break;
			case 3:
				sorter = new InsertionSort();break;
			case 4:
				sorter = new SelectionSort();break;
			}
			sorter.sort(tempArr);
			System.out.println("\n\nFind below sorted Array\n\n");
			show(tempArr);
	}

	// print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
	
	
}
