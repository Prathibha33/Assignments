package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.leafground.com/radio.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.xpath("//label[text()='Chrome']")).click();
		d.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		System.out.println("Default Browser :"+d.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText());
		System.out.println("Default Age Group :"+d.findElement(By.xpath("//label[@for='j_idt87:age:1']")).getText());
	}

}
