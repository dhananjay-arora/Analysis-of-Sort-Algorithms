package com;
public class SelectionSort {
   public static void selectionSort(int numbers [], int numbersSize) {
      int i;
      int j;
      int indexSmallest;
      int temp;      // Temporary variable for swap

      for (i = 0; i < numbersSize; ++i) {

         // Find index of smallest remaining element
         indexSmallest = i;
         for (j = i + 1; j < numbersSize; ++j) {

            if (numbers[j] < numbers[indexSmallest]) {
               indexSmallest = j;
            }
         }

         // Swap numbers[i] and numbers[indexSmallest]
         temp = numbers[i];
         numbers[i] = numbers[indexSmallest];
         numbers[indexSmallest] = temp;
      }
   } 
}