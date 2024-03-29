package week4day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	/*1. Load the URL https://www.amazon.in/
	2. Search as oneplus 9 pro 
	3. Get the price of the first product
	4. Print the number of customer ratings for the first displayed product
	5. Click the first text link of the first image
	6. Take a screen shot of the product displayed
	7. Click 'Add to Cart' button
	8. Get the cart subtotal and verify if it is correct.
	9. Close the browser*/
	

public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement((By.id("twotabsearchtextbox"))).sendKeys("oneplus 9 pro",Keys.ENTER);
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        System.out.println(price.getText());
        WebElement noOfRatings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
        System.out.println("Number of ratings for this product :"+noOfRatings.getText());
        driver.findElement(By.linkText("(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click();
        Set<String> wh = driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        driver.findElement(By.id("add-to-cart-button")).click();
        //driver.findElement(By.xpath("(//span/input[@class='a-button-input'])[19]")).click();
        WebElement subtotal = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']"));
        System.out.println(subtotal.getText());
	}
}