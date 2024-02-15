package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    //To Maximize
	    driver.manage().window().maximize();
	    //ImplicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//1Launch the browser
	    //http://leaftaps.com/opentaps/control/main
	    driver.get("http://leaftaps.com/opentaps/control/main");
		//2	Enter the username
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		//3 Enter the password
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4 Click Login
	    driver.findElement(By.className("decorativeSubmit")).click();
		//5	Click crm/sfa link
	    driver.findElement(By.partialLinkText("SFA")).click();
		//6	Click Leads link
	    driver.findElement(By.linkText("Leads")).click();
		//7 Click Find leads
	    driver.findElement(By.linkText("Find Leads")).click();
		//8	Enter first name
	    driver.findElement(By.id("ext-gen248")).sendKeys("Prathibharani");
		//9	Click Find leads button
	    driver.findElement(By.id("ext-gen334")).click();
		//10 Click on first resulting lead
	    driver.findElement(By.linkText("Prathibharani")).click();
		//11 Verify title of the page
	    String text = driver.getTitle();
	    if(text.contains("View Lead")){
	    	System.out.println(text);
	    }else {
	    	System.out.println(text=null);
	    }
		//12 Click Edit
	    driver.findElement(By.xpath("(//div/a[@class='subMenuButton'])[3]")).click();
	    //13 Change the company name
	    WebElement updateCompanyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
	    updateCompanyName.clear();
	    updateCompanyName.sendKeys("Testleaf");
	    //14 Click Update
	    driver.findElement(By.name("submitButton")).click();
		//15 Confirm the changed name appears
	    String currentCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    if(currentCompanyName.contains("Testleaf")) {
	    	System.out.println("company name is updated");
	    }else {
	    	System.out.println("company name is not updated");
	    }
		//16 Close the browser (Do not log out)
	    driver.close();

}

	

	}


