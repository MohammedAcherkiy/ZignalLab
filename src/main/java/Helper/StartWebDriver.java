package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartWebDriver {
	
	public static WebDriver driver = null;
	
	
	
	@BeforeSuite
	public void SetUp(){
		try {
			
			ReadConfigPropertiesFile file = new ReadConfigPropertiesFile();
			
			if("firefox".equalsIgnoreCase(file.getBrowser())){
				driver =  new FirefoxDriver();
			}else if ("chrome".equalsIgnoreCase(file.getBrowser())){
				System.setProperty("webdriver.chrome.driver","/Users/mohammedacherkiy/Downloads/chromedriver");
				driver =  new ChromeDriver();
			}else if ("safari".equalsIgnoreCase(file.getBrowser())){
				driver =  new SafariDriver();
			}else{
				
				driver =  new HtmlUnitDriver();
			}
			
			driver.get(file.getUrl());
			
			
			
		}catch(Exception e ){
			
			e.printStackTrace();
			
			
		}
	
		
	}
	
	
	@AfterSuite(alwaysRun =true)
	public void TearDown(){
		try{
			
			driver.close();
			driver.quit();
			if(driver!=null)
				driver =null;
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		

}
