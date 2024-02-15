package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.leafground.com/checkbox.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.xpath("//span[text()='Basic']")).click();
		d.findElement(By.xpath("//span[text()='Ajax']")).click();
		d.findElement(By.xpath("//label[text()='Java']")).click();
		d.findElement(By.xpath("//label[text()='Python']")).click();
		d.findElement(By.xpath("(//div/div[2][@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]")).click();
		d.findElement(By.xpath("//div/div[2][@class='ui-toggleswitch-slider']")).click();
		System.out.println(d.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled());
		d.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		d.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		d.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		d.findElement(By.xpath("//a/span[@class='ui-icon ui-icon-circle-close']")).click();
	
	}

}
