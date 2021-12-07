package gb.ru.lesson.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AddCustomer {
    public static void main( String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы

//        ожидания полной загрузки страницы — pageLoadTimeout();
//        ожидания появления элемента на странице — implicitlyWait();
//        ожидания выполнения асинхронного запроса — setScriptTimeout();

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");  //todo открыть

        webDriver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click(); //todo нажать кнопку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы
        webDriver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click(); //нажать кнопку
        webDriver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hermione"); //todo Ввести данные
        webDriver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Granger");//Ввести данные
        webDriver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("1234");//Ввести данные
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();//нажать кнопку

//        Actions actions = new Actions(webDriver);
//        actions.moveToElement(webDriver.findElement(By.xpath("....."))).build().perform(); //todo Навести мышку на элемент

//        new WebDriverWait(webDriver, 10, 500)
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("ваш xpath")))
//                .click();  //todo ожидать пока не появится элемент



        Thread.sleep(10000); //todo таймер ожидания

        webDriver.quit(); //todo выход


    }
}
