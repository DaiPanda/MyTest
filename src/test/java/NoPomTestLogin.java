import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class NoPomTestLogin {
    @Test
    public void test_Home_Page_Appear_Correct(){
        System.setProperty("webdriver.gecko.driver", "E:\\FileRecv\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
        //Find user name and fill user name ①使用id选择器
        driver.findElement(By.id("uid")).sendKeys("admin");
        //find password and fill it ②使用name使用来定位
        driver.findElement(By.name("passw")).sendKeys("admin");
        //click login button
        driver.findElement(By.name("btnSubmit")).click();
        String homeText = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2")).getText();
        //verify login success
        Assert.assertTrue(homeText.contains("Congratulations!"));
        Assert.assertFalse(homeText.contains("我是一只熊"));
        /*
        * 测试其它元素信息是否正确
         * */
        String welcome = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1")).getText();
        Assert.assertTrue(welcome.contains("Hello Admin User"));
        Assert.assertFalse(welcome.contains("I am a human"));
        driver.findElement(By.id("btnGetAccount")).click();
    }
    @Test
    public void test_Home_Page_Appear_Correct2(){
//        System.setProperty("webdriver.gecko.driver", "E:\\FileRecv\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
        //Find user name and fill user name ①使用id选择器
        driver.findElement(By.id("uid")).sendKeys("admin");
        //find password and fill it ②使用name使用来定位
        driver.findElement(By.name("passw")).sendKeys("error");
        //click login button
        driver.findElement(By.name("btnSubmit")).click();
        String homeText = driver.findElement(By.id("_ctl0__ctl0_Content_Main_message")).getText();
        System.out.print(homeText);
        Assert.assertTrue(homeText.contains("Failed"));
    }
    @Test
    public void test_Home_Page_Appear_Correct3(){
//        System.setProperty("webdriver.gecko.driver", "E:\\FileRecv\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
        //Find user name and fill user name ①使用id选择器
        driver.findElement(By.id("uid")).sendKeys("error");
        //find password and fill it ②使用name使用来定位
        driver.findElement(By.name("passw")).sendKeys("admin");
        //click login button
        driver.findElement(By.name("btnSubmit")).click();
        String homeText = driver.findElement(By.id("_ctl0__ctl0_Content_Main_message")).getText();
        System.out.print(homeText);
        Assert.assertTrue(homeText.contains("Failed"));
    }
}
