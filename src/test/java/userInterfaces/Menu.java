package userInterfaces;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import tests.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
        private WebDriver driver;

        public Menu(WebDriver driver) {
            this.driver = driver;
        }

        public void clickContact () {driver.findElement(By.cssSelector("[aria-label=\"contact\"]")).click();}
        public void clickSubmit() {
        WebElement submitButton = driver.findElement(By.cssSelector("[aria-label='submit']"));
        if (submitButton != null) {
            submitButton.click();
        } else {
            throw new NotFoundException();
        }
    }
    public void clickClear() {
        WebElement clearButton = driver.findElement(By.cssSelector("[aria-label='clear']"));
        if (clearButton != null) {
            clearButton.click();
        } else {
            throw new NotFoundException();
        }
    }
        public void clickPlanet () {
            driver.findElement(By.cssSelector("[aria-label='planets']")).click();
        }
        public void clickHome () {
            driver.findElement(By.cssSelector("[aria-label='home']")).click();
        }

}