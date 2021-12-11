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

public class OpenAccountTest {

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
    void openAccountTest() {

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");  //todo открыть

        webDriver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click(); //todo нажать кнопку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы
        webDriver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click(); //todo нажать кнопку
//        webDriver.findElement(By.xpath("//select[@id='userSelect']")).click(); //todo нажать кнопку
//        webDriver.findElement(By.xpath("//*[text()='Harry Potter']")).click(); //todo нажать кнопку

        Select dropdown = new Select(webDriver.findElement(By.xpath("//select[@id='userSelect']"))); //todo выбрать из выпадающего меню
        dropdown.selectByVisibleText("Harry Potter"); //todo выбор из выпадающего меню
        Select Dropdown = new Select(webDriver.findElement(By.xpath("//select[@id='currency']"))); //todo выбрать из выпадающего меню
        Dropdown.selectByVisibleText("Dollar"); //todo выбор из выпадающего меню

        webDriver.findElement(By.xpath("//button[normalize-space()='Process']")).click();

    }
}
