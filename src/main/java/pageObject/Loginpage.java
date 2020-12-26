package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebDriver driver;

    public Loginpage(WebDriver driver){
        this.driver=driver;
    }


    By userdetail= By.xpath("//*[@id='ap_email']");
    By clickContinue= By.xpath("//*[@id=\"continue\"]\n");
    By passdetail= By.xpath("//*[@id=\"ap_password\"]\n");
    By clickSignin= By.xpath("//*[@id=\"signInSubmit\"]\n");


    public WebElement setUserdetail(){
        return driver.findElement(userdetail);
    }

    public WebElement clickContinue(){
        return driver.findElement(clickContinue);
    }

    public WebElement enterPassword(){
        return driver.findElement(passdetail);
    }

    public WebElement clickSignin(){
        return driver.findElement(clickSignin);
    }

}
