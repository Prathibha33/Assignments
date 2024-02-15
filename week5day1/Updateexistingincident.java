package week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
/*1. Launch ServiceNow application
2. Login with valid credentials 
3. Click All and enter Incident in filter navigator and press enter
4. Search for the existing incident and click on the incident
5. Update the incidents with Urgency as High and State as In Progress
6. Verify the priority and state*/
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Updateexistingincident extends ServicenowBaseclass {
    
	@Parameters({"updateIncidentNumber"})
	@Test(enabled = false)
	public  void runUpdateexistingincident(String incNum) throws InterruptedException {
		
		
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		WebElement iframe = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframe);
		
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(incNum,Keys.ENTER);
		sh.findElementByXPath("//a[@class='linked formlink']").click();
		
		WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select dd=new Select(urgency);
		dd.selectByValue("1");
		WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select dd2=new Select(state);
		dd2.selectByValue("2");
		sh.findElementByXPath("//button[@id='sysverb_update_bottom']").click();
		
		sh.findElementByXPath("//a[@class='linked formlink']").click();
		String incidentnumber = driver.findElement(By.xpath("//input[@id='sys_original.incident.number']")).getAttribute("value");
		System.out.println("Incident number: "+incidentnumber);
		WebElement retrieveurgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select dd3=new Select(retrieveurgency);
		WebElement urgencyselected = dd3.getFirstSelectedOption();
		System.out.println("Urgency of the incdent: "+urgencyselected.getText());
		
		WebElement retrievestate = driver.findElement(By.id("incident.state"));
		Select dd4=new Select(retrievestate);
		WebElement stateselected = dd4.getFirstSelectedOption();
		
		System.out.println("The state of incident is: "+stateselected.getText());
		
		
	}

}
