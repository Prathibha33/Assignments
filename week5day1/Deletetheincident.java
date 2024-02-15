package week5day1;
/*1. Launch ServiceNow application
2. Login with valid credentials 
3. Click All and enter Incident in filter navigator and press enter"
4. Search for the existing incident and navigate into the incident
5. Delete the incident
6. Verify the deleted incident*/



import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Deletetheincident extends ServicenowBaseclass {
    
	@Parameters({"deleteIncidentNumber"})
	@Test(dependsOnMethods = "week5day1.CreateNewIncident.runCreateNewIncident")
	public  void runDeletetheincident(String delNum) {
		// TODO Auto-generated method stub
		
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		WebElement iframe = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframe);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(delNum, Keys.ENTER);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//a[contains(@class,'linked formlink')]").click();
		sh.findElementByXPath("//button[@id='sysverb_delete']").click();
		sh.findElementByXPath("//button[@id='ok_button']").click();
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(delNum, Keys.ENTER);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean bl = false;
		for (WebElement webElement : list) {
			if (webElement.getText().contains(res)) {
				bl = true;
				break;
			}
		}
		if (bl) {
			System.out.println("Incident not deleted!");
		} else {
			System.out.println("Incident deleted successfully!");
		}
	}

}
