package Stratos_testBase;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;

import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import Stratos_utilities.Utils;


public class PageBase {
	public static WebDriver driver;
	public static String sBrowserName;
	public static String sBrowserVersion;
	
	public static WebDriver OpenBrowser(String BrowserType) {
	sBrowserName= Utils.getFileProperty(BrowserType);
	try {
		if(sBrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			Map<String, Object> chromeprefs = new HashMap<String, Object>();
			chromeprefs.put("profile.default_content_settings.popups", 0);
			chromeprefs.put("download.default_directory",  System.getProperty("user.dir")+"\\TestData\\downloadFiles");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.setExperimentalOption("prefs", chromeprefs);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
		}else if(sBrowserName.equalsIgnoreCase("Edge")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory",  System.getProperty("user.dir")+"\\WinDeedData\\Downloads");
			EdgeOptions options = new EdgeOptions();
	        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	        options.addArguments("--remote-allow-origins=*");
	        options.setCapability("ignore-certificate-errors", true);
	        System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}else if(sBrowserName.equalsIgnoreCase("Firefox")) {
			Logs.info("Launch the firefox browser");
			FirefoxOptions firefoxoptions= new FirefoxOptions();
			firefoxoptions.setAcceptInsecureCerts(true);
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("layout.css.devPixelsPerPx", "0.8");
			profile.setPreference("pdfjs.disabled", true);
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", System.getProperty("user.dir")+"\\WinDeedData\\Downloads");
			firefoxoptions.setProfile(profile);
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
	}catch(Exception e) {
		
			System.out.println("Error in Launching Browser"+e.toString());
			ExceptionHandling.HandleAssertion("Failed to Launch Browser"+e.toString());
		}
	
	
	
	return driver;
	
}

public static WebDriver tearDown() {
	
	try {
		driver.quit();
	}catch(Exception e) {
		ExceptionHandling.HandleAssertion("Failed to Close Browser "+e.toString());
	}
	return driver;
	
}
}
