package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLeaf {
@Test
	public void leaf() {
		// TODO Auto-generated method stub
		
		
		//3. Find the position of the Submit button
		ChromeDriver driver = new ChromeDriver();
	    //To Maximize
	    driver.manage().window().maximize();
	    //ImplicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//1Launch the browser
	    driver.get("https://www.leafground.com/button.xhtml");
	  //1. Click and Confirm title
	    driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[1]")).click();
	    driver.getTitle();
	  //2. Confirm if the button is disabled
	    driver.findElement(By.xpath("(//div[@class='card'])[2]"));
	}

}
