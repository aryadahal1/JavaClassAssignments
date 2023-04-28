package day10Assignments;

public class ExceptionHandling {

    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Operation not possible. Cant divide by zero");
        }
    }
}

