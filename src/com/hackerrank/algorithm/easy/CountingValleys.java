package com.hackerrank.algorithm.easy;

public class CountingValleys {
  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
    int totalValleys = 0;
    int currentPosition = 0;
    boolean isUnderSeaLevel = false;
    for(int i=0; i<n; i++){
      if(s.charAt(i) == 'U'){
        currentPosition++;
        if(currentPosition == 0 && isUnderSeaLevel){
          isUnderSeaLevel = false;
          totalValleys++;
        }
      }else if(s.charAt(i) == 'D'){
        currentPosition--;
        if(currentPosition < 0 && !isUnderSeaLevel){
          isUnderSeaLevel = true;
        }
      }
    }
    return totalValleys;

  }
}
