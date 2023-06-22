package Base;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public WebDriver setUpTest() {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://unicourt.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            return driver;
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}