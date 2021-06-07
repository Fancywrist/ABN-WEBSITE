package Careerspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobApplicationForm {
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.100.0.41/pages/careers/application.php ");
		
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(500);
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
	    driver.findElement(By.id("first")).sendKeys("Bash");
		driver.findElement(By.id("middle")).sendKeys("nike");
		driver.findElement(By.id("last")).sendKeys("Aboy");	
	    Select dropdown = new Select (driver.findElement(By.xpath("//select[@class='form-control']")));
	    dropdown.selectByVisibleText("Female");
	    ////*[@id="dates"]
        driver.findElement(By.xpath("//*[@id=\"dates\"]")).click();
       Thread.sleep(500);
       
      String text = driver.findElement(By.xpath("//*[@id=\"dates\"]")).getText();
      
     
	}

}
