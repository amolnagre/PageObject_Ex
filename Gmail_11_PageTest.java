package pom_Gmail_Testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom_Core.TestCore;
import pom_Gmail_Pages.Gmail_11_Page;
import pom_Util.testUtil;

// POM is a design pattern or approach not a framework 
public class Gmail_11_PageTest extends TestCore {
	
	  public SoftAssert softAssert;

	@BeforeTest// to reading excel data runmode for isexecutable or not
	public void isSkip() {
		if (!pom_Util.testUtil.isExecutable("Gmail_11_PageTest")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	@Test(priority=1,dataProvider = "getData")
	public void doLogin(String email, String password) throws IOException, InterruptedException {
		try {
			softAssert = new SoftAssert();//run all test cases or skip fail testcase and pass next if ok 
			app_logs.debug("Executing login Test");
			Gmail_11_Page g = new Gmail_11_Page(driver);
			g.signin();
			Thread.sleep(3000L);
			g.username().sendKeys(email);
			g.nextbtn1().click();
			Thread.sleep(5000);
			g.password().sendKeys(password);
			g.nextbtn2().click();
			Thread.sleep(3000);
			g.signin1();
			System.out.println("Gmail Login sucessully...!");
			app_logs.debug("Gmail Login sucessully...!");

			g.clickStarred();
			softAssert.assertAll();
			System.out.println("Verify Stared Mail...!");
			app_logs.debug("Complete 1st task.....!");
			//softAssert.assertAll();
			Thread.sleep(3000);
			//driver.navigate().back();
           
		} catch (Throwable t) {
			testUtil.captureScreenshot("Gmail_11_PageTest");
			Assert.assertTrue(false, t.getMessage());
		}
	}
	// Reading data from the Excel File
	@DataProvider
	public Object[][] getData() {
		return testUtil.getData("Gmail_11_PageTest");
	}
}