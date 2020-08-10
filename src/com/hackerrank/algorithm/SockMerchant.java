package com.hackerrank.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SockMerchant {
  static int sockMerchant(int n, int[] ar) {
    int totalPair = 0;
    int length = ar.length;
    List<Integer> listData = new ArrayList<>();
    for(int i=0; i < length; i++){
      if(!listData.contains(ar[i])){
        listData.add(ar[i]);
      }else{
        totalPair++;
        listData.remove(listData.indexOf(ar[i]));
      }
    }
    return totalPair;
  }
}
