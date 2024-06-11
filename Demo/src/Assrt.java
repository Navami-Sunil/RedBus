
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.testng.Assert; // Corrected import for TestNG assertion
public class Assrt {
	public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.ebay.com.au/");
       String actitle = driver.getTitle(); 
       String extitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
       WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
       Actions action = new Actions(driver);
       action.moveToElement(element).perform();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
       Assert.assertEquals(actitle, extitle); // Corrected assertion method
   }
}