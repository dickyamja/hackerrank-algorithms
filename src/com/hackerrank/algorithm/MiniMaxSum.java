package com.hackerrank.algorithm;

public class MiniMaxSum {
  public static void miniMaxSum(int[] arr) {
    long maxSum = 0;
    long minSum = 0;
    long sum1 = (long)arr[1] + arr[2] + arr[3] + arr[4];
    long sum2 = (long)arr[0] + arr[2] + arr[3] + arr[4];
    long sum3 = (long)arr[0] + arr[1] + arr[3] + arr[4];
    long sum4 = (long)arr[0] + arr[1] + arr[2] + arr[4];
    long sum5 = (long)arr[0] + arr[1] + arr[2] + arr[3];
    long[] arraySum = new long[]{sum1, sum2, sum3, sum4, sum5};
    int length = arraySum.length;
    minSum = arraySum[0];
    maxSum = arraySum[0];
    for(int i=1; i <length; i++){
      if(arraySum[i] < minSum){
        minSum = arraySum[i];
      }

      if(arraySum[i] > maxSum){
        maxSum = arraySum[i];
      }
    }
    System.out.println(minSum + " " + maxSum);

  }
}
