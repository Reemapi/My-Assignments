package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAutomation {

	
		// * Locators :
		// * id,name,classname,linktext,partiallinktext,tagname,xpath,css
		// * Basic Locators:
		// * id,name,classname,linktext,partiallinktext
		// * findElement() -> locate the The first matching element on the current page
		// * sendKeys() -> to simulate typing into an element
		// * click() -> to perform click action
		// * getTitle() -> Get the title of the current page. 
		// */
		public static void main(String[] args) {
			//Launch the Chrome browser
			ChromeDriver driver = new ChromeDriver();
			// Load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			//to maximize the window
			driver.manage().window().maximize();
			//locate the username field and type the username
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Click Login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//to verify the title 
			System.out.println(driver.getTitle());
			//click on crmsfa link
			driver.findElement(By.partialLinkText("CRM")).click();
			//click on leads link
			driver.findElement(By.linkText("Leads")).click();
			//click on createlead link
			driver.findElement(By.linkText("Create Lead")).click();
			//enter companyname
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			//enter firstname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reema");
			
			//enter lastname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Iype");
			//click submitbutton
			driver.findElement(By.name("submitButton")).click();
			//print the title
			System.out.println(driver.getTitle());
			//* To select Dropdown element
			// * Step 1: Check whether the dropdown element is inside select tag or not
			// *         If it is inside select tag -> locate the dropdown first
			// * Step 2: Instantiate the Select class  and pass the dd element into the Select class Constructor      
			// * Step 3: Using the object of the select class call the required methods
		//	 *         selectByIndex()
			// *         selectByVisibleText()
			// *         selectByValue()
			//locate the source dropdown and select directmail option by using index 
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select sec = new Select(sourceDD);
			sec.selectByIndex(3);
			
			//select marketcampaign by using text
			WebElement mCDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select sec1 = new Select(mCDD);
			sec1.selectByVisibleText("eCommerce Site Internal Campaign");
			
			//select by value for industry dd
			WebElement inDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select sec2 = new Select(inDD);
			sec2.selectByValue("IND_MEDIA");
			
			//click submitbutton
			driver.findElement(By.name("submitButton")).click();
			//print the title
			System.out.println(driver.getTitle());
			
			//close the browser
			driver.close();
	}

}
