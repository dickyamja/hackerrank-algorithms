package com.hackerrank.algorithm.easy;

public class AppleAndOrange {

  public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int totalAppleInSamHouse = 0;
    int totalOrangeInSamHouse = 0;
    int totalApples = apples.length;
    int totalOranges = oranges.length;

    for(int i = 0; i<totalApples; i++){
      int distance = apples[i];
      if(distance >= 0){
        int distancePosition = a + distance;
        if(distancePosition >= s && distancePosition <= t){
          totalAppleInSamHouse++;
        }
      }
    }

    for(int i = 0; i<totalOranges; i++){
      int distance = oranges[i];
      if(distance <= 0){
        distance = -1 * distance;
        int distancePosition = (b - distance);
        if(distancePosition >= s && distancePosition <= t){
          totalOrangeInSamHouse++;
        }
      }
    }
    System.out.println(totalAppleInSamHouse);
    System.out.println(totalOrangeInSamHouse);
  }
}
