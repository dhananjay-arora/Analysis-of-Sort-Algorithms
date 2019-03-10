package com;

public class BubbleSort {
	   public static void bubbleSort(int numbers [], int numbersSize) {
	      int i;
	      int j;
	      int temp;      // Temporary variable for swap	      
	      for (i = 0; i < numbersSize-1; i++) {	    	  
	         for (j = 0; j< (numbersSize-i-1); j++) {
	        	 if (numbers [j]> numbers[j+1])	{
	            // Swap numbers[j] and numbers[j + 1]
	            temp = numbers[j];
	            numbers[j] = numbers[j + 1];
	            numbers[j+1] = temp;	            
	        	 }
	         }
	      }
	   }
	}