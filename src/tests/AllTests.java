package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 26, 2022  
*/
@RunWith(Suite.class)
@SuiteClasses({ TestRestaurantLogic.class, TestKitchenEmpLogic.class })
public class AllTests {

}
