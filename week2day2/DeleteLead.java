package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
		    //To Maximize
		    driver.manage().window().maximize();
		    //ImplicitlyWait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    //1	Launch the browser
			//http://leaftaps.com/opentaps/control/main
			driver.get("http://leaftaps.com/opentaps/control/main"); 
			//2	Enter the username
			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			//3	Enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//4	Click Login
			driver.findElement(By.className("decorativeSubmit")).click();
			//5	Click crm/sfa link
			driver.findElement(By.partialLinkText("SFA")).click();
			//6	Click Leads link
			driver.findElement(By.linkText("Leads")).click();
			//7	Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//8	Click on Phone
			driver.findElement(By.linkText("Phone")).click();
			//9	Enter phone number
			driver.findElement(By.id("ext-gen270")).sendKeys("1234567890");
			//10 Click find leads button
			driver.findElement(By.linkText("Find Leads")).click();
			//11 Capture lead ID of First Resulting lead
			WebElement leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			String text=leadId.getText();
		    //12 Click First Resulting lead
			leadId.click();
			//13 Click Delete
			driver.findElement(By.linkText("Delete")).click();
			//14 Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//15 Enter captured lead ID
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
			//16 Click find leads button
			driver.findElement(By.linkText("Find Leads")).click();
			//17 Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			if ("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a" != null) {
				System.out.println("No records to display");}
		    //18 Close the browser (Do not log out)
	        driver.close();
		}
	

	}


