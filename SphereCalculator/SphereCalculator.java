import java.util.Scanner;

public class SphereCalculator 
{

public static void main(String[] Args) 

    {

      Scanner keyBrd = new Scanner(System.in);

      System.out.println("Enter the sphere's radius: ");
      double sphereRadius = keyBrd.nextDouble(); 
      System.out.printf("Volume: " + "\n");
      double sphereVolume = keyBrd.nextDouble();
      System.out.printf("Surface Area: " + "\n");
      double sphereSArea = keyBrd.nextDouble();

    }
    
}
