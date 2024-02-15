package Week7day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
	   fromStation.clear();
	   fromStation.sendKeys("MAS" ,Keys.TAB);
	   
	   WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
	   toStation.clear();
	   toStation.sendKeys("MDU" ,Keys.TAB);
	   driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	   driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
	   
		
	   List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
	   for (int i = 2; i <=rows.size(); i++) {
		 String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
		 System.out.println(text);
	}
	}

}
