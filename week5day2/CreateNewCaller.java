package week5day2;
/*2: Create New Caller 
1. Launch ServiceNow application
2. Login with valid credential
3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller*/

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends ServicenowBaseclass {

	@Test
	public void runCreateNewCaller() {
		

		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Callers");
		sh.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);

		sh.findElementByXPath("//button[text()='New']").click();
		sh.findElementByXPath("//input[@id='sys_user.first_name']").sendKeys("Sravana");
		sh.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys("Sandya");
		String text = sh.findElementByXPath("//input[@id='sys_user.last_name']").getAttribute("value");
		System.out.println("Lastname :"+text);
		sh.findElementByXPath("//input[@id='sys_user.title']").sendKeys("Creating caller");
		sh.findElementByXPath("//input[@id='sys_user.email']").sendKeys("Sravani@gmail.com");
		sh.findElementByXPath("//input[@id='sys_user.phone']").sendKeys("456712399");
		sh.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys("9876543210");
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.findElementByXPath("//input[@class='form-control']").sendKeys(text,Keys.ENTER);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		Boolean b1 = false;
		for(WebElement webElement : list) {
			if(webElement.getText().contains(text)) {
				b1=true;
				break;
			}
		}
		if(b1) {
			System.out.println("New caller is created");
		}else {
			System.out.println("New caller is not created");
		}

	}

}
