package UtilityAmazonPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  BaseClass{

public static WebDriver driver;
public static Properties prop;

public BaseClass() {
	try {
		FileInputStream fls =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ConfigAmazonPkg\\Config.properties");
prop = new Properties();
prop.load(fls);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
 public void initbrowser () {
	
String browserSet =	prop.getProperty("Browser");
if (browserSet.equals("Edge")){
	WebDriverManager.edgedriver().setup();
	
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	

	 else if( browserSet.equals("FireFox"));
		 
				
			
	}
		 public static void lunchURL(String URL) {
				driver.get( prop.getProperty("URL"));
				}
				
					
				
			}

	

	


	




	 

