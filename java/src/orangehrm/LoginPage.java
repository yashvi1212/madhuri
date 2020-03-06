package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","C:/Users/monohar/Downloads/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingmasters.com/hrm");
		
		//login page
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//driver.findElement(By.name("txtUsername']")).sendKeys("user02);
	    //driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
	    //driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user02");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("TM1234");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    //Mouseover to Leave
	    
	    Actions act=new Actions(driver);
	    WebElement Leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
	    act.moveToElement(Leave).build().perform();
	    
	    //click on apply button under Leave tab
	    
	    driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
	    
	   // Select Leavetype=new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
	   // Leavetype.selectByVisibleText("Personal Leave");
	     
	               // or
	    
	  driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']//following-sibling::option[@value='2']")).click();
	  
	  driver.findElement(By.xpath("//div[@id='applyleave_leaveBalance']"));
	  WebElement FromDate=driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
	  FromDate.click();
	//driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//following-sibling::option[@value='3']")).click();
	//driver.findElement(By.xpath("//select[@class='ui-datepicker-year']//following-sibling::option[@value='2020']")).click();
	//  String dateValue = driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-today')]/a")).getText();
	driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-today')]/a")).click();
	
	WebElement ToDate=driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
	ToDate.click();
	
	driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-today')]/following::td[1]/a")).click();
	
	//.driver.findElement(By.xpath(""))

     WebElement PartialDays= driver.findElement(By.xpath("//select[@id='applyleave_partialDays']//following-sibling::option[@value='all']")); 
     PartialDays.click();
     WebElement Duration;
    driver.findElement(By.xpath("//select[@id='applyleave_firstDuration_duration']//following-sibling::option[@value='half_day']")).click();
    driver.findElement(By.xpath("//select[@id='applyleave_firstDuration_ampm']//following-sibling::option[@value='PM']")).click();
    
    WebElement Comment=driver.findElement(By.xpath("//textarea[@id='applyleave_txtComment']"));
    Comment.sendKeys("asdghiolsdfghj");
    
    WebElement Apply=driver.findElement(By.xpath("//input[@id='applyBtn']"));
    Apply.click(); 
}
}
