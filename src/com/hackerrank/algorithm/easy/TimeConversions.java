package com.hackerrank.algorithm.easy;

public class TimeConversions {
  static String timeConversion(String s) {
    String convertedTime = "";
    String hour = s.substring(0,2);
    if(s.endsWith("PM") && !"12".equals(hour)){
      hour = String.valueOf(Integer.parseInt(hour) + 12);
    }else if(s.endsWith("AM") && "12".equals(hour)) {
      hour = "00";
    }
    hour = hour.length() <2 ? "0" + hour: hour;
    convertedTime = hour + s.substring(2,8);
    return convertedTime;
  }
}
