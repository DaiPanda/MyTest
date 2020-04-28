package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By userName = By.name("uid");
    By password = By.name("passw");
    By login = By.name("btnSubmit");
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String username) {
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);;
    }
    public void clickLogin(){
        driver.findElement(login).click();
    }
    public void loginToFile(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
}
