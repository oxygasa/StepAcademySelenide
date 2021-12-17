package pages.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {


    /*** The method to navigate to specific url address. **/
    public void goToUrl(String url) {
        open(url);
    }
    public SelenideElement find(SelenideElement element){
        return element;
    }

    /**
     * The method clears a text field before typing.
     * The method fills a text field via typed text.
     **/
    public void clearAndType(SelenideElement element, String value){
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys((value));
    }
}