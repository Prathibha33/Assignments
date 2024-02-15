package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {
	/*Salesforce Customer service:
1.Launch the browser
2.Load the url as " https://login.salesforce.com/ "
3.Enter the username as "hari.radhakrishnan@qeagle.com"
4. Enter the password as "Leaf@1234 "
5.click on the login button
6.click on the learn more option in the Mobile publisher
7.Switch to the next window using Windowhandles.
8.click on the confirm button in the redirecting page
9.Get the title
10.Get back to the parent window
11.close the browser*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disabled-notifications");
		ChromeDriver d=new ChromeDriver();
        d.get("https://login.salesforce.com/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        d.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        d.findElement(By.id("password")).sendKeys("Leaf@1234");
        d.findElement(By.id("Login")).click();
        d.findElement(By.xpath("//span[text()='Learn More']")).click();
        Set<String> ws = d.getWindowHandles();
        List<String> wss= new ArrayList<String>(ws);
        d.switchTo().window(wss.get(1));
        d.findElement(By.xpath("//button[text()='Confirm']")).click();
        String title = d.getTitle();
        System.out.println("Title :"+title);
        Thread.sleep(3000);
        d.switchTo().window(wss.get(0));
        Thread.sleep(3000);
        d.quit();

	}

}
