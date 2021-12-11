package gb.ru.lesson.Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddCustomerTest {

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
    void addCustomerTest() {
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");  //todo открыть

        webDriver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click(); //todo нажать кнопку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы
        webDriver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click(); //нажать кнопку
        webDriver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hermione"); //todo Ввести данные
        webDriver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Granger");//Ввести данные
        webDriver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("1234");//Ввести данные
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();//нажать кнопку
    }
}
