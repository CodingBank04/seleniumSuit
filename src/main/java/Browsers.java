import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
    public WebDriver invokeBrowsers(){
        //System.setProperty("webdriver.chrome.driver","/Users/vahit.peker/Desktop/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        return driver;
    }
}
