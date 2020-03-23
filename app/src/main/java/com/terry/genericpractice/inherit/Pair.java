package com.terry.genericpractice.inherit;

public class Pair<T> {

    private T one;
    private T two;

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public T getTwo() {
        return two;
    }

    public void setTwo(T two) {
        this.two = two;
    }


    private static  <T> void  set(Pair<Employee> pair){

    }

    public static void main(String[] args) {

        //Pair<Employee> 和 Pair<Worker> 没有任何的继承关系；
        Pair<Employee> employeePair = new Pair<>();
        Pair<Worker> workerPair = new Pair<>();

        //可以定义
        Employee employee = new Worker();
     //    Pair<Employee> employeePair1 = new Pair<Worker>();



    }
}
