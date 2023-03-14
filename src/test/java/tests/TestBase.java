package tests;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;

public class TestBase {

	public static WebDriver driver;
	public static Actions action;
	JavascriptExecutor js;
	protected Faker faker = new Faker(new Locale("en-US"));
	String baseUrl = "https://swinji.azurewebsites.net/account/login";
	// Store current project workspace location in a string variable ‘path’
	String workingDir = System.getProperty("user.dir");
	String driverPath = workingDir + "\\drivers\\chromedriver.exe";
	String autoIt = workingDir + "\\drivers\\";

	@BeforeSuite
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\End2EndProjects\\resources\\GlobalData.properties");
		prop.load(fis);

		String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");



		if(browserName.contains("chrome")) {
			//chrome
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		// Object is created- Chrome browser is opened
		driver = new ChromeDriver();
		}
		else if(browserName.contains("firefox")) {
			//firefox
		}
		else if(browserName.contains("edge"))
		{//edge
		
		}
		// maximize browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	@BeforeTest(alwaysRun = true)
	public void launchApplication() throws IOException {

		driver.get("https://swinji.azurewebsites.net");
		

	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.close();
		
	}

}
