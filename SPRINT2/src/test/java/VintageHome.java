import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
// As an Admin I want to login to Shopizer WebPage

public class VintageHome {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\Users\vinga\WORKSPACE\SELENIUM\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("Admin");
        driver.get("http://localhost:8080/admin/logon.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Admin.userName(driver).sendKeys("admin@shopizer.com");
        Admin.password(driver).sendKeys("password");
        Admin.login(driver).click();
    }
}