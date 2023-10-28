import java.util.Scanner;

public class DistanceMeter {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //emall to moalboal
      final double dist1Barili = 84.4;
      final double dist2Sibunga = 90.0;
      final double dist3Dumanjung = 100.2;

      System.out.println("Cebu City (South Bus)\n");

      System.out.println("Is Barili Blocked?");
      String barBlocked = sc.nextLine();

      double distance = 0;

      if (barBlocked.equalsIgnoreCase("YES") || barBlocked.equalsIgnoreCase("yes")) {
         distance = dist1Barili;
         System.out.println("Recommended Route: ");
         System.out.println("Minglanilla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("Carcar (Route 3)");
         System.out.println("Barili (Route 4.1)");
         System.out.println("Dumanjung (Route 4.1.1)");
         System.out.println("Alcantara (Route 4.1.2)");
         System.out.println("Moalboal...");
      } else if (barBlocked.equalsIgnoreCase("NO") || barBlocked.equalsIgnoreCase("no")) {
         distance = dist2Sibunga;
         System.out.println("Recommended Route: ");
         System.out.println("Minglanilla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("Carcar (Route 3)");
         System.out.println("Sibonga (Route 4.2)");
         System.out.println("Dumanjug (Route 4.2.1)");
         System.out.println("Alcantara (Route 4.2.2)");
         System.out.println("Moalboal...");
      } else {
         distance = dist3Dumanjung;
         System.out.println("Recommended Route: ");
         System.out.println("Minglanilla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("Carcar (Route 3)");
         System.out.println("Sibonga (Route 4.2)");
         System.out.println("Argao (Route 5)");
         System.out.println("Ronda (Route 5.1)");
         System.out.println("Alcantara (Route 5.2)");
         System.out.println("Moalboal...");
      }

      // Input: Speed
      System.out.println("Speed (kilometers per hour): ");
      double speed = sc.nextDouble();

      // Calculate time = distance / speed
      double time = distance / speed;

      // Output:
      System.out.println("Travel Information");
      System.out.println("Speed: " + speed + " kilometers per hour");
      System.out.println("Distance: " + distance + " kilometers");
      System.out.println("Estimated Time Arrival: " + time + " hours");
   
   }
}
