
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// 1. Create Chromedriver to drive the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
		
		
//		WebDriver driver= new FirefoxDriver();
		
		
		//2. Open homepage
		driver.get("http://nytimes.com");
		Thread.sleep(2000);
		
		//Find element-ad
		WebElement ad= driver.findElement(By.className("icon"));
		Point location = ad.getLocation();
		Dimension size= ad.getSize();
		
		Thread.sleep(1000);
		System.out.println(location + "" + size);
		driver.close();
		
		
		
		//Get its position
		
		///find jobs button
		
		
		////click on it
		
		
		///from job search results page, get page title and job count
		
	
	}

}