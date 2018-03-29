package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MecuryTours {
  @Test
  public void login() throws InterruptedException {
	  

		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	//	driver.navigate().to("http://newtours.demoaut.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Enter username
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//Enter password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click login
		driver.findElement(By.name("login")).click();
		driver.close();
  }
}
