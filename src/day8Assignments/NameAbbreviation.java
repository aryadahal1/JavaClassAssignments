package day8Assignments;
import java.io.*;

public class NameAbbreviation {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first name: ");
        char firstname=br.readLine().charAt(0);

        System.out.print("Enter middle Name: ");
        char midname=br.readLine().charAt(0);

        System.out.print("Enter last name: ");
        String lastname=br.readLine();

        System.out.println("Abbreviated Name: "+firstname+"."+midname+"."+lastname);
    }
}
