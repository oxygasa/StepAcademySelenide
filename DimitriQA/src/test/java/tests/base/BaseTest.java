package tests.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import pages.base.BasePage;

public class BaseTest extends BasePage {
    /**
     * Here is a class for general actions which are applicable for every page.
     **/


    /**
     * The method clears a text field before typing.
     * The method fills a text field via typed text.
     **/
    public void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys((value));
    }
}
