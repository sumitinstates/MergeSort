package com.sumit;

public class MergeArray {
	
	public static void mergeSortMethod(int[]a, int length) 
	{
		if(length<2) 
		{
			return;
		}
		
		//length of sub arrays
		int middle = length/2;
		int remaining = length - middle;
		
		//sub arrays
		int [] left = new int [middle];
		int [] right = new int [remaining];
		
		for(int i=0; i<middle; i++) {
			left[i]=a[i];
		}
		
		for(int i=middle; i<length; i++) {
			right[i-middle]=a[i];
		} 
		
		mergeSortMethod(left,middle);
		mergeSortMethod(right,remaining);
		
		mergeArray(a,left,right,middle,remaining);
			
	}

	
	public static void mergeArray(int[]a, int[] leftArray, int [] rightArray, int leftArrayLength, int rightArrayLength) 
	{
		int i = 0, j=0, k = 0;
		
		while(i<leftArrayLength && j<rightArrayLength) 
		{
			if(leftArray[i]<=rightArray[j]) 
			{
				a[k]=leftArray[i];
				i++;
				k++;
			}
			else
			{
				a[k]=rightArray[j];
				j++;
				k++;
			}
		}
		
		while(i<leftArrayLength) 
		{
			a[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArrayLength) 
		{
			a[k]=rightArray[j];
			j++;
			k++;
		}
	}

}
