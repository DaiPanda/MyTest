package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(name="uid")
    WebElement userName;

    @FindBy(name="passw")
    WebElement password;

    @FindBy(name="btnSubmit")
    WebElement login;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String username) {
        userName.sendKeys(username);
    }
    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void clickLogin(){
       login.click();
    }
    /**
     * This POM method will be exposed in test case to login in the application
     * @param userName
     * @param password
     * @return
     */
    public void loginToFile(String userName,String password){
        this.setUserName(userName);
        this.setPassword(password);
        this.clickLogin();
    }
}
