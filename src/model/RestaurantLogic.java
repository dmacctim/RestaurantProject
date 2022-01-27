package model;

import java.time.LocalTime;
import java.util.ArrayList;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class RestaurantLogic {
	
	/*
	 * Calculates the number of meals the restaurant can output per hour
	 * head chefs output 15 meals, sous chefs output 10, and line cooks output 5
	 * @param restaurant the restaurant to check
	 * @return the number of meals
	 */
	public int calculateMealOutput(Restaurant restaurant) {
		ArrayList<KitchenEmployee> staff = restaurant.getStaff();
		int mealOutput = 0;
		
		for (int i = 0; i < staff.size(); i++) {
			mealOutput += staff.get(i).getRank().getMealsPerHour();
		}
		
		return mealOutput;
	}
	
	/*
	 * Determines whether or not the restaurant is fully staffed
	 * must have at least one head chef, one sous chef, and two line cooks
	 * @param restaurant the restaurant to check
	 * @return true if fully staffed, false if not
	 */
	public boolean isFullyStaffed(Restaurant restaurant) {
		final int MIN_HEAD_CHEFS = 1;
		final int MIN_SOUS_CHEFS = 1;
		final int MIN_LINE_COOKS = 2;
		int headChefCount = 0;
		int sousChefCount = 0;
		int lineCookCount = 0;
		ArrayList<KitchenEmployee> staff = restaurant.getStaff();
		
		for (int i = 0; i < staff.size(); i++) {
			KitchenEmployee currentEmployee = staff.get(i);
			
			if (currentEmployee.getRank() == KitchenRank.HEAD_CHEF) {
				headChefCount++;
			} else if (currentEmployee.getRank() == KitchenRank.SOUS_CHEF) {
				sousChefCount++;
			} else {
				lineCookCount++;
			}
		}
		
		if (headChefCount >= MIN_HEAD_CHEFS && sousChefCount >= MIN_SOUS_CHEFS && lineCookCount >= MIN_LINE_COOKS) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Checks to see if a restaurant is open at a given time
	 * @param time the time to check
	 * @param restaurant, the restaurant to get hours from
	 * @return true if open, false if not
	 */
	public boolean isRestaurantOpen(LocalTime time, Restaurant restaurant) {
		if (time.isBefore(restaurant.getOpeningTime()) || time.isAfter(restaurant.getClosingTime())) {
			return false;
		} else {
			return true;
		}
	}
	
}
