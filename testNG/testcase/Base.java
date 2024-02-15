package testNG.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Base {
public  ChromeDriver driver;
public  String prathibha;
public String filename;
@Parameters({"url","uname","pword"})
@BeforeMethod
	public void preCondition(String url, String uname, String pword) {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
	@DataProvider(name = "Aditya")
	public String[][] getData() throws IOException {
		return ReadExcelSheet.readExcel(filename);
	}
}
