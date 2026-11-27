package com.aryan;

import java.util.Arrays;

import com.aryan.basic.Basics;

public class Main {
    static void main() {
        Basics b = new Basics();

        int[] arr = {1,0,2,0,3,4};
        System.out.println(Arrays.toString(b.moveZeroes(arr)));
    }
}
