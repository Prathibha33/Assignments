package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafDraggableColumns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://leafground.com/drag.xhtml");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement ele = d.findElement(By.xpath("(//span[text()='Name'])[1]"));
        WebElement ele2 = d.findElement(By.xpath("(//span[text()='Category'])[1]"));
	    Actions act = new Actions(d);
	    act.dragAndDrop(ele, ele2).perform();
	    Thread.sleep(5000);
	    d.close();
	}

}
