package javatxtfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.findElement(By.id("uid")).sendKeys("dibyaabc");
		driver.findElement(By.id("pswd")).sendKeys("dibyetc");
		driver.findElement(By.id("btnlogin")).click();
		
		
		
	}

}
