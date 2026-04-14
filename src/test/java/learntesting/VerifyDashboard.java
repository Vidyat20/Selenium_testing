package learntesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VerifyDashboard extends BaseTest{
	
	
	
	@Test
public void verifymenus () throws Throwable {
		verifyLogin();
		Thread.sleep(30000);
	driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).isDisplayed();
	System.out.println("dashboard is verified");
	
}
//	@Test
//public void elevate_creadentials() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='nnl_iframe']")));
//		driver.switchTo().frame("nnl_iframe");
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement elevate_creds = wait1.until(
//		    ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Elevate Credential Strength')]"))
//		);
//		elevate_creds.click();
//	
//	//verify Two-step verification text
//	WebElement twostep = driver.findElement(By.xpath("//div/h2[contains(text(),'Two-Step Verification')]"));
//			twostep.getText();
//			System.out.println(twostep);
//    //verify send text radio button is selected by default
//			WebElement verify_sendtext = driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-0']"));
//			verify_sendtext.isSelected();
//			if(verify_sendtext.isSelected()) {
//				System.out.println("Send text radio button is selected");
//			}else {
//				System.out.println("Send text radio button is not selected");
//				WebElement Select_sendtext = driver.findElement(By.xpath("//input[@id='mat-radio-0-input']"));
//				Select_sendtext.click();
//			}
//    WebElement Click_on_send = driver.findElement(By.xpath("//span[normalize-space()='SEND']"));
//    Click_on_send.click();
//    WebElement Enter_PhoneOTP = driver.findElement(By.xpath("//input[@autocomplete='PhoneOTP']"));
//    Enter_PhoneOTP.sendKeys("11111111");
//    System.out.println("elevate credentials page");
//    
	
//}


}
