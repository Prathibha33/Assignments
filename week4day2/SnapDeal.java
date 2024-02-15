package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	/*1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (900-1200)
9.Filter with color Navy 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://www.snapdeal.com/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(d);
        WebElement mf = d.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
        act.moveToElement(mf).perform();
        d.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        WebElement count = d.findElement(By.xpath("//span[@class='category-name category-count']"));
	    System.out.println("count of sports shoes :"+count.getText());
	    d.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	    d.findElement(By.xpath("//span[text()='Sort by:']")).click();
	    d.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
	    d.findElement(By.xpath("//input[@name='fromVal']")).clear();
        d.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
        d.findElement(By.xpath("//input[@name='toVal']")).clear();
        d.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
        act.pause(2000).perform();
        d.findElement(By.xpath("//div[contains(@class,'arrow btn')]")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("//label[@for='Color_s-Multi%20Color']")).click();
        Thread.sleep(1000);
        WebElement mo = d.findElement(By.xpath("//img[@class='product-image wooble']"));
	    act.moveToElement(mo).perform();
	    List<WebElement> filters = d.findElements(By.xpath("//div[@class='navFiltersPill']"));
		List<String> f=new ArrayList<String>();
		for(int i=0;i<filters.size();i++) {
			String text = filters.get(i).getText();
			f.add(text);
	  }
		System.out.println("filters are applied: "+f);
		WebElement qv = d.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
        d.executeScript("arguments[0].click();", qv);
        WebElement cost = d.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']"));
	    System.out.println("cost of the prdct along with discount % :"+ cost.getText());
	    d.findElement(By.xpath("//div/div[2]/i[@class='sd-icon sd-icon-delete-sign']")).click();
	    d.quit();
	}
}
	
	
