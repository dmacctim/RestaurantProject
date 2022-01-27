package tests;

import static org.junit.Assert.*;

import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.KitchenEmployee;
import model.KitchenRank;
import model.Restaurant;
import model.RestaurantLogic;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class TestRestaurantLogic {
	
	RestaurantLogic rLogic = new RestaurantLogic();
	KitchenEmployee james = new KitchenEmployee("James", 7, KitchenRank.HEAD_CHEF);
	KitchenEmployee elizabeth = new KitchenEmployee("Elizabeth", 3, KitchenRank.SOUS_CHEF);
	KitchenEmployee paul = new KitchenEmployee("Paul", 1, KitchenRank.LINE_COOK);
	KitchenEmployee melissa = new KitchenEmployee("Melissa", 1, KitchenRank.LINE_COOK);
	ArrayList<KitchenEmployee> staff = new ArrayList<>();
	Restaurant myRestaurant = new Restaurant("Buon Cibo", "Des Moines", LocalTime.of(11, 0), LocalTime.of(22, 0));

	@Before
	public void setUp() throws Exception {
		staff.add(james);
		staff.add(elizabeth);
		staff.add(paul);
		staff.add(melissa);
		myRestaurant.setStaff(staff);
	}

	@Test
	public void testCalculateMealOutput() {
		assertEquals(35, rLogic.calculateMealOutput(myRestaurant));
	}

	@Test
	public void testIsFullyStaffed() {
		assertTrue(rLogic.isFullyStaffed(myRestaurant));
	}
	
	@Test
	public void testIsNotFullyStaffed() {
		staff.remove(melissa);
		myRestaurant.setStaff(staff);
		assertFalse(rLogic.isFullyStaffed(myRestaurant));
	}
	
	@Test
	public void testIsRestaurantOpen() {
		assertTrue(rLogic.isRestaurantOpen(LocalTime.NOON, myRestaurant));
	}
	
	@Test
	public void testIsRestaurantNotOpen() {
		assertFalse(rLogic.isRestaurantOpen(LocalTime.MIDNIGHT, myRestaurant));
	}
	
}
