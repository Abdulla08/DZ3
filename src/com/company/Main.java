package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {2, 4, 5, 3, -3, -4, -9, 8, -12, -22, 11, -32, -99, 1, 0};
        int result = 0;
        int i = 0;
        boolean nagative = false;
        for (int currentElem : array) {
            if (currentElem > 0 && nagative) {
                result += currentElem;
                i++;
                System.out.println(currentElem);
            } else {
                nagative = true;
                continue;
            }
            System.out.println(result / i);

        }
        sort(array);

    }

    private static void sort(int[] currentElem) {
        int size = currentElem.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (currentElem[j] > currentElem[j + 1]) {
                    int a = currentElem[j];
                    currentElem[j] = currentElem[j + 1];
                    currentElem[j + 1] = a;
                }
            }
            System.out.println(Arrays.toString(currentElem));
        }
    }
}