package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafDraggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://leafground.com/drag.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = d.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions act = new Actions(d);
		Thread.sleep(2000);
		act.dragAndDropBy(drag, 300,0).perform();
		Thread.sleep(3000);
		d.close();

	}

}
