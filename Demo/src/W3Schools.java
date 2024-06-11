import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
	 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[2]/following-sibling::a[2]")).click();
		
	}

}
