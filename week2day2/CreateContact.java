package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    //To Maximize
	    driver.manage().window().maximize();
	    //ImplicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
                //1. Launch URL "http://leaftaps.com/opentaps/control/login"
	    driver.get("http://leaftaps.com/opentaps/control/login");
				 //2. Enter UserName and Password Using Id Locator
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");		 
			    //3. Click on Login Button using Class Locator
	    driver.findElement(By.className("decorativeSubmit")).click();	 
				// 4. Click on CRM/SFA Link
	    driver.findElement(By.partialLinkText("SFA")).click();		
				// 5. Click on contacts Button
	    driver.findElement(By.linkText("Contacts")).click();		 
				//6. Click on Create Contact
	    driver.findElement(By.linkText("Create Contact")).click(); 		  
				// 7. Enter FirstName Field Using id Locator
	    driver.findElement(By.id("firstNameField")).sendKeys("Prathibharani");		  
				// 8. Enter LastName Field Using id Locator
	    driver.findElement(By.id("lastNameField")).sendKeys("Kottapalli");		 
				// 9. Enter FirstName(Local) Field Using id Locator
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Prathibha");		  
				// 10. Enter LastName(Local) Field Using id Locator
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("k");		 
				// 11. Enter Department Field Using any Locator of Your Choice
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");		  
				// 12. Enter Description Field Using any Locator of your choice 
	    driver.findElement(By.id("createContactForm_description")).sendKeys("Need to Test");		  
				// 13. Enter your email in the E-mail address Field using the locator of your choice
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sravkottapalli@gmail.com");		  
				// 14. Select State/Province as NewYork Using Visible Text
	    WebElement source=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dd = new Select(source);	
	    dd.selectByVisibleText("New York");
				// 15. Click on Create Contact
	    driver.findElement(By.className("smallSubmit")).click();		  
				// 16. Click on edit button 
	    driver.findElement(By.linkText("Edit")).click();
				// 17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();		  
				// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("love to learn!");		  
				//  19. Click on update button using Xpath locator
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();		  
				// 20. Get the Title of Resulting Page.
        System.out.println(driver.getTitle());
				
			}

		

	}


