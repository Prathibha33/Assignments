package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class ServicenowBaseclass {
	
	public EdgeDriver driver;
	
	@Parameters({"url","username","password"})
    @BeforeMethod
	public void preCondition(String url,String uname,String pwd) throws InterruptedException {
		    driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			driver.findElement(By.name("user_name")).sendKeys(uname);
			driver.findElement(By.name("user_password")).sendKeys(pwd);
			driver.findElement(By.id("sysverb_login")).click();
			Thread.sleep(2000);
			
			Shadow sh = new Shadow(driver);
			sh.setImplicitWait(10);
			sh.findElementByXPath("//div[text()='All']").click();
			sh.setImplicitWait(10);

	}
	@AfterMethod
    public void postCondition() {
    	driver.close();
    	
    }

}
