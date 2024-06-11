import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
 public static void main(String[] args) {
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	 driver.manage().window().maximize();
    WebElement frame1 =  driver.findElement(By.id("iframeResult"));
    driver.switchTo().frame(frame1);
     
	 driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
	 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
	 }
}
