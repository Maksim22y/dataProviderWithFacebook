package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static WebDriver driver;
    public static Enter enter;



    @BeforeClass
    void setUp() throws IOException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "\"D:\\chromedriver.exe\"");
        driver.manage().window().maximize();


    }

    @BeforeMethod
    public void sestUp() {
        driver.get("https://uk-ua.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
       driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        enter = new Enter(driver);
    }

    @Test(testName = "Test1",dataProvider = "LoginPass",dataProviderClass =DataProviderClass.class )
    public void testLogin(String lg, String ps, String errorXpass) throws InterruptedException {
//
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(scrFile, new File("D:\\tmp\\screenshot.png"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        enter.login(lg);
        enter.password(ps);
        enter.enterBtn();
        enter.checkError(errorXpass);

    }

}


