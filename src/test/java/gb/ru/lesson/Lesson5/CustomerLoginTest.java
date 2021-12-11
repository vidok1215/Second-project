package gb.ru.lesson.Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CustomerLoginTest {
    WebDriver webDriver;
    WebDriverWait webDriverWait;




    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriver = (WebDriver) new WebDriverWait(webDriver, 6);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }

    @Test
    void customerLoginTest() throws InterruptedException {

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");  //todo открыть

        webDriver.findElement(By.xpath("//button[normalize-space()='Customer Login']")).click(); //todo нажать кнопку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы

        Select dropdown = new Select(webDriver.findElement(By.xpath("//select[@id='userSelect']"))); //todo выбрать из выпадающего меню
        dropdown.selectByVisibleText("Harry Potter"); //todo выбор из выпадающего меню

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы

        webDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы
        webDriver.findElement(By.xpath("//button[normalize-space()='Deposit']")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("999");
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        webDriver.findElement(By.xpath("//button[normalize-space()='Withdrawl']")).click();
        //        ожидания полной загрузки страницы — pageLoadTimeout();
//        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("999");
//        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        Thread.sleep(4000);
        webDriver.findElement(By.xpath("//button[normalize-space()='Withdraw']")).click();

    }
}
