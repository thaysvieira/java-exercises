package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Two-Dimensional Arrays
// Learn how to create and work with 2D arrays (matrices) in Java.

import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {

        // TODO: 1 - Create a 3x3 int 2D array called 'matrix'
        int[][] matrix = new int[3][3];

        // TODO: 2 - Fill the matrix with multiplication table values
        //           matrix[i][j] should equal (i + 1) * (j + 1)
        //           Expected result:
        //           1 2 3
        //           2 4 6
        //           3 6 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }


        // TODO: 3 - Print the matrix in row/column format
        //           Each row on a new line, values separated by spaces or tabs

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    System.out.print(matrix[i][j] + " ");
                    continue;
                } else if (i == 1) {
                    System.out.print(matrix[i][j] + " ");
                    continue;
                }
                System.out.print(matrix[i][j] + " ");
            }
        }


        // TODO: 4 - Find and print the sum of all elements in the matrix
        //           Use nested loops to accumulate the total
        System.out.println();
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total+=matrix[i][j];
            }
        }
        System.out.println(total);


        // TODO: 5 - Find and print the sum of row index 1 (the second row: 2, 4, 6)
        //           Iterate through all columns of that specific row
        int totalIndexOne = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==1) {
                    totalIndexOne += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of index 1: "+totalIndexOne);

        // TODO: 6 - Find and print the sum of the diagonal elements (top-left to bottom-right)
        //           Diagonal elements are where row index == column index
        //           Expected: matrix[0][0] + matrix[1][1] + matrix[2][2] = 1 + 4 + 9 = 14
        int sumDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0 && j==0){
                    sumDiagonal+=matrix[i][j];
                } else if (i==1 && j==1){
                    sumDiagonal+=matrix[i][j];
                }else if (i==2 && j==2){
                    sumDiagonal+=matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal sum: "+sumDiagonal);

    }
}

