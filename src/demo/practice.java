package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.neilalexander.jnacl.crypto.xsalsa20;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yosemitewestgate.com/reservations");
		
		driver.findElement(By.xpath("//em[@class='fa fa-times']")).click();
		
		WebElement languagebtn = driver.findElement(By.xpath("//a[@class='goog-te-menu-value']"));
		Actions z=new Actions(driver);
		z.moveToElement(languagebtn).click().build() .perform();
		
		z.moveToElement(languagebtn).clickAndHold().build().perform();
		
		driver.findElement(By.xpath("(//span[text()='French'])")).click();
	}

}
