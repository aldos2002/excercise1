package com.mentoring;

import javassist.ClassPool;

/**
 * Created by Almas_Doskozhin on 1/19/2016.
 */
public class Task1Subtask2 {


    public static void main(String[] args) throws Exception {
         for (int i = 0; i < 100000; i++) {
            String className = "com.epam.GenClass" + i;
            generate(className);
            System.out.println("Class:"+className+" generated");

        }
    }

    public static Class generate(String name) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        return pool.makeClass(name).toClass();
    }

}
