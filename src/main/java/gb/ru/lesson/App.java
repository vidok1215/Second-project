package gb.ru.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://crm.geekbrains.space/"); //открыть

        webDriver.manage().window().setSize(new Dimension(900, 800)); //разрешение

        System.out.println(webDriver.getCurrentUrl()); //получить урл

//        webDriver.findElement(By.xpath());


        Thread.sleep(1); //таймер закрытия

        webDriver.quit();//закрыть
    }
}
