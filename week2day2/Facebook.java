package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Launch the chromebrowser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disabled-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// Step 2: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 3: Maximise the window
		driver.manage().window().maximize();
		// Step 4: Add implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
		Thread.sleep(3000);
		// Step 5: Click on Create New Account button
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(7000);
		// Step 6: Enter the first name
		 driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Prathi");
		// Step 7: Enter the last name
		 driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Kottapalli");
		// Step 8: Enter the mobile number
		 driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("sravkottapalli@gmail.com");
		// Step 9: Enter the password
		 driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("earth");
		// Step 10: Handle all the three drop downs
		 Select day = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		 day.selectByIndex(3);
		 Select Month = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		 Month.selectByVisibleText("Aug");
		 Select Year = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		 Year.selectByValue("1987");
		 // Step 11: Select the radio button "Female" 
		           // ( A normal click will do for this step) 
		driver.findElement(By.xpath("//*[@name='sex']")).click(); 

	}

}
