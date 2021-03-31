package day7Assignments;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        int [][] arr1 = {{1,2,3} , {4,5,6} , {7,8,9}};
        int [][] arr2 = {{4,5,6} , {2,7,8} , {3,1,9}};


        final int ROWS = 3;
        final int COLUMNS = 3;

        int [][] sum = new int [ROWS] [COLUMNS];
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j< COLUMNS; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j< COLUMNS; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
