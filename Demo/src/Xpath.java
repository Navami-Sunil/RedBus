import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
    
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
	}

}
