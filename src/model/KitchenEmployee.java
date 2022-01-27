package model;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class KitchenEmployee {
	private String name;
	private int yearsOfExperience;
	private KitchenRank rank;
	
	public KitchenEmployee() {
		super();
	}

	public KitchenEmployee(String name, int yearsOfExperience, KitchenRank rank) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public KitchenRank getRank() {
		return rank;
	}

	public void setRank(KitchenRank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "KitchenEmployee [name=" + name + ", yearsOfExperience=" + yearsOfExperience + ", rank=" + rank + "]";
	}
}
