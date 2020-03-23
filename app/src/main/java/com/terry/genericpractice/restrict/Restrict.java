package com.terry.genericpractice.restrict;


import java.sql.SQLOutput;

/**
 *  泛型的约束和局限性
 */

public class Restrict<T>  {

    private  T   data;

    //不能实例化类型变量
//    public  Restrict(){
//        this.data = new T();
//    }

    //静态域或者方法里不能引用类型变量
//   private static  T instance;

    //但是静态方法本身泛型方法就行；
   /* private  static   <T> T getInstance(){}*/


    public static void main(String[] args) {
       // RestrictM<double> restrict;



    // if (restrict instanceof Restrict<Double>)
        Restrict<Double> restrict = new Restrict<>();
        Restrict<String> restrictString = new Restrict<>();

        System.out.println(restrict.getClass().getName());
        System.out.println(restrictString.getClass().getName());


}

}
