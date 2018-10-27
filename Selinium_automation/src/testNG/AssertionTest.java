package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	 
    /*
     * For hard and soft assertion you need to create the object
     * of Assertion and SoftAssertion class
     */
    private Assertion hardAssert = new Assertion();
    private SoftAssert softAssert = new SoftAssert();
/*
    // Test for Hard Assertion Only
    @Test
    public void testForHardAssert() {
        hardAssert.assertTrue(false);
        System.out.println("I am using Hard Assertion");
    }
 
    // Test for soft assertion without assertAll method
    @Test
    public void testForSoftAssertWithNoFailure() {
        softAssert.assertTrue(false);
        System.out.println("I am using soft assert without assertAll()");
    }*/
 
    // Test for soft assertion with assertAll method
    @Test
    public void testForSoftAssertionFailure() {
        softAssert.assertTrue(false);
        softAssert.assertEquals(1, 2);
        System.out.println("I am using soft Assert with assertAll()");
        softAssert.assertAll();
    }
 
    // Test for assert class
    @Test 
    public void testForAssert(){
        Assert.assertTrue(true);
        System.out.println("After Successful Assert");
 
        // Verify after assertion fail
        Assert.assertEquals(1, 2);
        System.out.println("After assert Fail");
    }
}

