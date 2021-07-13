package UserRegistration;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {

UserRegistration userRegistration = new UserRegistration();

    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
	 boolean result = userRegistration.validateFirstName("Mayaa");
	 Assert.assertTrue(result);
	}
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
	 boolean result = userRegistration.validateFirstName("Ma");
	Assert.assertFalse(result);
    }

     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
 		boolean result = userRegistration.validateFirstName("Maya7");
 		Assert.assertFalse(result);
 	}

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
	boolean result = userRegistration.validateFirstName("M@ya");
	Assert.assertFalse(result);
}
    @Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
	    boolean result = userRegistration.validateLastName("Chandre");
	    Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() {
		boolean result = userRegistration.validateLastName("Ch");
		Assert.assertFalse(result);
	}
	
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
	      boolean result = userRegistration.validateFirstName("Chandre7");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
	      boolean result = userRegistration.validateFirstName("Ch@ndre");
	      Assert.assertFalse(result);
	  }

}