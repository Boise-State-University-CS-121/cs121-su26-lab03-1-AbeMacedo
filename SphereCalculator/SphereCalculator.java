import java.util.Scanner;

public class SphereCalculator 
{

public static void main(String[] Args) 

    {
      /* Scanner for Radius */
      Scanner keyBrd = new Scanner(System.in);

      /* Initialized Radius Variable */
      int sphereRadius;

      /* User input for Radius */
      System.out.print("Enter the sphere's radius: ");
      sphereRadius = keyBrd.nextInt();

      /* Conversion and Output for Radius */
      double sphereVolume =((4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3.0));
      System.out.printf("Volume: " + "%.4f\n", sphereVolume);

      double surfaceArea = (4 * Math.PI * Math.pow(sphereRadius, 2.0));
      System.out.printf("Surface Area: " + "\n");

    }
    
}
