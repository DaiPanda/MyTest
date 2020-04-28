package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2")
    WebElement homePageUserName;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getHomePageDashboardUserName(){
        return	homePageUserName.getText();
    }
}
