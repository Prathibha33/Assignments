package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> ws = driver.getWindowHandles();
		List<String>wss = new ArrayList<String>(ws);
		driver.switchTo().window(wss.get(1));
		System.out.println("New window title: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(wss.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> ws1 = driver.getWindowHandles();
        List<String> wss1= new ArrayList<String>(ws1);
        System.out.println("Number of opened tabs: "+wss1.size());
        driver.switchTo().window(wss1.get(2));
        driver.close();
        driver.switchTo().window(wss1.get(1));
        driver.close();
        driver.switchTo().window(wss1.get(0));
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        Set<String> ws2 = driver.getWindowHandles();
        List<String> wss2= new ArrayList<String>(ws2);
        for(int i= wss2.size()-1; i>0; i--) {
        	driver.switchTo().window(wss2.get(i));
        	driver.close();
        	
			
		}
        driver.switchTo().window(wss2.get(0));
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Thread.sleep(5000);
        Set<String> ws3 = driver.getWindowHandles();
        List<String> wss3= new ArrayList<String>(ws3);
        driver.switchTo().window(wss3.get(1));
        System.out.println("title of the window: "+driver.getTitle());
        for (int j = 1; j < wss3.size(); j++) {
			
		
        	driver.switchTo().window(wss3.get(j));
        	driver.close();
        }
        driver.switchTo().window(wss3.get(0));
    	driver.close();
		

	}

}
