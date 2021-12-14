package gb.ru.lesson.Lesson6.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import gb.ru.lesson.Lesson6.pages.blocks.HeaderBlock;

public class BasePage extends BaseView {

    @Getter
    private HeaderBlock headerBlock = new HeaderBlock(webDriver);

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }
}
