import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

}
