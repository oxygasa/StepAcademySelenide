package tests.base;
import commons.CommonActions;
import org.testng.annotations.*;
import pages.base.BasePage;
import java.io.IOException;

public class BaseTest extends BasePage {
    /***
     * Here is presented a logic of src/main/java/commons/config triggers.
     * Use src/main/java/commons/config triggers for behaviour changing.
     **/

    CommonActions commonActions = new CommonActions();

    @BeforeTest
    public void clearAllReportsBeforeStartEachTest() throws IOException {
        commonActions.clearAllReportsTrigger();
    }

    @AfterSuite
    public void clearCookiesAndLocalStorageAterSuite() {
        commonActions.clearCookiesTrigger();
    }

    @BeforeTest
    public void changeScreenshotDirectory() {
        commonActions.doScreenshotDirectoryChanging();
    }

    @AfterTest
    public void makeScreenshotAfterEachTest(){
        commonActions.makeScreenshotAlwaysTrigger();
    }
}
