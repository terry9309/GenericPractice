package com.terry.genericpractice;

public class NormalGeneric<T> {
    private T data;

    public NormalGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
