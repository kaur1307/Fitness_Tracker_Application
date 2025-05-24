package starter.code;

/**
 * FitnessTracker.java Starter code for FitnessTracker assignment. TODO:
 * Complete the documentation (Javadoc)
 * 
 * @author Prabhsimran Kaur 
 * Student Number: 041119310
 * @version 1.0
 * @since JDK 17.0
 */

public class FitnessTracker {

	private String firstName;
	private String lastName;
	private String gender;
	private int stepsTaken;
	private int caloriesBurned;
	private int activeMinutes;

	/**
	 * Constructor to initialize the FitnessTracker object.
	 *
	 * @param firstName      The first name of the patient.
	 * @param lastName       The last name of the patient.
	 * @param gender         The gender of the patient.
	 * @param stepsTaken     The number of steps taken by the patient daily.
	 * @param caloriesBurned The number of calories burned by the patient daily.
	 * @param activeMinutes  The number of active minutes by the patient daily.
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int stepsTaken, int caloriesBurned,
			int activeMinutes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.stepsTaken = stepsTaken;
		this.caloriesBurned = caloriesBurned;
		this.activeMinutes = activeMinutes;
	}

	// Getter and Setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStepsTaken() {
		return stepsTaken;
	}

	public void setStepsTaken(int stepsTaken) {
		this.stepsTaken = stepsTaken;
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public int getActiveMinutes() {
		return activeMinutes;
	}

	public void setActiveMinutes(int activeMinutes) {
		this.activeMinutes = activeMinutes;
	}

	/**
	 * Calculates the distance walked in meters based on steps taken.
	 *
	 * @return The distance walked in meters.
	 */
	public double distanceMeasure() {
		if (gender.equals("male")) {
			return getStepsTaken() * 0.8;
		} else {
			return getStepsTaken() * 0.7;
		}
	}

	/**
	 * Calculates the weekly average active minutes.
	 *
	 * @return The weekly average active minutes.
	 */
	public double calculateWeeklyActiveMinutes() {
		return activeMinutes * 7;
	}

	/**
	 * Determines the fitness level based on weekly activity and calories burned.
	 *
	 * @return The fitness level as a String.
	 */
	public String findFitnessLevel() {
		double weeklyMinutes = calculateWeeklyActiveMinutes();
		if (weeklyMinutes > 150 && caloriesBurned * 7 > 2000) {
			return "Active";
		} else if (weeklyMinutes >= 75 || caloriesBurned * 7 >= 1000) {
			return "Moderately Active";
		} else {
			return "Sedentary";
		}
	}

	public double calculateCalorieDeficit(double maintenanceCalories) {
		return maintenanceCalories - caloriesBurned;
	}

	/**
	 * Displays all fitness data for the patient.
	 */

	public void displayFitnessData() {

		// START CODE
		System.out.printf("Name: %s %s\n", firstName, lastName);
		System.out.printf("Gender: %s\n", gender);
		System.out.printf("Daily Steps: %d\n", stepsTaken);
		System.out.printf("Distance Walked: %.2f meters\n", distanceMeasure());
		System.out.printf("Weekly Active Minutes: %.2f\n", calculateWeeklyActiveMinutes());
		System.out.printf("Fitness Level: %s\n", findFitnessLevel());

		// END CODE

		/* You do not need to modify this piece of code; it is fine as it is. */
		System.out.println("Fitness Level Criteria:");
		System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
		System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
		System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
	}

}