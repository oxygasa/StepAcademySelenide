package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import static commons.Config.*;
import static com.codeborne.selenide.Selenide.screenshot;
public class CommonActions {
    /** All changes must be provided only in src/main/java/commons/Config*/
    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.browser = BROWSER_NAME;
    }

    public void doScreenshotDirectoryChanging() {
        if (CHANGE_SCREENSHOT_DIRECTORY)
            Configuration.reportsFolder = SCREENSHOTS_FOLDER;
    }

    public void makeScreenshotAlwaysTrigger() {
        if (MAKE_SCREENSHOTS_ALWAYS) {
            Date date = new Date();
            String pngFileName = screenshot("test_screenshot");
            String currentTime = String.valueOf(date.getTime());
            File screenshotAsBase64 = Selenide.screenshot(OutputType.FILE);
        }
    }

    public void clearAllReportsTrigger() throws IOException {
        File allureResultFolder = new File(".allure-results");
        File SelenideReportFolder = new File(".build/reports");
        if (allureResultFolder.isDirectory() || SelenideReportFolder.isDirectory() && CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY) {
            FileUtils.deleteDirectory(new File(String.valueOf(allureResultFolder)));
            FileUtils.deleteDirectory(new File(String.valueOf(SelenideReportFolder)));
        }
    }

    public void clearCookiesTrigger() {
        if (CLEAR_COOKIES) {
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.sessionStoreage.clear()");
            } catch (Exception e) {
                System.out.println("Fail to to clearCookiesAndLocalStorage()" + e);
            }
        }
    }
}
