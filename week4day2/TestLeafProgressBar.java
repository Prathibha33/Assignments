package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafProgressBar {
	 
	static String str="100%";
        public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
        d.get("https://leafground.com/drag.xhtml");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act = new Actions(d);
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        d.findElement(By.xpath("//span[text()='Start']")).click();
        Thread.sleep(50000);
        String txt = d.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
        System.out.println("Progress status :"+txt);
        if(txt.contains(str)) {
        	System.out.println("completed");
        }
        else {
        	System.out.println("not completed");
        }
        Thread.sleep(3000);
        d.close();
        

	}

	
}
