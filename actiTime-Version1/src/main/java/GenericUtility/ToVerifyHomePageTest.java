package GenericUtility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void toverifyHomePageTest() {
		
		String  expectedTitle = eUtils.fetchDataFromExcelSheets("sheet2",1,0);
		
		wUtils.waitForTitle(driver,"Enter");
		 String actualTitle=driver.getTitle();
		 
		 System.out.println(actualTitle);
		 System.out.println(expectedTitle);
		 
		 Assert.assertEquals(actualTitle, expectedTitle);
		 System.out.println("pass: the title is verfied");
	}
	
}
