package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://jqueryui.com/selectable");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.switchTo().frame(0);
        WebElement item = d.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement item1 = d.findElement(By.xpath("//li[text()='Item 2']"));
	    Actions act = new Actions(d);
	    act.keyDown(Keys.CONTROL).click(item).click(item1).keyUp(Keys.CONTROL).perform();
	    
	}

}
