package Cucumber_Practice.Cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties pr;

	public static WebDriver getDriver() throws IOException {

		pr = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\syed.ahtisham.ali\\eclipse-workspace\\Cucumber\\src\\test\\java\\Cucumber_Practice\\Cucumber\\global.properties");
		pr.load(fis);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\syed.ahtisham.ali\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(pr.getProperty("url"));
		return driver;
	}

}
