package tests.home.positive;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.login.LoginPage;
import tests.base.BaseTest;
import java.util.UUID;
import static constants.Constant.Urls.LOGIN_PAGE_URL;
import static pages.login.LoginPage.*;

public class HomePageTest extends BaseTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @Test(priority = 2)
    @Description("Verify the home page after login is displayed successfully")
    @Epic("EPAM002")
    @Feature("Home page")
    @Story("As user I want to see a main page after successful logging")
    @Step("1. Type positive login credentials. 2. Type positive password credentials. 3. Click the 'Login' button. 4. Add new comment on a home page.")
    @Severity(SeverityLevel.CRITICAL)
    public void addNewCommentTest() {
        loginPage = new LoginPage(getDriver());
        loginPage.goToUrl(LOGIN_PAGE_URL);
        loginPage.find(loginInput).sendKeys(loginPage.getLogin());
        loginPage.find(passwordInput).sendKeys(loginPage.getPassword());
        loginPage.find(loginButton).click();
        homePage = new HomePage(getDriver());
        homePage.find(HomePage.addButton).click();
        String testText = UUID.randomUUID().toString();
        homePage.find(HomePage.editableArea).sendKeys(testText);
        homePage.find(HomePage.homeButton).click();
    }


}
