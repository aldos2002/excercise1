package com.mentoring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1Subtask1 {

    public static void main(String[] args) {
        List<long[]> list = new ArrayList<long[]>();
        int i = 1;
        while (true) {
            System.out.println("Loop #"+i);
            list.add(new long[100000]);
            i++;
        }
    }
}
