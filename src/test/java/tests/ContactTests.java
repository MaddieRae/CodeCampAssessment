package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import tests.BaseTests;
import userInterfaces.Menu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.concurrent.TimeUnit;

public class ContactTests extends BaseTests {

    @Test
    public void testFormErrors() {
        var myMenu = new Menu(driver);
        myMenu.clickContact();
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.click();
        email.sendKeys("xxx");

        WebElement telephone = driver.findElement(By.cssSelector("#telephone"));
        telephone.click();
        telephone.sendKeys("xxx");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        myMenu.clickSubmit();

        var emailError = driver.findElement(By.id("email-err"));
        var telephoneError = driver.findElement(By.id("telephone-err"));

        Assertions.assertNotNull(emailError);
        Assertions.assertNotNull(telephoneError);
        myMenu.clickClear();
    }
        public boolean isPopupVisible() {
        Assertions.assertFalse(driver.findElement(By.className("form-error mb-4")).isDisplayed());
            return false;
        }

}