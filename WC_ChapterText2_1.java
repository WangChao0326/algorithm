package com.insertionSort;

import java.util.Arrays;

public class WC_ChapterText2_1 {
	public static void main(String[] args){
		int[] a={12,6,8,1,4,2,5};
		WC_ChapterText2_1 b=new WC_ChapterText2_1();
		b.insertSort(a);
	}
	public void insertSort(int[] arrays){
		for(int i=1;i<arrays.length;i++)
		{
			
			int j=i-1;
			int m=arrays[i];
			while(j>=0 && arrays[j]>m)
			{
				arrays[j+1]=arrays[j];
				j=j-1;
			}
			arrays[j+1]=m;
		}
		System.out.println(Arrays.toString(arrays));
	}
}