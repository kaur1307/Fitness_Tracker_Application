package starter.code;

import java.util.Scanner;

/**
 * FitnessTrackerTest.java
 * This class tests the FitnessTracker class by prompting the user for input and displaying fitness data.
 * @author Prabhsimran Kaur
 * Student Number: 041119310
 * @version 1.0
 * @since JDK 17.0
 */
public class FitnessTrackerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter gender (male/female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter daily steps: ");
        int stepsTaken = scanner.nextInt();

        System.out.print("Enter daily calories burned: ");
        int caloriesBurned = scanner.nextInt();

        System.out.print("Enter daily active minutes: ");
        int activeMinutes = scanner.nextInt();

        System.out.print("Enter daily maintenance calories: ");
        double maintenanceCalories = scanner.nextDouble();
        
        System.out.print("\n--- User Fitness Data ---\n");

        // Create FitnessTracker object
        FitnessTracker tracker = new FitnessTracker(firstName, lastName, gender, stepsTaken, caloriesBurned, activeMinutes);

        // Display fitness data
        tracker.displayFitnessData();
        System.out.printf("Daily Calorie Deficit/Surplus: %.2f\n", tracker.calculateCalorieDeficit(maintenanceCalories));

        scanner.close();
    }
}