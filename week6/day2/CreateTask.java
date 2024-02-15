package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Test Steps:
//1) Launch the app
//2) Click Login
//3) Login with the credentials
//4) Click on Global Actions SVG icon
//5) Click view all
//6) Type task and select task
//7) Click New Task under dropdown icon
//6) Enter subject as "Bootcamp "                                               
//8) Select status as 'Waiting on someone else'
//9) Save and verify the 'Task created' message
	

public class CreateTask extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setFile() {
		fileName="CreateTaskData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateTask(String search,String subject) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(search);
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//input[@aria-haspopup='listbox']")).sendKeys(subject);
		driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//li/a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		WebElement web = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String msg=web.getText();
		System.out.println("Message "+msg);
		Thread.sleep(2000);
		 WebElement txt = driver.findElement(By.xpath("(//div/span[@class='uiOutputText'])[1]"));
		 String str1 = txt.getText();
		 
		 if (txt.getText().contains(str1)) {
			 System.out.println("Task created");

		}else {
			System.out.println("Task not created");
		}
	}

}
