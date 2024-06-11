import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {


		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.allegiantair.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[data-hook='overlay-merchandise_ice-pop_close']")).click();

	}

}
