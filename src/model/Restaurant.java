package model;

import java.time.LocalTime;
import java.util.ArrayList;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class Restaurant {
	private String name;
	private String location;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private ArrayList<KitchenEmployee> staff = new ArrayList<>();

	public Restaurant() {
		super();
	}

	public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
		super();
		this.name = name;
		this.location = location;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime,
			ArrayList<KitchenEmployee> staff) {
		super();
		this.name = name;
		this.location = location;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.staff = staff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public ArrayList<KitchenEmployee> getStaff() {
		return staff;
	}

	public void setStaff(ArrayList<KitchenEmployee> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", openingTime=" + openingTime + ", closingTime="
				+ closingTime + ", staff=" + staff + "]";
	}
}
