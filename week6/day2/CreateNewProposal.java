package week6.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

/*1: Create new Proposal 
1. Launch ServiceNow application
2. Login with valid credential 
3. Click All and Enter Proposal in filter navigator and press enter 
4. Click- new  and  fill mandatory fields and click 'Submit' 
Button.
5. Verify the successful creation of new Proposal*/
public class CreateNewProposal extends ServicenowBaseclass{
	
    @Test
	public void runCreateNewProposal() {
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Proposals");
		sh.findElementByXPath("//span[contains(text(),'My ')]").click();
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh.findElementByXPath("//button[text()='New']").click();
		String propId = sh.findElementByXPath("//input[@id='std_change_proposal.number']").getAttribute("value");
		System.out.println("Proposal ID :" +propId);
		sh.findElementByXPath("//input[@id='std_change_proposal.short_description']").sendKeys("Creating proposal");
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.setImplicitWait(20);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean b1n = false;
		for(WebElement result : list) {
			if (result.getText().contains(propId)) {
				b1n = true;
				break;
			}
		}
		
		if(b1n) {
			System.out.println("New proposal is created");
		} else {
			System.out.println("New proposal is not created");
		}
		
		
		
	}

}
