package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafRangeSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://leafground.com/drag.xhtml");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(d);
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        WebElement left = d.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        WebElement right = d.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
	    act.dragAndDropBy(right, -30, 0).perform();
	    act.dragAndDropBy(left, 40, 0).perform();
	    Thread.sleep(3000);
	    d.close();
	}

}

