package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//li/a[text()='Merge Contacts']")).click();
        driver.findElement(By.xpath("(//a//img)[4]")).click();
        Set<String> ws = driver.getWindowHandles();
        List<String> wss = new ArrayList<String>(ws);
        driver.switchTo().window(wss.get(1));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div/a[text()='10840']")).click();
        driver.switchTo().window(wss.get(0));
        driver.findElement(By.xpath("(//a//img)[5]")).click();
        Set<String> ws1 = driver.getWindowHandles();
        List<String> wss1= new ArrayList<String>(ws1);
        driver.switchTo().window(wss1.get(1));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div/a[text()='10840']")).click();
        driver.switchTo().window(wss1.get(0));
        driver.findElement(By.xpath("//td/a[@class='buttonDangerous']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println(driver.getTitle());
	}

}
