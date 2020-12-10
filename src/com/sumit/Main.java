package com.sumit;

public class Main {

    
    public static void main(String[] args) {
    	
    	int[]  actual = { 5, 1, 6, 2, 3, 4 };
        int length = actual.length;
        
    	MergeArray.mergeSortMethod(actual, length);
    	
    	System.out.println("AFter Sort");
    	
    	for(int i=0;i<actual.length;i++) {
    		System.out.println(actual[i]);
    	}
    	
	}
 
    
    
    
}
