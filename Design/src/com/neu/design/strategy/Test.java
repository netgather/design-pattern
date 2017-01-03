package com.neu.design.strategy;



public class Test {

	@org.junit.Test
	public void testBubbleSort() {
		int [] array = new int[]{1,23,41,23,54,65,23,27,343,1241,3445,7,143,1090};
		Strategy strategy = new BubbleSort();
		System.out.println(strategy.sort(array));
	}
	@org.junit.Test
	public void testQuickSort() {
		int [] array = new int[]{1,23,41,23,54,65,23,27,343,1241,3445,7,143,1090};
		Strategy strategy = new QuickSort();
		System.out.println(strategy.sort(array));
	}
	@org.junit.Test
	public void testMergeSort() {
		int [] array = new int[]{1,23,41,23,54,65,23,27,343,1241,3445,7,143,1090};
		Strategy strategy = new MergeSort();
		System.out.println(strategy.sort(array));
	}
}
