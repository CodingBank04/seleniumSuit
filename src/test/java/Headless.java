import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Headless {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--start-maximized", "--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.facebook.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("1");
        driver.findElement(By.id("email")).sendKeys("headless");
        System.out.println("done");


    }
}
