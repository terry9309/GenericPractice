package com.terry.genericpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.terry.genericpractice.genmethod.GenericMethod;
import com.terry.genericpractice.genmethod.GenericMethod3;
import com.terry.genericpractice.needgeneric.NonGeneric;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NonGeneric nonGeneric = new NonGeneric();
        System.out.println("计算1+2="+nonGeneric.addInt(1,2));



        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.GenericMethod("12","56","333"));




    }

    private void nonGeneric2() {
        List list = new ArrayList();
        list.add("nice");
        list.add("ok");
        list.add(100);
        for (int i = 0; i < list.size(); i++) {
            String name  = (String) list.get(i);
            System.out.println("name:"+name);
        }
    }
}
