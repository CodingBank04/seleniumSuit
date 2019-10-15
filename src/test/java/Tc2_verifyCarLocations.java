import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
public class Tc2_verifyCarLocations {
        public static void main(String[] args) throws InterruptedException, IOException {
            Browsers myBrowser = new Browsers();
            WebDriver driver = myBrowser.invokeBrowsers();
            File file = new File("/Users/vahit.peker/Desktop/TestCases/DataSource.xlsx");
            FileInputStream fs = new FileInputStream(file);
            System.out.println(1);
            XSSFWorkbook wb = new XSSFWorkbook(fs);
            System.out.println(2);
            XSSFSheet sh = wb.getSheet("Input");
            System.out.println(3);
            int rowCount = sh.getLastRowNum();
            System.out.println(4);
            for (int i = 1; i < rowCount + 1; i++) {
                System.out.println(5);
                Row rw = sh.getRow(i);
                System.out.println(6);
                Cell location = rw.getCell(0);
                System.out.println(7);
                Cell date1 = rw.getCell(1);
                System.out.println(8);
                Cell date2 = rw.getCell(2);
                System.out.println(9);
                Cell carCounts = rw.getCell(3);
                System.out.println(10);
                Cell expectedCounts = rw.getCell(4);
                System.out.println(11);
                driver.get("http://www.kayak.com");
                System.out.println(12);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                System.out.println(13);
                driver.findElement(By.cssSelector("a[aria-label='Cars']")).click();
                Thread.sleep(1000);
                System.out.println(14);
                driver.findElement(By.xpath("//div[contains(@id,'pickup-display')]/div")).click();
                System.out.println(15);
                Thread.sleep(1000);
                System.out.println(16);
                driver.findElement(By.xpath("//input[@aria-label='Pick-up location']")).sendKeys(location.getStringCellValue());
                Thread.sleep(1000);
                System.out.println(17);
                driver.findElement(By.xpath("//input[@aria-label='Pick-up location']")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                System.out.println(18);
                driver.findElement(By.cssSelector("div[id*='dateRangeInput-display-start-inner']")).click();
                Thread.sleep(1000);
                System.out.println(19);
                driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).clear();
                Thread.sleep(1000);
                System.out.println(20);
                String pattern = "MM/dd/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String fakeDate1 = simpleDateFormat.format(date1.getDateCellValue());
                String fakeDate2 = simpleDateFormat.format(date2.getDateCellValue());
                driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(fakeDate1);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                System.out.println(21);
                driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).clear();
                System.out.println(22);
                driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(fakeDate2);
                Thread.sleep(1000);
                System.out.println(23);
                driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                System.out.println(24);
                double countCars = carCounts.getNumericCellValue();
                double excelValue = expectedCounts.getNumericCellValue();
                Cell result = rw.createCell(5);
                if (countCars > excelValue) {
                    result.setCellValue("passed");
                }
                else {
                    result.setCellValue("failed");
                }
                fs.close();
                FileOutputStream fos = new FileOutputStream(file);
                wb.write(fos);
                fos.close();

            }
        }}