package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Input size of array: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size of out of range, must be < 20");
            }
        }while (size>20);

        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Element in "+i+" : ");
            array[i] = scanner.nextInt();
            System.out.println();
        }

        int min = array[0];
        int index = 0;
        for(int j = 1; j < array.length; j++){
            if(array[j]<min){
                min = array[j];
                index = j;
            }
        }

        System.out.println("Min Value Of Array: "+min+" at index "+index);
    }
}
