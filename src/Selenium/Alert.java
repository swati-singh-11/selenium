package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati Singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Alerts.html ");
		   Thread.sleep(2000);	
		   WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']v"));
		   alert.click();
		  Alert a = driver.switchTo().alert();
		    
	}

}
