package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/*1) Go to  https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows*/


public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://www.nykaa.com/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(d);
        WebElement brands = d.findElement(By.xpath("//li/a[text()='brands']"));
        act.moveToElement(brands).perform();
        d.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
        d.findElement(By.linkText("L'Oreal Paris")).click();
        System.out.println(d.getTitle());
        d.findElement(By.className("sort-name")).click();
        d.findElement(By.xpath("//div/span[text()='customer top rated']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//div/span[text()='Category']")).click();
        d.findElement(By.xpath("//span[text()='Hair']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
        d.findElement(By.xpath("//span[text()='Shampoo']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//span[text()='Concern']")).click();
        d.findElement(By.xpath("//span[text()='Color Protection']")).click();
        WebElement smp = d.findElement(By.xpath("(//span[@class='filter-value'])[1]"));
        WebElement clrp = d.findElement(By.xpath("(//span[@class='filter-value'])[2]"));
	    System.out.println("applied filter names :"+smp.getText()+","+clrp.getText());
	    d.findElement(By.xpath("//div[contains(text(),'Paris Colour')]")).click();
	    Set<String> wh = d.getWindowHandles();
        List<String> whs= new ArrayList<String>(wh);
        d.switchTo().window(whs.get(1));
        WebElement ele = d.findElement(By.xpath("//select[@title='SIZE']"));
	    Select s1 = new Select(ele);
	    s1.selectByIndex(2);
	    WebElement mrp = d.findElement(By.xpath("//span[@class='css-1jczs19']"));
	    System.out.println("mrp of the product :"+mrp.getText());
	    d.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	    d.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
	    d.switchTo().frame(0);
	    WebElement GrandTtl = d.findElement(By.xpath("//div//span[(@class='css-1um1mkq e171rb9k3')]"));
	    System.out.println("Grand Total Amount :"+GrandTtl.getText());
	    d.findElement(By.xpath("//span[text()='Proceed']")).click();
	    d.quit();
	    
	}

}
