package day6Assignments;
import java.util.Scanner;

public class StudentWithHighestScore {

    public static void main(String[] args) {
        String studentName = null;
        int count;
        double score = 0;
        double highest = 0;
        String highestName = null;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of student : ");
        int numberOfStudents = input.nextInt();

        for (count=0; count<numberOfStudents; count++)
        {
            System.out.print("Student name : ");
            studentName = input.next().toUpperCase();
            System.out.print("Score        : ");
            score = input.nextInt();

            if (highest<score)
            {
                highest=score;
                highestName = studentName;
            }
        }
        System.out.print("Student scoring highest score is: " + highestName + " and the score is : " + highest );
    }
}

