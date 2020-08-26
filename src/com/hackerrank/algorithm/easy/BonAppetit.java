package com.hackerrank.algorithm.easy;

import java.util.List;

public class BonAppetit {
  static void bonAppetit(List<Integer> bill, int k, int b) {
    int totalItem = bill.size();
    int totalBill = 0;
    for(int i = 0; i< totalItem; i++){
      if(k != i){
        totalBill += bill.get(i);
      }
    }
    int annaBill = totalBill / 2;
    if(annaBill != b){
      System.out.println(b - annaBill);
    }else{
      System.out.println("Bon Appetit");
    }
  }
}
