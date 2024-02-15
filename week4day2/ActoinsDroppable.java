package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActoinsDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://jqueryui.com/droppable");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.switchTo().frame(0);
        WebElement dragS = d.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement dropT = d.findElement(By.xpath("//p[text()='Drop here']"));
	    Actions act = new Actions(d);
	    act.dragAndDrop(dragS, dropT).perform();
	    }

}
