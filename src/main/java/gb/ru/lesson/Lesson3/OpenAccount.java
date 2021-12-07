package gb.ru.lesson.Lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class OpenAccount {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы

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







        Thread.sleep(10000); //todo таймер ожидания

        webDriver.quit(); //todo выход

    }
}
