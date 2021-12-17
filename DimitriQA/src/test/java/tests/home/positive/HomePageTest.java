package tests.home.positive;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.home.HomePage;
import tests.base.BaseTest;
import java.util.UUID;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @Test(priority = 2)
    @Description("Verify the home page after login is displayed successfully")
    @Epic("EPAM002")
    @Feature("Home page")
    @Story("As user I want to see a main page after successful logging")
    @Step("1. Type positive login credentials. 2. Type positive password credentials. 3. Click the 'Login' button. 4. Add new comment on a home page.")
    @Severity(SeverityLevel.CRITICAL)
    public void addNewCommentTest() {
        HomePage.ADD_BUTTON.click();
        String testText = UUID.randomUUID().toString();
        HomePage.EDITABLE_AREA.sendKeys(testText);
        HomePage.HOME_BUTTON.click();
    }
}
