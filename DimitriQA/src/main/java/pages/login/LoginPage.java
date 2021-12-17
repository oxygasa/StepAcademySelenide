package pages.login;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    /**
     * List of locators.
     */
    public static final String LOGIN_PAGE_URL = "https://my.monkkee.com/";
    public static final SelenideElement LOGIN_INPUT = $x(".//input[@id='login']");
    public static final SelenideElement PASSWORD_INPUT = $x(".//input[@id='password']");
    public static final SelenideElement LOGIN_BUTTON = $x(".//button[@type='submit']");
    public static final SelenideElement FEED_THE_MONKKEE_CANCEL_BUTTON = $(By.linkText("Close"));
    /**
     * Change a login and password if you need another credentials.
     */
    public static final String LOGIN_VALUE = "6317985@mail.ru";
    public static final String PASSWORD_VALUE = "123456qwerty";


    /**
     * The method clears a text field before typing.
     * The method fills login and password fields.
     **/
}