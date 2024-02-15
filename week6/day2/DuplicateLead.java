package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week5day1.BaseClass;

public class DuplicateLead extends BaseClass{
	
	  @Test
	  public void runDuplicateLead() {
			
		
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
	    //16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
	    System.out.println(driver.getTitle());
	    //17. Click on Duplicate button
	    driver.findElement(By.className("subMenuButton")).click();
	    //18. Clear the CompanyName Field using .clear() And Enter new CompanyName
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    //19.Clear the FirstName Field using .clear() And Enter new FirstName
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathibha");
	    //20.Click on Create Lead Button
	    driver.findElement(By.className("smallSubmit")).click();
	    //21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
	    System.out.println(driver.getTitle());

		
	  }
	}