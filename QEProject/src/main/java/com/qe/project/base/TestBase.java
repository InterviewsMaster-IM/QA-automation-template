package com.qe.project.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static ClassLoader _class;
	
	public TestBase() {
		_class = getClass().getClassLoader();
	}
	
	public static void initialization()  
	{
		try {
			
			InputStream is = _class.getResourceAsStream("data.properties");
			prop = new Properties();
			prop.load(is);
			System.out.println(prop.getProperty("d1"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("Browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src" + File.separator + "main" + File.separator + "resources" + File.separator +"chromedriver");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver",
					"src" + File.separator + "main" + File.separator + "resources" + File.separator +"geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		//driver.get(prop.getProperty("url"));

	}

}
