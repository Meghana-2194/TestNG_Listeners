package TestNGListenerConcepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


  @Listeners(CustomListener.class) // ClassName.class
  
  
public class ScreenshotTestClass extends SeleniumBase {

	
	@BeforeMethod
	public void setUp() {
		initialization(); // call from ParentClass(SeleniumBase)
	}

	@AfterMethod
	public void tearDown() {
		driver.quit(); // call from ParentClass(SeleniumBase)
	}

	@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTest3() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTest4() {
		Assert.assertEquals(false, true);
	}

}
