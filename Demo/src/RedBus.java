import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class RedBus {
	
	  @BeforeClass

    public static void main(String[] args) {
        RedBusPageTest redBusPageTest = new RedBusPageTest();
        redBusPageTest.testRedBusBooking();
    }
}

class RedBusPageTest {
    private WebDriver driver;
  
    
    public RedBusPageTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void testRedBusBooking() {
        driver.get("https://www.redbus.in/");
        WebElement sourceInput = driver.findElement(By.id("src"));
        sourceInput.sendKeys("Majestic Bangalore");

        WebElement destinationInput = driver.findElement(By.id("dest"));
        destinationInput.sendKeys("Kochi");

        // Wait for the page title to match
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
        String actitle = driver.getTitle(); 	    String extitle = "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus";
//
	    Assert.assertEquals(actitle, extitle);

        // Select source and destination
        driver.findElement(By.xpath("//text[text()='Majestic']")).click();
        driver.findElement(By.xpath("//text[text()='Kochi']")).click();

        // Select date
        WebElement onwardCal = driver.findElement(By.id("onwardCal"));
        onwardCal.click();
        WebElement dateElement = driver.findElement(By.xpath("//*[@id='onwardCal']/div/div[2]/div/div/div[3]/div[5]/span/div[7]/span"));
        dateElement.click();

        // Click search button
        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();
        WebElement searchButton1 = driver.findElement(By.xpath("//*[@id=\"26247370\"]/div/div[2]/div[1]"));      
        		searchButton1.click();

        // Wait for the search results
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='26247370']/div/div[2]/div[1]")));
        	

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[text()='Yeshwantpur']")).click();
        driver.findElement(By.xpath("//span[text()='Edapally']")).click();
          driver.findElement(By.xpath("//button[text()='Proceed to book']")).click();
        // Click continue button
     //   driver.findElement(By.xpath("//button[text()='Continue']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Navami Sunil");
        driver.findElement(By.id("div_23_0")).click();
        driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("21");
        driver.findElement(By.id("201")).sendKeys("Kerala");
        driver.findElement(By.xpath("//li[text()='Kerala']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("navamisunil2002@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7736303944");
        driver.findElement(By.xpath("//div[text()='Full refund upon cancellation']")).click();
        driver.findElement(By.xpath("//span[text()='Yes, Protect my trip at']")).click();
       
        driver.findElement(By.xpath
        		
        		("//input[@value='Proceed to pay']")).click();
        System.out.println("Test case passed");   }
    
    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}





































//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import java.time.Duration;
//
//import java.util.concurrent.TimeUnit;
//
//public class RedBus{
//
//    public static void main(String[] args) throws InterruptedException {
//       
//        ChromeDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
//        
// public void Testing() {
//        driver.get("https://www.redbus.in/");
//        WebElement sourceInput = driver.findElement(By.id("src"));
//        sourceInput.sendKeys("Majestic Bangalore");
//
// 
//        WebElement destinationInput = driver.findElement(By.id("dest"));
//        destinationInput.sendKeys("Kochi");
//        
//		Thread.sleep(2000);
//		String actitle = driver.getTitle(); 
//	    String extitle = "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus";
//	    Assert.assertEquals(actitle, extitle);
//		driver.findElement(By.xpath("//text[text()=\"Majestic\"]")).click();
//		driver.findElement(By.xpath("//text[text()=\"Kochi\"]")).click();
//        try {
//            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//            org.openqa.selenium.Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//            alert.dismiss();
//        } catch (Exception e) {
//            
//        }
//        WebElement onwardCal = driver.findElement(By.id("onwardCal"));
//        onwardCal.click();
//       
//        
//        WebElement dateElement = driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[5]/span/div[7]/span"));
//        dateElement.click();
//
//  
//        WebElement searchButton = driver.findElement(By.id("search_button"));
//        searchButton.click();
//
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//       driver.findElement(By.xpath("//*[@id=\"26247370\"]/div/div[2]/div[1]")).click();
//       driver.findElement(By.xpath("//span[text()='Yeshwantpur']")).click();
//       driver.findElement(By.xpath("//span[text()='Edapally']")).click();
//       driver.findElement(By.xpath("//button[@class=\"button continue inactive\"]")).click();
//       
// }
//        
//        
//    }
//}

//





//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//import org.testng.Assert; // Corrected import for TestNG assertion
//import org.testng.annotations.Test;
//@Test
//public class RedBus {
//   public static void main(String[] args) {
//       ChromeDriver driver = new ChromeDriver();
//       driver.get("https://www.ebay.com.au/");
//       String actitle = driver.getTitle(); 
//       String extitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//       WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
//       Actions action = new Actions(driver);
//       action.moveToElement(element).perform();
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
//      Assert.assertEquals(actitle, extitle);
//      System.out.println("Assertion passed");
//       driver.close();// Corrected assertion method
//   }
//}
