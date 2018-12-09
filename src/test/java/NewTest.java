import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	 @Test
	 public void test01() {
	 	  
	 	  System.setProperty("webdriver.chrome.com", "C:\\Users\\Coderz-test\\Desktop\\cucumberFramework\\Automation\\chromedriver.exe");
	 	  WebDriver driver = new ChromeDriver();
	 	  driver.get("https://www.google.com/");
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println(" Thread number for test01 is " + id);
	 	  driver.quit();
		 
		 System.out.println("hellow world");
	   }
}
