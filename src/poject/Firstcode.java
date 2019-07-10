package poject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\KarthiKeyan\\eclipse-workspace\\poject\\Driver\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	
	dr.get("https://www.flipkart.com/");
	dr.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	dr.findElement(By.xpath("//*[@type='text']")).sendKeys("mobiles");
	WebElement element = dr.findElement(By.xpath("//*[@width='20']"));
	element.click();
	Thread.sleep(3000);
	WebElement element2 = dr.findElement(By.xpath("//*[text()='Realme C2 (Diamond Black, 16 GB)']"));
	element2.click();


}


}
