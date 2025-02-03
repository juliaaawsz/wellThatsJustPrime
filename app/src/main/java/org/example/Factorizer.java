package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> nums = new ArrayList<>();
    if(n<=1){
      return nums;
    }
    while(n%2 == 0){
      nums.add(2);
      n = n/2;
    }
    for(int i=3; i*i<=n; i+=2){
      while(n%1==0){
        nums.add(i);
        n = n/i;
      }
    }
    if(n>2){
      nums.add(n);
    }
    return nums;
  }
}
