package learntesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class first extends BaseTest {
    @Test
    public void verifyLogin() throws Throwable {
        driver.get("https://ui.portalqa.exostartest.com/iamui/mfa/userReference");  // driver is now initialized
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@data-placeholder='Email Address or User ID']")).sendKeys("bishtt_4356");
        driver.findElement(By.xpath("//span[contains(text(),'NEXT')]")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys("Jai_mata_di@1234");
        driver.findElement(By.xpath("//span[contains(text(),'NEXT')]")).click();

    }
}
