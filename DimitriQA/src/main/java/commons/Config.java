package commons;

public class Config {

    /**
     * Specify the browser name and operating system for tests:
     * CHROME_WINDOWS
     * FIREFOX_WINDOWS
     * EDGE_WINDOWS
     * OPERA_WINDOWS
     * HTML_UNIT
     **/
    public static final String PLATFORM_AND_BROWSER = "EDGE_WINDOWS";
    /** Clear all cookies and cache after each interation.*/
    public static final Boolean CLEAR_COOKIES = true;
    /** To keep browser open after all tests.*/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /**
     * To make a screenshot after each test.
     * Screenshots are located at DimitriQA/build/screenshots
     **/
    public static final Boolean MAKE_SCREENSHOT_FOR_ALLURE = true;
    /**
     * After each run the reports and screenshots will be deleted.
     * The target folders for clearing are DimitriQA/build
     * and DimitriQA/../allure-results
     **/
    public static final Boolean CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY = false;

}
