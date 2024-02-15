package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class ServicenowBaseclass {
	public EdgeDriver driver;
	public static String res;
	
	
    @BeforeMethod
	public void preCondition() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev97990.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("Supradk!3149");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(2000);
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Incidents");
		sh.findElementByXPath("//a[contains(@class,'nested-item item-label keyboard-navigatable highlighted-item')]")
		.click();

		

		

	}
    @AfterMethod
    public void postCondition() {
    	driver.close();
    	
    }

}
