package userInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class menuTile {
    private WebElement element;

    public menuTile(WebElement ele)
    {
        this.element = ele;
    }

    public String getMenuItemName() {return element.findElement(By.tagName("h3")).getText();}
    public String getKilojoules()
    {
        return element.findElement(By.tagName("p")).getText();
    }
   // public String getRadius()
    //{
      //  return element.findElement(By.className("radius")).getText();
    //}



}
