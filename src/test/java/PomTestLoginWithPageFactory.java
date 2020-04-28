import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactory.HomePage;
import pageFactory.Login;

import java.util.concurrent.TimeUnit;

public class PomTestLoginWithPageFactory {
    WebDriver driver;
    Login objLogin;
    HomePage objHomePage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "E:\\FileRecv\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
    }
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        objLogin = new Login(driver);
        objLogin.loginToFile("admin","admin");
        objHomePage = new HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Congratulations!"));
    }
}
