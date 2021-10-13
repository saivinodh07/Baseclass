package org.chrome;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sri\\eclipse-workspace\\org.com\\src\\org\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//*[@class='icp-nav-link-inner']"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath("//*[@class='icp-radio']//a[1]")).click();

	}
}