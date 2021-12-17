package pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String login = "6317985@mail.ru";
    public String password = "123456qwerty";
    public static final By loginInput = By.xpath(".//input[@id='login']");
    public static final By passwordInput = By.xpath(".//input[@id='password']");
    public static final By loginButton = By.xpath(".//button[@type='submit']");

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    }




