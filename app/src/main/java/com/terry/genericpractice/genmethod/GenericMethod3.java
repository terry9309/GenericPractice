package com.terry.genericpractice.genmethod;

import androidx.annotation.NonNull;

public class GenericMethod3 {

    static  class  Fruit{
        @NonNull
        @Override
        public String toString() {
            return "fruit";
        }
    }

    static  class Apple extends  Fruit{
        @NonNull
        @Override
        public String toString() {
            return "apple";
        }
    }


    static  class  Person{

        @NonNull
        @Override
        public String toString() {
            return "person";
        }
    }



    static class  GenerateTest<T>{

      public void  show_1(T t){
          System.out.println(t.toString());
      }


      //在泛型类中声明了一种泛型方法，使用泛型E,这种泛型E可以为任意类型。
      //可以类型与T相同，也可以不同。
      //由于泛型方法在声明的时候会声明泛型<E>因此即使泛型类中并未声明泛型，
      //编译器也能够正确的识别泛型方法中识别的泛型；


      public  <E> void show3(E t){
          System.out.println(t.toString());
      }


      //在泛型类中声明了一个泛型方法，使用泛型T,
      //注意这个T是一种全新的泛型，可以与泛型类中声明的T不是同一种类型。


      public  <T> void  show_2(T t){
          System.out.println(t.toString());
      }


    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();
        GenerateTest<Fruit> generateTest = new GenerateTest<>();
        generateTest.show_1(apple);

        //无法传入person
        // generateTest.show_1(person);

        generateTest.show_2(apple);
        generateTest.show_2(person);

        generateTest.show3(apple);
        generateTest.show3(person);

    }

}
