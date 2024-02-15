package week5day1;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
/*1.Create new incident
1. Launch ServiceNow application
2. Login with valid credentials (refer the document to create the instance)
3. Click All and enter Incident in filter navigator and press enter
4. Click on Create new option and fill the manadatory fields
5. Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)*/


public class CreateNewIncident extends ServicenowBaseclass{
	@Test
	public  void runCreateNewIncident() throws InterruptedException {
		
		Shadow sh = new Shadow(driver);
		WebElement iframe = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframe);
		sh.findElementByXPath("//button[text()='New']").click();
		WebElement name = sh.findElementByXPath("//input[@id='incident.number']");
		res = name.getAttribute("value");
		System.out.println("Incident number is :" + res);
		sh.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Creating my first incident");
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(res, Keys.ENTER);
		sh.setImplicitWait(20);	
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean b1 = false;
		for(WebElement webElement : list) {
			if(webElement.getText().contains(res)) {
				b1 =true;
				break;
			}
		}
		if(b1) {
			System.out.println("New incident is created");
		}else {
			System.out.println("New incident is not created");
		}
		
	}
}
