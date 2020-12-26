package resources;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    public Properties pr;

    public WebDriver initializeDriver() throws IOException {
        FileInputStream fr = new FileInputStream("src/main/java/resources/data.properties");
        pr = new Properties();
        pr.load(fr);
        String sr = pr.getProperty("browser");
        System.out.println(sr);

        if(sr.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\IT softwares\\Selenium\\Selenium Browser drivers\\chromedriver.exe");
             driver = new ChromeDriver();
        }
        else if (sr.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","D:\\IT softwares\\Selenium\\Selenium Browser drivers\\geckodriver.exe");
             driver = new FirefoxDriver();
        }
        else {
            System.setProperty("webdriver.IE.driver", "D:\\IT softwares\\Selenium\\Selenium Browser drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
