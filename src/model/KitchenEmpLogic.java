package model;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class KitchenEmpLogic {
	
	/*
	 * Determines employee's eligibility for executive chef license
	 * must have at least 5 YOE and a rank of sous chef or head chef
	 * @param employee the employee to check
	 * @return true if eligible, false if not
	 */
	public boolean isEligibleForExecutiveChefLicense(KitchenEmployee employee) {
		final int MIN_EXPERIENCE = 5;
		final int MIN_RANK = KitchenRank.LINE_COOK.ordinal();
		
		if (employee.getRank().ordinal() > MIN_RANK && employee.getYearsOfExperience() >= MIN_EXPERIENCE) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Determines whether or not the employee is in over their head
	 * must be a head chef with less than 3 YOE
	 * @param employee the employee to check
	 * @return true if in over head, false if not
	 */
	public boolean isInOverTheirHead(KitchenEmployee employee) {
		final int MIN_EXPERIENCE = 3;
		
		if (employee.getRank() == KitchenRank.HEAD_CHEF && employee.getYearsOfExperience() < MIN_EXPERIENCE) {
			return true;
		} else {
			return false;
		}
	}
	
}
