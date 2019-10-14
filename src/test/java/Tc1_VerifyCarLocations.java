import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tc1_VerifyCarLocations {

    public static void main(String[] args) throws InterruptedException, IOException {
        Browsers myBrowser= new Browsers();
        WebDriver driver=myBrowser.invokeBrowsers();
        File file =new File("/Users/vahit.peker/Desktop/TestCases/DataSource.xlsx");
        FileInputStream fs=new FileInputStream(file);
        System.out.println(1);
        XSSFWorkbook wb =new XSSFWorkbook(fs);
        System.out.println(2);
        XSSFSheet sh=wb.getSheet("Input");
        System.out.println(3);


        int rowCount=sh.getLastRowNum();
        for (int i=1; i<rowCount ;i++){

        Row rw=sh.getRow(i);
        Cell location =rw.getCell(0);
            System.out.println(1);
            Cell date1=rw.getCell(1);
            System.out.println(1);
            Cell date2=rw.getCell(2);
            System.out.println(1);
            Cell carCount=rw.getCell(3);
            System.out.println(1);
            Cell expectedCounts=rw.getCell(4);
            System.out.println(1);


            driver.get("https://www.kayak.com");
            System.out.println(1);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.cssSelector("a[aria-label='Cars']")).click();
       Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@id,'pickup-display')]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Pick-up location']")).sendKeys(location.getStringCellValue());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Pick-up location']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='dateRangeInput-display-start-inner']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).clear();
        Thread.sleep(1000);
            String pattern ="MM-dd-yyyy";
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
            String fakeDate1=simpleDateFormat.format(date1.getDateCellValue());
            String fakeDate2=simpleDateFormat.format(date2.getDateCellValue());
        driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(fakeDate1);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='pickup-date-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).clear();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(fakeDate2);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[id*='dropoff-date-input']")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("input[aria-label='Enter your email address']")).click();
        driver.findElement(By.cssSelector("input[aria-label='Enter your email address']")).sendKeys("150");

        //String count =driver.findElement(By.cssSelector("input[aria-label='Enter your email address']")).getText();
        //System.out.println("count" +count);

        double countCars=carCount.getNumericCellValue();
        double excelValue=expectedCounts.getNumericCellValue();
        Cell result=rw.createCell(5);
        if (countCars>excelValue){
            //write to excel file passed
            result.setCellValue("passed");

        }
         else {
             //write to excel file failed
              result.setCellValue("failed");

        }
         fs.close();
            FileOutputStream fos=new FileOutputStream(file);
            wb.write(fos);
            fos.close();

    }

}}
