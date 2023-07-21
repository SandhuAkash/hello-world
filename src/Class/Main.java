package Class;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for Julio's earth weight
	        System.out.print("Enter Julio's weight on Earth (in pounds): ");
	        double earthWeight = scanner.nextDouble();

	        // Display the planet options
	        System.out.println("\nSelect the planet to calculate weight:");
	        System.out.println("1. Venus");
	        System.out.println("2. Mars");
	        System.out.println("3. Jupiter");
	        System.out.println("4. Saturn");
	        System.out.println("5. Uranus");
	        System.out.println("6. Neptune");
	        System.out.print("Enter the planet number: ");
	        int planetChoice = scanner.nextInt();

	        double relativeGravity = 0.0;
	        String planetName = "";

	     // Calculate weight based on the selected planet
	        if (planetChoice == 1) {
	            relativeGravity = 0.78;
	            planetName = "Venus";
	        } else if (planetChoice == 2) {
	            relativeGravity = 0.39;
	            planetName = "Mars";
	        } else if (planetChoice == 3) {
	            relativeGravity = 2.65;
	            planetName = "Jupiter";
	        } else if (planetChoice == 4) {
	            relativeGravity = 1.17;
	            planetName = "Saturn";
	        } else if (planetChoice == 5) {
	            relativeGravity = 1.05;
	            planetName = "Uranus";
	        } else if (planetChoice == 6) {
	            relativeGravity = 1.23;
	            planetName = "Neptune";
	        } else {
	            System.out.println("Invalid planet choice.");
	            System.exit(0);
	        }
        
	     // Calculate weight on the destination planet
	        double destinationWeight = earthWeight * relativeGravity;

	        // Display the result
	        System.out.println("\nJulio's weight on " + planetName + ": " + destinationWeight + " pounds");

	        scanner.close();
	    
	        
	        
	        
 }
}