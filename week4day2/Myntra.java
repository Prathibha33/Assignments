package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	/*1) Open https://www.myntra.com/
2) Mouse hover on MeN 
3) Click Jackets 
4) Find the total count of the item 
5) Validate the sum of categories count matches
6) Check jackets
7) Click + More options under BRAND
8) Type Duke and click checkbox
9) Close the pop-up x
10) Confirm all the Coats are of brand Duke
    Hint : use List 
11) Sort by Better Discount
12) Find the price of the first displayed item
Click on the first product
13) Take a screen shot
14) Click on WishList Now
15) Close Browser*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://www.myntra.com/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(d);
        WebElement men = d.findElement(By.linkText("Men"));
        act.moveToElement(men).perform();
        WebElement jkt = d.findElement(By.xpath("(//li/a[text()='Jackets'])[1]"));
        d.executeScript("arguments[0].click();", jkt);
	}

}
