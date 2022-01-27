package model;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public enum KitchenRank {
	LINE_COOK(5),
	SOUS_CHEF(10),
	HEAD_CHEF(15);
	
	private int mealsPerHour;
	
	KitchenRank(int mealsPerHour) {
		this.mealsPerHour = mealsPerHour;
	}
	
	public int getMealsPerHour() {
		return mealsPerHour;
	}
}
