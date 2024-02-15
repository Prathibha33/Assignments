package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.leafground.com/select.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement atool = d.findElement(By.xpath("//div/select[@class='ui-selectonemenu']"));
		Select s1= new Select(atool);
		s1.selectByIndex(1);
		
		d.findElement(By.xpath("//label[text()='Select Country']")).click();
		d.findElement(By.xpath("//li[text()='India']")).click();
		
	    d.findElement(By.xpath("//label[text()='Select City']")).click();
	    Thread.sleep(3000);
		d.findElement(By.xpath("//li[@data-label ='Chennai']")).click();
		
		d.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		d.findElement(By.xpath("//li[text()='AWS']")).click();
		
		d.findElement(By.xpath("//label[text()='Select Language']")).click();
		d.findElement(By.xpath("//li[text()='Telugu']")).click();
		
		
		

	}

}
