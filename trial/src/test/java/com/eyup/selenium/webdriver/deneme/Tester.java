package com.eyup.selenium.webdriver.deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Tester {
private WebDriver driver;

@Test
public void verifySearch(){
	driver = new ChromeDriver();
	driver.get("www.google.com");
	driver.quit();
}


}
