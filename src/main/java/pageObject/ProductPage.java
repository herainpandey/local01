package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }


    By username= By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span\n");

    By searchProduct= By.xpath("//*[@id=\"twotabsearchtextbox\"]\n");



    public WebElement getUserdetail(){
        return driver.findElement(username);
    }

    public WebElement searchProduct(){
        return driver.findElement(searchProduct);
    }


}
