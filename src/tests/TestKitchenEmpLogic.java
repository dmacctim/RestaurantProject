package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.KitchenEmpLogic;
import model.KitchenEmployee;
import model.KitchenRank;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
public class TestKitchenEmpLogic {
	
	KitchenEmpLogic empLogic = new KitchenEmpLogic();
	KitchenEmployee frank = new KitchenEmployee();

	@Before
	public void setUp() throws Exception {
		frank.setName("Frank");
		frank.setYearsOfExperience(1);
		frank.setRank(KitchenRank.LINE_COOK);
	}
	
	@Test
	public void testIsNotEligibleForExecutiveChefLicense() {
		assertFalse(empLogic.isEligibleForExecutiveChefLicense(frank));
	}
	
	@Test
	public void testIsEligibleForExecutiveChefLicense() {
		frank.setRank(KitchenRank.SOUS_CHEF);
		frank.setYearsOfExperience(5);
		assertTrue(empLogic.isEligibleForExecutiveChefLicense(frank));
	}
	
	@Test
	public void testIsNotInOverTheirHead() {
		assertFalse(empLogic.isInOverTheirHead(frank));
	}
	
	@Test
	public void testIsInOverTheirHead() {
		frank.setRank(KitchenRank.HEAD_CHEF);
		assertTrue(empLogic.isInOverTheirHead(frank));
	}
	
}
