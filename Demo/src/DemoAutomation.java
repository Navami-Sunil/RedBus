import org.openqa.selenium.chrome.ChromeDriver;
public class DemoAutomation {

	public static void main(String[] args) {
		org.openqa.selenium.chrome.ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
	}

}
