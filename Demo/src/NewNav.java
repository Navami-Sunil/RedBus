import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewNav {

	public static void main(String[] args) {
	  ChromeDriver driver = new ChromeDriver();
	  
       driver.get("https://www.saucedemo.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
//       WebElement button = driver.findElement(By.className("submit-button btn_action"));
//       button.click();
      
       driver.findElement(By.id("login-button")).click();
       driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
       driver.findElement(By.className("shopping_cart_link")).click();
	}

}
