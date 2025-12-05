package learntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver; // class-level driver

    @BeforeMethod
    public void setUp() throws Throwable {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");

        // WebDriverManager handles correct ChromeDriver version
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }
    public void verifyLogin() throws Throwable {
        driver.get("https://ui.portalqa.exostartest.com/iamui/mfa/userReference");  // driver is now initialized
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@class='mat-mdc-input-element mat-mdc-form-field-input-control mdc-text-field__input ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']")).sendKeys("bishtt_4356");
        driver.findElement(By.xpath("//span[contains(text(),'NEXT')]")).click();
        driver.findElement(By.xpath("//input[@class='mat-mdc-input-element mat-mdc-form-field-input-control mdc-text-field__input ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']")).sendKeys("Jai_mata_di@1234");
        driver.findElement(By.xpath("//span[contains(text(),'NEXT')]")).click();
        try {
            WebElement urgentNotice = driver.findElement(By.xpath("//span[contains(normalize-space(),'Urgent Notice')]"));

            if (urgentNotice.isDisplayed()) {
                driver.findElement(By.xpath("//input[@class='submitButton']")).click();
                System.out.println("Urgent Notice displayed → Clicked OK");
            }
        } catch (Exception e) {
            System.out.println("Urgent Notice not displayed");
        }
    }
    

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}