package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Assignment 1:Create Lead
public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    //To Maximize
	    driver.manage().window().maximize();
	    //ImplicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //1. Launch URL "http://leaftaps.com/opentaps/control/login"
	    driver.get("http://leaftaps.com/opentaps");
		//2. Enter UserName and Password Using Id Locator
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
	    driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
	    driver.findElement(By.partialLinkText("SFA")).click();
		//5. Click on Leads Button
	    driver.findElement(By.linkText("Leads")).click();
		//6. Click on Create Lead 
	    driver.findElement(By.linkText("Create Lead")).click();
		//7. Enter CompanyName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Independent");
		//8. Enter FirstName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathibharani");
		//9. Enter LastName Field Using id Locator
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kottapalli");
		//10. Enter FirstName(Local) Field Using id Locator
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prathibharani");
		//11. Enter Department Field Using any Locator of Your Choice
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestingTeam");
		//12. Enter Description Field Using any Locator of your choice 
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("love to learn");
		//13. Enter your email in the E-mail address Field using the locator of your choice
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sravkottapalli@gmail.com");
		//14. Select State/Province as NewYork Using Visible Text
	    WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(source);	
	    dd.selectByVisibleText("New York");
	    //15. Click on Create Button
	    driver.findElement(By.className("smallSubmit")).click();
        //16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
	   System.out.println(driver.getTitle());

	}

	

}
