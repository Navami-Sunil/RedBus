import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		 
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
	}

}
