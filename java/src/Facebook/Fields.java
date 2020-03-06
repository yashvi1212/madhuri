package Facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Fields {
	
	//static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/monohar/Downloads/geckodriver.exe");
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("marionatte", false);
		FirefoxOptions opt = new FirefoxOptions();
		opt.merge(dc);*/
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		//WebDriver driver=new FirefoxDriver();
		driver=new FirefoxDriver(options);
		driver.get("https://selenium.dev/downloads/");

	}

}
