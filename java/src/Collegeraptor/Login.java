package Collegeraptor;

import java.awt0.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot rob = new Robot();
		System.setProperty("WebDriver.Chrome.driver","C:/Users/monohar/Downloads/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.collegeraptor.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Actions act=new Actions(driver);
		WebElement findclgs=driver.findElement(By.xpath("//a[@class='trans-menu-item-text']"));
		act.moveToElement(findclgs).perform();
		
		
		WebElement clgsrch=driver.findElement(By.xpath("//img[@data-src='/Content/raptor/images/menu/college-search.png']"));
		
		/*Actions xAct = new Actions(driver);
		xAct.moveToElement(clgsrch).build().perform();
		clgsrch.click();*/
		
		
		if(clgsrch.isDisplayed()){
		act.moveToElement(clgsrch).click().perform();
		}
		else
		{
			act.moveToElement(findclgs).perform();
			act.moveToElement(clgsrch).click().perform();
		
		
		//rob.keyPress(KeyEvent.VK_END);
		//rob.keyRelease(KeyEvent.VK_END);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2000)", "");
	
		/*WebDriverWait wait =new WebDriverWait(driver, 10);
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("//input[@id='chkAccept1']")));
		checkbox.click();*/
		
	    //WebElement checkbox=driver.findElement(By.xpath("//input[@id='chkAccept1']"));
       // checkbox.click();
		
		//WebElement getstarted=driver.findElement(By.xpath("//button[@id='btnSubmit1']"));
		//getstarted.click();
		
		
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
		//js1.executeScript("window.scroll(0, -2000)", "");
		
		//rob.keyPress(KeyEvent.VK_HOME);
		//rob.keyRelease(KeyEvent.VK_HOME);
	
		//	driver.findElement(By.xpath("//div[@id='heapbox_CollegeApplyCount']"));
     //  driver.findElement(By.xpath("//div[@id='heapbox_CollegeApplyCount']//a[@rel='15']")).click();
	}

}
}

