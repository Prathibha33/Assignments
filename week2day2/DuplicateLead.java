package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
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
		//8	Click on Email
		 driver.findElement(By.linkText("Email")).click();
		 //9 Enter Email
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sravkottapalli@gmail.com");
		 Thread.sleep(3000);
		//10 Click find leads button
		 driver.findElement(By.xpath("//*[@id='ext-gen334'] ")).click();
		//11 Capture name of First Resulting lead
		 WebElement leadId= driver.findElement(By.linkText("Prathibharani"));
		 String text = leadId.getText();
		//12 Click First Resulting lead
		 leadId.click();
		//13 Click Duplicate Lead
		 driver.findElement(By.className("subMenuButton")).click();
		//14 Verify the title as 'Duplicate Lead'
		 String text1 = driver.getTitle();
		 if(text1.contains("Duplicate Lead")) {
		 System.out.println("The title as Duplicate Lead");
		}
		  //15 Click Create Lead
		  driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
		  //16 Confirm the duplicated lead name is same as captured name
		  WebElement firstName1 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		  String duplicatedLeadName = firstName1.getText();
		  if(duplicatedLeadName==text) {
		   System.out.println("duplicated lead name is same as captured name");
		  }
		  else {
			  System.out.println("duplicated lead name is not same as captured name");
		  }
		//17 Close the browser (Do not log out)
		  driver.close();
		
		
	
}}
	


	


