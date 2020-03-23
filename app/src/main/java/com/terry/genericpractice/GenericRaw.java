package com.terry.genericpractice;

import java.io.Serializable;

public class GenericRaw<T extends Comparable & Serializable> {

   public  T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

    }
}
