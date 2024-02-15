package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafDraggableRows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://leafground.com/drag.xhtml");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement source = d.findElement(By.xpath("(//td[text()='Bracelet'])[2]"));
        WebElement target = d.findElement(By.xpath("(//td[text()='Brown Purse'])[2]"));
        Actions act = new Actions(d);
        act.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
        d.close();
	}

}
