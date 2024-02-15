package week6.day2;
/*3: Fill mandatory fields 
1. Launch ServiceNow application
2. Login with valid credentials 
3. Enter Knowledge  in filter navigator and press enter
4. Create new Article 
5.Select knowledge base as IT and category as IT- java and Click Ok
6.Update the other mandatory fields
7.Select the submit option*/

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewArticle extends ServicenowBaseclass {

	@Test
	public void runNewArticle() {
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Knowledge");
		sh.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh.findElementByXPath("//span[text()='Create an Article']").click();
		sh.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']").sendKeys("IT");
		sh.findElementByXPath("//input[@name='sys_display.kb_knowledge.kb_category']").sendKeys("Java");
		sh.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys("Creating new article");
		sh.findElementByXPath("//button[@value='sysverb_insert']").click();
		System.out.println("New article is created");
		
		
		
	}

}
