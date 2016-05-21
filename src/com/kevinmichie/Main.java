package com.kevinmichie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] valueHolder = new int[arrayLength];
        for(int i = 0; i < valueHolder.length; i++){
            valueHolder[i] = scanner.nextInt();
        }

        int countHolder = 0;
        // Checks for any negative value
        for(int i = 0; i < valueHolder.length; i++){
            int sumChecker = 0; // Resets each value to zero to recheck
            sumChecker += valueHolder[i];
            if(sumChecker < 0){
                countHolder++;
            }

            // Takes the sum of array as it goes the array.
            // sumChecker = 0 resets the value
            for(int j = i+1; j < valueHolder.length; j++){
                sumChecker += valueHolder[j];
                if(sumChecker < 0){
                    countHolder++;
                }
            }
        }
        System.out.println(countHolder);
    }
}
