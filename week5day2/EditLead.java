package week5day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week5day1.BaseClass;

public class EditLead extends BaseClass{
	
	@Test
	public void runEditLead() {
	 driver.findElement(By.linkText("Find Leads")).click();
		//8	Enter first name
	    driver.findElement(By.id("ext-gen248")).sendKeys("Prathibharani");
		//9	Click Find leads button
	    driver.findElement(By.id("ext-gen334")).click();
		//10 Click on first resulting lead
	    driver.findElement(By.linkText("Prathibharani")).click();
		//11 Verify title of the page
	    String text = driver.getTitle();
	    if(text.contains("View Lead")){
	    	System.out.println(text);
	    }else {
	    	System.out.println(text=null);
	    }
		//12 Click Edit
	    driver.findElement(By.xpath("(//div/a[@class='subMenuButton'])[3]")).click();
	    //13 Change the company name
	    WebElement updateCompanyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
	    updateCompanyName.clear();
	    updateCompanyName.sendKeys("Testleaf");
	    //14 Click Update
	    driver.findElement(By.name("submitButton")).click();
		//15 Confirm the changed name appears
	    String currentCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    if(currentCompanyName.contains("Testleaf")) {
	    	System.out.println("company name is updated");
	    }else {
	    	System.out.println("company name is not updated");
	    }
	}    

}