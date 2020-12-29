package com.example.array;

import java.util.Arrays;

public class ArrayProblem {
    static void moveZerosToLeft(int[] array) {
        if (array.length < 1) {
            return;
        }

        var readIndex = array.length - 1;
        var writeIndex = array.length - 1;

        while(readIndex >= 0) {
            if(array[readIndex] != 0) {
                array[writeIndex] = array[readIndex];
                writeIndex--;
            }
            readIndex--;
        }

        while(writeIndex >= 0) {
            array[writeIndex] = 0;
            writeIndex--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0, 899};
        System.out.println("Array: " + Arrays.toString(arr));

        moveZerosToLeft(arr);

        System.out.println("Result: " + Arrays.toString(arr));
    }
}
