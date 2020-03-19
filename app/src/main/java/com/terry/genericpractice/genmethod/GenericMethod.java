package com.terry.genericpractice.genmethod;

public class GenericMethod{
    //这是一种可变参数的表示，这种可变参数底层其实会转化为T[] x的形式，所以可以接受多个T类型的传参
    public <T> T GenericMethod(T...a){
        return  a[a.length/2];
    }
}
