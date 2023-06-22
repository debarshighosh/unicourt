package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//input[@id='query']" )
    public WebElement searchField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchbtn;

    public void doSearch(String query){
        searchField.sendKeys(query);
        searchbtn.click();
    }

    public boolean isSearchOccurrencePresent(String value){
        String pageSource = driver.getPageSource();
        if(pageSource.contains(value)){
            System.out.println(value +" keyword is present");
            return true;
        }
        System.out.println(value +" keyword is not present");
        return false;
    }


}
