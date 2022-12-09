package POMRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenareteStaleElementRefrenaceException {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Beauty");
		
		driver.navigate().refresh();
		element.sendKeys("topi");
		
		

}
}