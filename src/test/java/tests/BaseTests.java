package tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {
    protected WebDriver driver;

    @BeforeEach
    public void Setup() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();

        driver = new ChromeDriver();
        driver.get("https://d3udduv23dv8b4.cloudfront.net/");
    }

   @AfterEach
    public void Cleanup(){
        if (driver != null){
            driver.quit();
        }
    }
}

