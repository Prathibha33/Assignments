package week2day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/login");
		driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      //WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
      driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
      driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
      driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

}
