package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://uncodemy.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   Actions a = new Actions (driver);
		  
		   WebElement categories = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		   Thread.sleep(3000);
		   a.moveToElement(categories).perform();
		   
		   WebElement st = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		   a.moveToElement(st).perform();
		   
		   WebElement mt = driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
		   mt.click();
		   
		   
		   
		   
	}

}
