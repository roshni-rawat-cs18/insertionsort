package insertion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("How many elements would you like in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        //generating random number in the array
        for(int i =0;i<array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(array));
        InsertionSortClass.insertionSortMethod(array);
        System.out.println("array sorted after  insertion sort recursively");
        System.out.println(Arrays.toString(array));

    }
}
