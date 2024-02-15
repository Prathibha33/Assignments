package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d =new ChromeDriver();
		d.get("https://www.leafground.com/button.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.findElement(By.xpath("//span[text()='Disabled']")).isEnabled());
		System.out.println(d.findElement(By.xpath("//span[text()='Submit']")).getLocation());

	}

}
