package pom_Gmail_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pom_Config.Configuration;
import pom_Core.TestCore;

public class Gmail_11_Page extends TestCore {

	WebDriver driver;

	public Gmail_11_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);//current instance method and veriable ca
	}

	// 1.using Page Object Factory
	@FindBy(xpath = Configuration.signin)
	public WebElement signin;

	@FindBy(xpath = Configuration.username) // xpath of username
	public WebElement username;

	@FindBy(xpath = Configuration.next1)
	public WebElement nextbtn1;

	@FindBy(xpath = Configuration.password)
	public WebElement Password;

	@FindBy(xpath = Configuration.next2)
	public WebElement nextbtn2;
	
	@FindBy(xpath = Configuration.Gmail1)
	public WebElement gmail;

	@FindBy(xpath = Configuration.Starred)
	public WebElement Starred;

	@FindBy(xpath = Configuration.TotalNoEmailStarred)
	public WebElement totalemail;
	
	public void signin() throws InterruptedException{
		Thread.sleep(5000);
		signin.click();
		
		}
	
	public void  signin1() throws InterruptedException 
	{
		gmail.click();
	}
	
	public void clickStarred() throws InterruptedException
	{ 
		 boolean stared=Starred.isEnabled();
		 Assert.assertTrue(stared);
		 System.out.println("Verify Stared Button is Enabled");
		 Thread.sleep(3000);
		 Starred.click();
		 Thread.sleep(4000);
		 //String str=totalemail.getText();
		 //totalemail.getSize();
		 //WebElement total = driver.findElement(By.xpath("//a[contains(text(),'Starred')]"));
		 //System.out.println("Total star mail: "+total.getSize());
		// System.out.println( str);
		 //System.out.println("Total Starred Emails are : " + str );
		 
		 Thread.sleep(1000);
			driver.navigate().back();
     }

	public WebElement username() {
		return username;
	}
	
	public WebElement nextbtn1() {
		return nextbtn1;
	}

	public WebElement password() {
		return Password;
	}

	public WebElement nextbtn2() {
		return nextbtn2;
	}
}

/*Thread.sleep(2000);
signin.click();
username.sendKeys("");
nextbtn1.click();
Thread.sleep(5000);
Password.sendKeys("");
nextbtn2.click();*/

/*GoogleApps.click();
Thread.sleep(2000);
driver.switchTo().frame(0);
*/