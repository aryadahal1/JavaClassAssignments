package day7Assignments;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        int j=0;

        //initialise first array
        int[] arr = new int[40];

        //initialise second array for store reverse array
        int[] rev = new int[40];

        //declare scanner class
        Scanner sc = new Scanner(System.in);

        //take input of size from the user
        System.out.println("Enter size of an Array");
        int size = sc.nextInt();

        //take element of array1 from user
        System.out.println("Enter elements of Array");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        //here we are storing last element of array in the reverse array
        for(int i = size-1; i>=0; i--)
        {
            rev[j] = arr[i];
            j++;
        }
        System.out.println("The Reverse Array: ");

        //print reverse array
        for(int i = 0; i < size; i++)
            System.out.print(rev [i] + " ");
    }

}

