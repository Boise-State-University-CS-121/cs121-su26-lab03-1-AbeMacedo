import java.util.Random;
import java.util.Scanner;

public class AccountGenerator 
{
    public static void main(String[] Args) 
    
    {

        Scanner kyBrd = new Scanner(System.in);
        Random randGen = new Random();

       System.out.println("Enter your first name: ");
       String firstName = kyBrd.nextLine();
       firstName = firstName.toLowerCase();
       
       System.out.println("Enter your last name: ");
       String lastName = kyBrd.nextLine();
       lastName = lastName.toLowerCase();


       System.out.println("Username: "); 



    }
    
}
