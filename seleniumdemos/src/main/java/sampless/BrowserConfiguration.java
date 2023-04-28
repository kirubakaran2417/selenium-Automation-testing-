package sampless;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserConfiguration {

	public static WebDriver browserSetup(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Techforum5\\SeleniumDemos\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		//to maximize my screen
		driver.manage().window().maximize();;
		driver.get(url);
		return driver;
	}
}
