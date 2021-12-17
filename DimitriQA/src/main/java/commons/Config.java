package commons;

public class Config {
    /**
     * Change the browser name for cross browser testing. Available:
     * chrome
     * firefox
     * ie
     * edge
     * opera
     **/
    public static final String BROWSER_NAME = "chrome";
    /** Clear all cookies and cache after each interation.*/
    public static final Boolean CLEAR_COOKIES = false;
    /** To keep browser open after all tests.*/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /**
     * Selenide makes screenshots automatically after tests fail.
     * Screenshots of the failed tests are located ./build/reports by default
     * Screenshots path can be changed here.
     **/
    public static final Boolean MAKE_SCREENSHOTS_ALWAYS = true;
    public static final Boolean CHANGE_SCREENSHOT_DIRECTORY = false;
    public static final String SCREENSHOTS_FOLDER = "./Dimitri/screenshots";

    /**
     * Before each run the reports and screenshots can stay deleted.
     * ".build/reports" and .DimitriQA/../allure-results
     **/
    public static final Boolean CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY = false;
}
