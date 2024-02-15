package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("j_idt88:name")).sendKeys("Prathibha");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(", India");
		System.out.println(driver.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		System.out.println(driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("prathibha@gmail.com",Keys.TAB);
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("I live in the UK");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Good morning everyone");
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.name("j_idt106:float-input")).getLocation());
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Prathibha");
		driver.findElement(By.xpath("//li[@data-item-label='Prathibha2']")).click();
		driver.findElement(By.name("j_idt106:j_idt122")).click();
        driver.findElement(By.xpath("//button[text()='p']")).click();
        driver.findElement(By.xpath("//button[text()='Close']")).click();
        driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Textbox assignment");
	}

}
