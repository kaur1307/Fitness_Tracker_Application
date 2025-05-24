package starter.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * FitnessTrackerTest2.java
 * This class tests the FitnessTracker class using JUnit.
 * @author Prabhsimran Kaur
 * Student Number: 041119310
 * @version 1.0
 * @since JDK 17.0
 */
class FitnessTrackerTest2 {

	@Test
	public void testDistanceMeasureMale() {
        FitnessTracker tracker = new FitnessTracker("Jimmy", "Milton", "male", 10000, 600, 160);
        assertEquals(8000.0, tracker.distanceMeasure(), 0.01); // 10000 steps * 0.8 meters
    
	}
	
	@Test
    public void testDistanceMeasureFemale() {
        FitnessTracker tracker = new FitnessTracker("Prabhsimran", "Kaur", "female", 8000, 500, 150);
        assertEquals(5600.0, tracker.distanceMeasure(), 0.01); // 8000 steps * 0.7 meters
    }
	 @Test
	    public void testCalculateWeeklyActiveMinutes() {
	        FitnessTracker tracker = new FitnessTracker("Aman", "Singh", "male", 5000, 600, 60);
	        assertEquals(420, tracker.calculateWeeklyActiveMinutes()); // 60 minutes * 7 days
	    }
	 @Test
	    public void testCalculateCalorieDeficit() {
	        FitnessTracker tracker = new FitnessTracker("Arul", "Gupta", "male", 7000, 500, 90);
	        assertEquals(500.0, tracker.calculateCalorieDeficit(1000.0)); // 1000 - 500 = 500
	    }
	 @Test
	    public void testfindFitnessLevelModeratelyActive() {
	        // Test for a "Moderately Active" fitness level
	        FitnessTracker tracker = new FitnessTracker("Prabh", "Kaur", "female", 3000, 1200, 100);
	        String expectedFitnessLevel = "Moderately Active";
	        assertEquals(expectedFitnessLevel, tracker.findFitnessLevel());
	    }
	 

}
