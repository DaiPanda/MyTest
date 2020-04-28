package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return	driver.findElement(homePageUserName).getText();
    }

}
