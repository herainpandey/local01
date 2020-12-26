package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }


    By container= By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span\n");


    public WebElement getElement(){
        return driver.findElement(container);
    }


}
