package com.terry.genericpractice.genmethod;

import android.util.SparseArray;

public class GenericMethod2 {

    public  class  Generic<T>{
        private  T key;

        public  Generic(T key){
        this.key = key;

        }

    /**
     * 虽然在方法中使用了泛型，但是这并不是一个泛型方法。
     * 这只是类中的一个普通成员方法，只不过它的返回值是在声明泛型类已经声明过的泛型；
     * 所以在在这个方法中才可以继续使用T这个泛型
     */

    public T getKey(){
        return  key;
    }


    //这里只是一个普通方法，只是使用Generic<Number>作为行参而已；
    public  void  show(Generic<Number> object){

    }
    }
   }
