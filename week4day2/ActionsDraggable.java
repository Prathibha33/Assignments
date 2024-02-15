package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDraggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://jqueryui.com/draggable");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.switchTo().frame(0);
        WebElement drag = d.findElement(By.xpath("//p[text()='Drag me around']"));
        Actions act= new Actions(d);
        act.dragAndDropBy(drag,150,150).perform();

	}

}
