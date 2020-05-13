import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin {
    public static WebElement userName(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//form[@id='logonForm']//input[@id='username']"));
        return element;
    }
    public static WebElement password(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='password']"));
        return element;
    }
    public static WebElement login(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//a[@id='formSubmitButton']"));
        return element;
    }

}
