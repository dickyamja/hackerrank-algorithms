package com.hackerrank.algorithm.easy;

public class BirthdayCakeCandles {
  public static int birthdayCakeCandles(int[] ar) {
    int totalTallestCandles = 0;
    int tallestCandle = ar[0];
    int length = ar.length;
    for(int i=1; i<length; i++){
      if(ar[i] > tallestCandle){
        tallestCandle = ar[i];
      }
    }
    for(int j=0; j<length; j++){
      if(ar[j] == tallestCandle){
        totalTallestCandles++;
      }
    }
    return totalTallestCandles;
  }
}
