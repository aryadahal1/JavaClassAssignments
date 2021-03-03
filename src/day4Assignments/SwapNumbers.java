package day4Assignments;

public class SwapNumbers {

    public static void main(String[] args) {
        //using temp
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + " , " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + " , " + +b);

        /*
        //wo using temp

        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
        */


    }
}
