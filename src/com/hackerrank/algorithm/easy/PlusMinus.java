package com.hackerrank.algorithm.easy;

public class PlusMinus {
  public static void plusMinus(int[] arr) {
    int totalPositive = 0;
    int totalNegative = 0;
    int totalZero = 0;
    int length = arr.length;
    for(int i=0; i<length; i++){
      if(arr[i] < 0){
        totalNegative++;
      }else if(arr[i] > 0){
        totalPositive++;
      }else{
        totalZero++;
      }
    }
    System.out.printf("%6f\n%6f\n%6f",(double)totalPositive/length, (double)totalNegative/length, (double)totalZero/length);
  }
}
