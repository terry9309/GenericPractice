package com.terry.genericpractice.restrict;

public class ExceptionRestrict {

    //泛型类不能extends Exception/Throwable
   // private  class  Problem<T> extends Exception;


    /*public  <T extends  Throwable> void  doWork(T t){

        try {

        }catch (T t){

        }
    }*/


    //可以抛出异常；

    public  <T extends  Throwable> void  doWork(T t)throws T{

        try {

        }catch (Throwable e){
            throw  t;

        }
    }
}
