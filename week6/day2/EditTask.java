package week6.day2;

//Test Steps:
//1. Login to https://login.salesforce.com
//2. Click on toggle menu button from the left corner
//3. Click view All and click Sales from App Launcher
//4. Click on Tasks tab 
//5.Click on Dropdown icon available under tasks and select value as Recently viewed
//6. Click the Dropdown for Bootcamp task and select Edit
//7. Select todays date as Due date
//8. Select Priority as low
//10. Click save and verify Subject

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditTask extends ProjectSpecificMethod{

	@Test
	public void runEditTask() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Tasks']"));
	    driver.executeScript("arguments[0].click();", clk);
        driver.findElement(By.xpath("(//li[@data-aura-class='oneActionsDropDown'])[2]")).click();
        driver.findElement(By.xpath("//a[@title='Edit']")).click();
        driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='5']")).click();
        driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
        driver.findElement(By.xpath("//li/a[text()='Low']")).click();
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        WebElement web = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
        String msg = web.getText();
        System.out.println("Message :"+msg);
	}

}
