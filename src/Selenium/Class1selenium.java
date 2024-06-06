package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1selenium {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
   //System.out.println(driver.getTitle());
  // System.out.println(driver.getCurrentUrl());
  // driver.manage().window().maximize();
   Thread.sleep(2000);

   //driver.manage().window().minimize();
   //driver.quit();
   
   WebElement username = driver.findElement(By.xpath("//input[@placeholder='username']"));
   username.sendKeys("Admin");
   
   WebElement password = driver.findElement(By.xpath("//input[@placeholder='password']"));
   password.sendKeys("admin123");
   
   WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
   login.click();
   Thread.sleep(5000);
   WebElement buzz = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
   buzz.click();
   Thread.sleep(4000);
   WebElement post = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
   post.sendKeys("swati");
   WebElement pc = driver.findElement(By.xpath("//button[@type='submit']"));
   pc.click();
   

   
   
   
		   
   
   
   
	}

}
