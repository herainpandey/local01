package amazonTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.CustomerPage;
import pageObject.Home;
import pageObject.Loginpage;
import pageObject.SearchPage;
import resources.Base;

import java.io.IOException;
import java.util.List;

public class AmazonLogin extends Base
{
    Home p;
    Loginpage lp;
    CustomerPage cp;

    @Test
    public void validateAmazonLogin() throws IOException {
       driver = initializeDriver();
       driver.get("https://www.amazon.in/");
       //System.out.println(driver.getTitle());

        //navigate to sign in
        p = new Home(driver);
        p.getlogin().click();

        //Enter detail and login
        String username = pr.getProperty("username");
        String password = pr.getProperty("password");

        //user name enter and click on continue button
        lp = new Loginpage(driver);
        lp.setUserdetail().sendKeys(username);
        lp.clickContinue().click();

        //enter password and logig
        lp.enterPassword().sendKeys(password);
        lp.clickSignin().click();

        //fetch userdetail and check
        cp=new CustomerPage(driver);
        System.out.println(cp.getUserdetail().getText());

        String actualResult= cp.getUserdetail().getText();
        String expectedText= "Hello";
        Assert.assertTrue(actualResult.contains(expectedText),"Not log in");
    }

    @Test
     public void addProductToCart() throws IOException {
        validateAmazonLogin();

        //Search product and hit enter
        cp.searchProduct().sendKeys(pr.getProperty("product"));
        cp.searchProduct().sendKeys(Keys.ENTER);

        //Scroll till element found and click on it
        SearchPage sp = new SearchPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",sp.getElement());

        if(sp.getElement().getText().equals("GUBB USA Paddle Hair Brush Straightener For Women & Men Professional Hair Styling (Vogue Range) Large"))
        {
            System.out.println(sp.getElement().getText());
            sp.getElement().click();
        }
        else{
            Assert.fail("Element not foud");
        }

        //Click on add to cart buttom

    }
    }
