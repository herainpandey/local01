package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

public WebDriver driver;

 public Home(WebDriver driver){
     this.driver=driver;

}

By login = By.xpath("//*[@id=\"nav-link-accountList\"]\n");


//Method declaration to return webelement
public WebElement getlogin()
{
    return driver.findElement(login);
}

}
