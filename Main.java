package com.homework.daniel.shop;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        largestPossible4Digit(createArray());
    }
    public static int[] createArray(){
        System.out.print("please enter array length : ");
        int arrayLength = SCANNER.nextInt();
        int[] array = new int[arrayLength ];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter a number to the array : ");
            array[i] = SCANNER.nextInt();
        }
        return array;
    }
    public static void largestPossible4Digit(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = array.length - 1 ; i >= 0; i--) {
            System.out.print(array[i]);
        }

    }
}
