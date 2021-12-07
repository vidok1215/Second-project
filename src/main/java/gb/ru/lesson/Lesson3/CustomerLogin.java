package gb.ru.lesson.Lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CustomerLogin {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //todo прогрузка страницы

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


        Thread.sleep(10000); //todo таймер ожидания

        webDriver.quit(); //todo выход

    }
}
