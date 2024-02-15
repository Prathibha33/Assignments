package week4day2;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/frame.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Hurray! You Clicked Me.')]"));
        System.out.println(ele.getText());
        driver.switchTo().defaultContent();
        List<WebElement> ele1 = driver.findElements(By.tagName("iframe"));
        System.out.println("total frames are: "+ele1.size());
        WebElement ele2  = driver.findElement(By.xpath("(//iframe)[3]"));
       driver.switchTo().frame(ele2);
       driver.switchTo().frame("frame2");
       driver.findElement(By.id("Click")).click();
       WebElement ele3 = driver.findElement(By.xpath("//button[contains(text(),'Hurray! You Clicked Me.')]"));
        System.out.println("inside nested frame: "+ele3.getText());
        
	}

}
