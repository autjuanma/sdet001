package com.challenge.beta_x.utils.drivertemplate;

import static com.challenge.beta_x.utils.drivertemplate.DriverType.CHROME;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver getBrowser() {

		WebDriver midriver = null;
//		String browserName = System.getProperty("browser", DriverType.FIREFOX.toString()).toUpperCase();
		String browserName = System.getProperty("browser", CHROME.toString()).toUpperCase();
		DriverType driverType = DriverType.valueOf(browserName);

		switch (driverType) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			midriver = new ChromeDriver(getChromeOptions());
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			midriver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			midriver = new EdgeDriver();
			break;
		case IE:
			WebDriverManager.iedriver().setup();
			midriver = new InternetExplorerDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			midriver = new ChromeDriver();
			break;
		}
		midriver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		return midriver;
	}

	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--remote-allow-origins=*");

		return options;
	}

}
