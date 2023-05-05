package sampless;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Propertyfilehandling {
static WebDriver driver;



	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Workspaces\\Techforum5\\SeleniumDemos\\ObjectRepository\\configuration.properties");
		p.load(fis);
		driver=BrowserConfiguration.browserSetup(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("username_id"))).sendKeys("kiruba");
		driver.findElement(By.id(p.getProperty("password_id"))).sendKeys("kiruba123");
	}
}
