package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.testng.Assert; // Corrected import for TestNG assertion
public class Assertion {
   public void open() {
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

//package ui;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//import dev.failsafe.internal.util.Assert;
//import org.testng.Assert;
//
//public class Assertion {
//   public void open() {
//	   ChromeDriver driver = new ChromeDriver();
//       driver.get("https://www.ebay.com.au/");
//       String actitle = driver.getTitle(); 
//       String extitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//       WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
//        Assert.assertEquals(actitle, extitle);
//    
//}
//   }
//




//package ui;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import dev.failsafe.internal.util.Assert;
//public class Assertion {
//@Test
//public void testAssertFunctions() {
//System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.navigate().to("https://www.browserstack.com/");
//String ActualTitle = driver.getTitle();
//String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//Assert.assertEquals(ExpectedTitle, ActualTitle);
//}
//}

//package com.tests;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import ui.Test;
//public class Assertion {
//public void testAssertFunctions() {
//System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.navigate().to("https://www.browserstack.com/");
//Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//assertTrue(verifyTitle);
//}
//}