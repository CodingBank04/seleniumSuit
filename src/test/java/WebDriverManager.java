import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public static void main(String[] args) {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.opera.driver","/Users/vahit.peker/Desktop/operadriver");
        //OperaOptions operaOptions=new OperaOptions();
        //operaOptions.setBinary("/Users/vahit.peker/Desktop");
        WebDriver driver=new OperaDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumhq.org");


    }

    }

