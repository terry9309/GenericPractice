package com.terry.genericpractice.typelimit;

public class ArrayAlg {

   /* public static  <T> T min(T a,T b){
        if (a.comapareTo(b)>0)return  a;else return  b;
    }*/

   public static  <T extends  Comparable> T min(T a,T b){
      return  a.compareTo(b)>0 ?a:b;
   }


    static  class  Test{

    }


    public static void main(String[] args) {

    }

}
