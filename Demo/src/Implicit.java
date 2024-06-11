import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicit {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com.au/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	
	
	}

}
