
import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Properties;

public class uniCourtSearchTest {
    BaseTest basePage;
    Properties prop;
    WebDriver driver;

    HomePage homePage;
    @BeforeTest
    void setup() {
        basePage = new BaseTest();
        driver = basePage.setUpTest();
        homePage= new HomePage(driver);
    }


    @Test(description = "Search Google Text")
    public void SearchGoogleTest(){

        homePage.doSearch("Google");
        boolean isPresent = homePage.isSearchOccurrencePresent("Google");
        System.out.println(isPresent);
        Assert.assertEquals(isPresent,true,"Google Keyword is not present");
    }

}
