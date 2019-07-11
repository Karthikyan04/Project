package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestingNew\\Driver\\chromedriver.exe");
		WebDriver pro = new ChromeDriver();
		pro.get("file:///C:/Users/KarthiKeyan/Desktop/h.html");
		List<WebElement> list = pro.findElements(By.xpath("//*[@name='BookTable']//td[3]"));

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
	}

}
