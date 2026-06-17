import java.util.Random;
import java.util.Scanner;

public class AccountGenerator 
{
    public static void main(String[] Args) 
    
    {

        Scanner kyBrd = new Scanner(System.in);
        Random randGen = new Random();

       System.out.print("Enter your first name: ");
       String firstName = kyBrd.nextLine();
       firstName = firstName.toLowerCase();
       
       System.out.print("Enter your last name: ");
       String lastName = kyBrd.nextLine();
       lastName = lastName.toLowerCase();

       char first1CharFirstName = firstName.charAt(0);
       String first5CharLastName = lastName.subString(0,5);


       System.out.println("Username: "); 



    }
    
}
