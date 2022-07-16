package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Enter {
    public WebDriver driver;
    public Enter(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void login(String lg) throws InterruptedException {
        WebElement enterLogin =driver.findElement(By.xpath("//*[@id=\"email\"]"));

        enterLogin.sendKeys(lg);
    }
    public void password(String ps) throws InterruptedException {
        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

        enterPassword.sendKeys(ps);
    }
    public void enterBtn() throws InterruptedException {
        WebElement enterKeys = driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]"));
        enterKeys.click();

    }
    public void checkError(String errorXpass) throws InterruptedException {
        WebElement checkErr = driver.findElement(By.xpath(errorXpass));
        checkErr.isDisplayed();


    }

}



