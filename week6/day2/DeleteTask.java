package week6.day2;
//Test Steps:
//1. Login to https://login.salesforce.com
//2. Click on toggle menu button from the left corner
//3. Click view All and click Sales from App Launcher
//4. Click on Tasks tab 
//5.Click on Dropdown icon available under tasks and select value as Recently viewed
//6. Click the Dropdown for Bootcamp task and select Delete
//7. Verfiy the Task is Deleted 

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteTask extends ProjectSpecificMethod{

	@Test
	public void runDeleteTask() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Tasks']"));
		driver.executeScript("arguments[0].click();", clk);
		WebElement findElement = driver.findElement(By.xpath("//div/span[@class='uiOutputText']"));
		String text = findElement.getText();
		System.out.println("Name "+text);
		driver.findElement(By.xpath("(//li[@data-aura-class='oneActionsDropDown'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		WebElement web = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		String msg = web.getText();
		System.out.println("Message :"+msg);
		List<WebElement> list = driver.findElements(By.xpath("//div/span[@class='uiOutputText']"));
		boolean bl=false;
		for (WebElement webElement : list) {
			String text2 = webElement.getText();
			if(text.contains(text2)) {
				bl=true;
			}
		}
		if(bl) {
			System.out.println("Task is not deleted");
		}
		else {
			System.out.println("Task is deleted");
		}
	}

}
