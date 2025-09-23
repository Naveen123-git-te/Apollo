package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));




//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebDriverWait wait=new WebDriverWait(driver, 10);





driver.get("https://fb.com");
//Actions a=new Actions(driver);
//a.scrollByAmount(0, 100).perform();
//driver.manage().window().minimize();
driver.quit();
	}
}