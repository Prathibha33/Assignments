package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafResizeImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://leafground.com/drag.xhtml");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement image = d.findElement(By.xpath("//img[@class='shadow-1 ui-resizable']"));
        Actions act = new Actions(d);
        act.clickAndHold(image).moveByOffset(200, 0).perform();
        Thread.sleep(3000);
        d.close();
	}

}

