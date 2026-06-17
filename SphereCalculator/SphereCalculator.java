import java.util.Scanner;

/*
@author Abe Macedo
*/

public class SphereCalculator 
{

public static void main(String[] Args) 

    {
      /* Scanner for Radius */
      Scanner keyBrd = new Scanner(System.in);

      /* Initialized Radius Variable */
      final int sphereRadius;

      /* User input for Radius */
      System.out.print("Enter the sphere's radius: ");
      sphereRadius = keyBrd.nextInt();

      /* Conversion and Output for Radius */
      double sphereVolume =((4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3.0));
      System.out.printf("Volume: " + "%.4f\n", sphereVolume);

      /* Conversion and Output for Surface Area */
      double surfaceArea = ((4.0 * Math.PI) * Math.pow(sphereRadius, 2.0));
      System.out.printf("Surface Area: " + "%.4f\n", surfaceArea);

      /* Closes Scanner */
      keyBrd.close();

    }
    
}
