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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myMenu.clickSides();

    }

}
