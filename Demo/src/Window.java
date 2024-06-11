import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.className("cta_button")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("windowhandles");
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println("childwindow");
		driver.switchTo().window(childwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Navami");
		driver.findElement(By.name("UserLastName")).sendKeys("Sunil");
		//driver.switchTo().window(parentwindow);
		driver.findElement(By.name("UserEmail")).sendKeys("hello@gmail.com");
		driver.findElement(By.name("UserPhone")).sendKeys("99887766");
		Select job=new Select(driver.findElement(By.name("UserTitle")));
		job.selectByValue("Sales_Manager_ANZ");
		Select country=new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByValue("US");
		Select state=new Select(driver.findElement(By.name("CompanyState")));
		state.selectByValue("AL");
	//driver.findElement(By.xpath("//*[@id='SubscriptionAgreement']")).click();
		WebElement checkbox = driver.findElement(By.id("SubscriptionAgreement")); 
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", checkbox);
		 Thread.sleep(4000);
			driver.findElement(By.id("rejectInvite")).click();
		 driver.findElement(By.xpath("//button[text()='Start my free trial']")).click();
	
	     
	}

}
