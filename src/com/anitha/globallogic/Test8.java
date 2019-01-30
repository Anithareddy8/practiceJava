package com.anitha.globallogic;

import java.util.HashSet;
import java.util.Set;

public class Test8 {
static void add(Set set) {
        set.add("Hi");
        set.add(1);
        System.out.println(set.size());
    }

public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
add(set);
    }
}
