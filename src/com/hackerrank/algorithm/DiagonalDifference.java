package com.hackerrank.algorithm;

import java.util.List;

public class DiagonalDifference {
  public static int diagonalDifference(List<List<Integer>> arr) {
    int ordo = arr.size();
    int j=ordo - 1;
    int sumLeftToRightDiagonal = 0;
    int sumRightToLeftDiagonal = 0;
    for(int i=0; i<ordo; i++){
      sumLeftToRightDiagonal+=  arr.get(i).get(i);
      sumRightToLeftDiagonal+=  arr.get(i).get(j);
      j--;
    }
    int diagonalDifference = sumLeftToRightDiagonal - sumRightToLeftDiagonal;
    return diagonalDifference < 0 ? (-1 * diagonalDifference) : diagonalDifference;
  }
}
