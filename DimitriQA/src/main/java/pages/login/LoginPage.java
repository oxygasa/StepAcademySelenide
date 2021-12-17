package pages.login;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    /** List of locators.*/
    public static final String LOGIN_PAGE_URL = "https://my.monkkee.com/";
    public static final SelenideElement LOGIN_INPUT = $x(".//input[@id='login']");
    public static final SelenideElement PASSWORD_INPUT = $x(".//input[@id='password']");
    public static final SelenideElement LOGIN_BUTTON = $x(".//button[@type='submit']");

    /** Change a login and password if you need another credentials.*/
    private String login = "6317985@mail.ru";
    private String password = "123456qwerty";


    /**
     * The method clears a text field before typing.
     * The method fills login and password fields.
     **/
    public void  typeLoginPasswordAndSubmit (String login, String password){
        clearAndType(LOGIN_INPUT,login);
        clearAndType(PASSWORD_INPUT,password);
        PASSWORD_INPUT.pressEnter();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}