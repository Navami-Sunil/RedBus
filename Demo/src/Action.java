import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au");
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/a"));
        action.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobile Phones")));
         WebElement element2 = driver.findElement(By.linkText("Mobile Phones"));
         action.moveToElement(element2);
         action.click().build().perform();
        //a[text()="Mobile Phone Cases"]
       // driver.quit();
    }
}



