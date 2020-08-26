package com.hackerrank.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
  public static List<Integer> gradingStudents(List<Integer> grades) {
    int length = grades.size();
    List<Integer> finalGrades = new ArrayList<>(length);
    for(Integer grade : grades){
      if(grade >= 38){
        int moduloOfFive = grade % 5;
        int gradeMinusModulo = grade - moduloOfFive;
        int nextMultipleOfFive = gradeMinusModulo + 5;
        if((nextMultipleOfFive - grade) < 3) {
          finalGrades.add(gradeMinusModulo + 5);
        }else{
          finalGrades.add(grade);
        }
      }else{
        finalGrades.add(grade);
      }

    }
    return finalGrades;
  }
}
