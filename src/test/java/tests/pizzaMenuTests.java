package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import tests.BaseTests;
import userInterfaces.Menu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.TimeUnit;

public class pizzaMenuTests extends BaseTests {
    @Test
    public void sidesVerification(){
        var myMenu = new Menu(driver);
        myMenu.clickMenu();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        myMenu.clickSides();
        var headings3 = driver.findElements(By.tagName("h3"));
        WebElement chunkkychips = null;
        for (WebElement food : headings3) {
            if (food.getText().contains("chunky")) {
                chunkkychips = food;
                break;
            }
           var chippyText = food.getText();
            Assertions.assertNotNull(chippyText);
            var kjs = driver.findElement(By.tagName("p"));
            Assertions.assertEquals("3273 kj",kjs);
        }
    }
}
