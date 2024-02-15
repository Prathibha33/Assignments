package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://jqueryui.com/resizable");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.switchTo().frame(0);
        WebElement resz = d.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon ui-icon-grips')]"));
        Actions act = new Actions(d);
        act.clickAndHold(resz).moveByOffset(150,150).perform();
	}

}
