package tests.login.positive;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.login.LoginPage;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.*;
import static pages.login.LoginPage.*;


public class LoginPageTest extends BaseTest {

    @Test(priority = 1)
    @Description("Verify the positive data input ends with successful logging into system")
    @Epic("EPAM001")
    @Feature("Login page")
    @Story("As user I want to login into system with my credentials")
    @Step("1. Type positive login credentials. 2. Type positive password credentials. 3. Click the 'Login' button")
    @Severity(SeverityLevel.CRITICAL)

    public void checkIsLoginIsSuccessful() throws InterruptedException {
        open(LoginPage.LOGIN_PAGE_URL);
        LoginPage.LOGIN_INPUT.setValue(LOGIN_VALUE);
        LoginPage.PASSWORD_INPUT.setValue(PASSWORD_VALUE);
        LoginPage.LOGIN_BUTTON.click();
        try {
            HomePage.ADD_BUTTON.equals(HomePage.ADD_BUTTON.shouldBe(Condition.not(Condition.visible)));
        } catch (NoSuchElementException e) {
            Thread.sleep(10000);
            LoginPage.FEED_THE_MONKKEE_CANCEL_BUTTON.shouldBe(Condition.visible);
            LoginPage.FEED_THE_MONKKEE_CANCEL_BUTTON.click();
        } finally {
            Thread.sleep(2000);
            HomePage.ADD_BUTTON.shouldBe(Condition.visible);
        }
    }
}


