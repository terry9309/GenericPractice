package com.terry.genericpractice.wildchar;

import com.terry.genericpractice.genmethod.GenericMethod2;

public class WildChar {


    public static  void  print(GenericType<? extends Fruit> p){
        System.out.println(p.getData().getColor());
    }


    public static  void  use(){
        GenericType<Fruit> a = new GenericType<>();
        print(a);
        GenericType<Orange> b = new GenericType<>();
        print(b);

    }
}
