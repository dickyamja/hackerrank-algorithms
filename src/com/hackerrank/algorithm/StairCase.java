package com.hackerrank.algorithm;

public class StairCase {
  public static void staircase(int n) {
    int i=1;
    while(i<=n){
      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print("#");
      }
      System.out.println();
      i++;
    }

  }
}
