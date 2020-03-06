package Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urllauanch {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=wm&ogbl#inbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Email_textBox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_textBox.sendKeys("madhukarnati1@gmail.com");
		
		WebElement Next_button=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		
		Next_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement psw_textBox=driver.findElement(By.xpath("//input[@type='password']"));
		psw_textBox.sendKeys("hiammanana");
		WebElement Next=driver.findElement(By.id("passwordNext"));
		Next.click();
		 
		
		
		
		
		
		
	}

}
